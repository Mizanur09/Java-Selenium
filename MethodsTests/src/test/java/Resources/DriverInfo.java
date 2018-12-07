package Resources;

import org.openqa.selenium.WebDriver;

public class DriverInfo {

	public static WebDriver driver;

	// Driver Path
		public  String GeckoDriverPath = "Browser_Exe_Files/FireFox_GeckoDriver/geckodriver.exe";
		public  String ChromeDriverPath = "Browser_Exe_Files/ChromeEXE/Chromedriver.exe";
		public  String IEDriverPath = "Browser_Exe_Files/IE_EXE/IEDriverServer.exe";
		public  String AdgeDriverPath = "Browser_Exe_Files/MicrosoftEdge/MicrosoftWebDriver.exe";

//		Driver Name
		public  String GeckoName = "webdriver.gecko.driver";
		public  String ChromeName = "webdriver.chrome.driver";
		public  String IEName = "webdriver.ie.driver";
		public  String AdgeName = "webdriver.edge.driver";

		public String URL = "https://www.google.com";		
}
