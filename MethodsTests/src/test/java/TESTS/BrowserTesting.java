package TESTS;

import org.junit.Test;

import globalized.GlobalizedAllPage;

public class BrowserTesting extends GlobalizedAllPage { 
	
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
	
	
}
