package TESTS;

import org.junit.Ignore;
import org.junit.Test;

import Globalized.GlobalizedAllPage;

public class BrowserTesting extends GlobalizedAllPage { 
	@Ignore
	@Test
	public void FireFoxBrowser_Test() throws Exception
		{
			FireFoxBrowser();
			lib.PrintString(GetBrowserName() + " OPEING");
			MaximizeTheBrowser();
			DeleteBrowserAllCookies();
			UtilWait.ImplicitWaitTime();
			UtilWait.PageLoadWaitTime();
			NavigateTo(BrowserInfo.URL);
			
			UtilWait.WaitForSeconds(5);
			lib.PrintString(GetBrowserName() + " CLOSING");
			CloseBrowser();
		}
	
	@Ignore
	@Test
	public void ChromeBrowserTest() throws Exception
		{
			ChromeBroser();
			lib.PrintString(GetBrowserName() + " OPEING");
			MaximizeTheBrowser();
			DeleteBrowserAllCookies();
			
			UtilWait.ImplicitWaitTime();
			UtilWait.PageLoadWaitTime();
			
			NavigateTo(BrowserInfo.URL);
			
			UtilWait.WaitForSeconds(5);
			lib.PrintString(GetBrowserName() + " CLOSING");
			CloseBrowser();
		}
	
	@Ignore	
	@Test
	public void IEBrowserTest() throws Exception
		{
			IEBrowser();
			lib.PrintString(GetBrowserName() + " OPEING");
			MaximizeTheBrowser();
			DeleteBrowserAllCookies();
			
			UtilWait.ImplicitWaitTime();
			UtilWait.PageLoadWaitTime();
			
			NavigateTo(BrowserInfo.URL);
			
			UtilWait.WaitForSeconds(5);
			lib.PrintString(GetBrowserName() + " CLOSING");
			CloseBrowser();
		}
@Ignore
	@Test
	public void MicrosoftEdge_BrowserTEst() throws Exception
		{
			MicrosoftEdge();
			lib.PrintString(GetBrowserName() + " OPEING");
			MaximizeTheBrowser();
			DeleteBrowserAllCookies();
			
			UtilWait.ImplicitWaitTime();
			UtilWait.PageLoadWaitTime();
			
			NavigateTo(BrowserInfo.URL);
			
			UtilWait.WaitForSeconds(5);
			lib.PrintString(GetBrowserName() + " CLOSING");
			CloseBrowser();
		}
	@Test
	public void StartBrowserByNameTest() throws Exception {
		StartBrowserByName("Adge");
		lib.PrintString(GetBrowserName() + " OPEING");
		MaximizeTheBrowser();
		DeleteBrowserAllCookies();
		UtilWait.ImplicitWaitTime();
		UtilWait.PageLoadWaitTime();
		NavigateTo(BrowserInfo.URL);
		UtilWait.WaitForSeconds(5);
		lib.PrintString(GetBrowserName() + " CLOSING");
		CloseBrowser();
	}
	
}
