package MethodPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import Healper.HealperPage;

public class FireFox_Browser extends HealperPage {
	
	String GeckoDriver = "webdriver.gecko.driver";
	String GeckoDriverPath = "Browser_Exe_Files/FireFox_GeckoDriver/geckodriver.exe";
	
	public FireFox_Browser Browser_Property() {
		
		System.setProperty(GeckoDriver , GeckoDriverPath);
		driver = new FirefoxDriver();
		
		return this;
	}
	
	public FireFox_Browser StartFirefoxBrowser(String URL) {
		
		System.setProperty(GeckoDriver , GeckoDriverPath);
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.navigate().to(URL);
		return this;
	}
	
	
	
}
