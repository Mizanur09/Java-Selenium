package Healper;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class HealperPage {

	public static WebDriver driver;
	
	public void DriverFucntion() {
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
	
	public void NavigateTo(String URL) {
		
		driver.navigate().to(URL);
		
	}
	
}
