package TESTS;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import Healper.LibraryUtility;
import globalized.GlobalizedAllPage;

public class FireFox_Browser_Test extends GlobalizedAllPage { 
	
	String URL = "https://www.google.com";
	
	@Before
	public void BeforeTest() {
		lib = new LibraryUtility(driver);
	}
	
	@Ignore
	@Test
	public void FireFoxBrowser_Test() throws Exception
		{
			FireFoxBrowser();
			MaximizeTheBrowser();
			DeleteBrowserAllCookies();
			UtilWait.ImplicitWaitTime();
			UtilWait.PageLoadWaitTime();
			NavigateTo(URL);
			
			UtilWait.WaitForSeconds(5);
			CloseBrowser();
		}
	
	@Ignore
	@Test
	public void ChromeBrowserTest() throws Exception
		{
			ChromeBroser();
			
			MaximizeTheBrowser();
			DeleteBrowserAllCookies();
			
			UtilWait.ImplicitWaitTime();
			UtilWait.PageLoadWaitTime();
			
			NavigateTo(URL);
			
			UtilWait.WaitForSeconds(5);
			
			CloseBrowser();
		}
	
//	@Ignore
	@Test
	public void IEBrowserTest() throws Exception
		{
			IEBrowser();
			
			MaximizeTheBrowser();
			DeleteBrowserAllCookies();
			
			UtilWait.ImplicitWaitTime();
			UtilWait.PageLoadWaitTime();
			
			NavigateTo(URL);
			
			UtilWait.WaitForSeconds(5);
			
			CloseBrowser();
		}
	
}
