package MethodTests;

import org.junit.Test;

import Healper.HealperPage;
import MethodPages.FireFox_Browser;

public class FireFox_Browser_Test extends HealperPage {
    private FireFox_Browser fb = new FireFox_Browser();  
	
	String URL = "Go some where";
	
	@Test
	public void OpenBrowserWithAllInSameMethods()
		{
			fb.StartFirefoxBrowser(URL);
		}
	
	@Test
	public void OpenBrowserWithDiffrentMethods()
		{
			fb.Browser_Property();
			DriverFucntion();
			NavigateTo(URL);
		}
	
}
