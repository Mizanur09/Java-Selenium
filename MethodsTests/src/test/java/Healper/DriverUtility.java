package Healper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility {

	public static WebDriver driver;
	
	public static String GeckoDriver = "webdriver.gecko.driver";
	public static String GeckoDriverPath = "Browser_Exe_Files/FireFox_GeckoDriver/geckodriver.exe";
	
	public void Browser_Property() {
		System.setProperty(GeckoDriver , GeckoDriverPath);
		driver = new FirefoxDriver();	
	}

	public void DeleteBrowserAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public void MaximizeTheBrowser() {
		driver.manage().window().maximize();
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
