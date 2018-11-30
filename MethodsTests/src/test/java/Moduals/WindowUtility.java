package Moduals;

import org.openqa.selenium.Dimension;

import Healper.DriverUtility;

public class WindowUtility extends DriverUtility {

	public int NumberOfBrowserOpened() {
		return driver.getWindowHandle().length();
	}
	
	public Dimension GetWindowSize() {
		return driver.manage().window().getSize();
	}

	public void SetBrowserSizeTo(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

	public int GetWidthOfCurrentBrowser() {
		return driver.manage().window().getSize().getWidth();
	}

	public int GetHeightOfYourCurrenBrowser() {
		return driver.manage().window().getSize().getHeight();
	}

	public void SetHeightSizeOfCurrentWindow(int height) {
		int width = GetWidthOfCurrentBrowser();
		driver.manage().window().setSize(new Dimension(width, height));
	}

	public void SetWidthSizeOfCurrentWindow(int height) {
		int width = GetHeightOfYourCurrenBrowser();
		driver.manage().window().setSize(new Dimension(width, height));
	}

}
