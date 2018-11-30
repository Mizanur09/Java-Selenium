package Healper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class DriverUtility {

	public static WebDriver driver;

	public void DriverFucntion() {
		DeleteBrowserAllCookies();
		MaximizeTheBrowser();
		ImplicitWaitTime();
		PageLoadWaitTime();
	}

	public void DeleteBrowserAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public void MaximizeTheBrowser() {
		driver.manage().window().maximize();
	}

	public void ImplicitWaitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void PageLoadWaitTime() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	public void NavigateTo(String URL) {
		driver.navigate().to(URL);
	}

	public void CloseBrowser() {
		driver.close();
	}

	public void QuitBrowser() {
		driver.quit();
	}

	public int GetCookiesSize() {
		return driver.manage().getCookies().size();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
