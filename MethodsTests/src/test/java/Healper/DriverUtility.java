package Healper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtility {

	public static WebDriver driver;

// Driver Path
	public static String GeckoDriverPath = "Browser_Exe_Files/FireFox_GeckoDriver/geckodriver.exe";
	public static String ChromeDriverPath = "Browser_Exe_Files/ChromeEXE/Chromedriver.exe";
	public static String IEDriverPath = "Browser_Exe_Files/IE_EXE/IEDriverServer.exe";

//	Driver Name
	public static String GeckoName = "webdriver.gecko.driver";
	public static String ChromeName = "webdriver.chrome.driver";
	public static String IEName = "webdriver.ie.driver";

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
			System.setProperty(GeckoName, GeckoDriverPath);
			driver = new FirefoxDriver();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}

	public WebDriver ChromeBroser() {
		try {
			System.setProperty(ChromeName, ChromeDriverPath);
			driver = new ChromeDriver();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}

	public WebDriver IEBrowser() { // need to fix this test
		try {
			System.setProperty(IEName, IEDriverPath);
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			driver = new InternetExplorerDriver();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return driver;

	}

}
