package Healper;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Resources.DriverInfo;

public class DriverUtility {
//	%%%%%%%%%%%%%%%%%%%%%%%%%%%% DO NOT TOUCH LINES BELOW %%%%%%%%%%%%%%%%%%%%%%%%%%%
	public static DriverInfo BrowserInfo = new DriverInfo();
	public static WebDriver driver;
	public static LibraryUtility lib;
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//
	
	public String GetBrowserName() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String Platform = cap.getPlatform().toString();
		String Version = cap.getVersion().toString();
		String BrowserName = cap.getBrowserName().toUpperCase();
		return "Platform => (" + Platform + ")  BROWSER Name => '" + BrowserName + "' Version => (" + Version + ")";
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

	public WebDriver FireFoxBrowser() {
		try {
			System.setProperty(BrowserInfo.GeckoName, BrowserInfo.GeckoDriverPath);
			driver = new FirefoxDriver();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}

	public WebDriver ChromeBroser() {
		try {
			System.setProperty(BrowserInfo.ChromeName, BrowserInfo.ChromeDriverPath);
			driver = new ChromeDriver();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}

	public WebDriver IEBrowser() {
		try {
			System.setProperty(BrowserInfo.IEName, BrowserInfo.IEDriverPath);
			driver = new InternetExplorerDriver();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;

	}

	public WebDriver MicrosoftEdge() {
		try {
			System.setProperty(BrowserInfo.AdgeName, BrowserInfo.AdgeDriverPath);
			driver = new EdgeDriver();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;

	}
}
