package Moduals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Globalized.GlobalizedAllPage;

public class WindowUtility extends GlobalizedAllPage {

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
	
//	public void WaitUntil_(int NumberOfWindowOpen) {
//		WaitUtility.pageWait.until(ExpectedConditions.numberOfWindowsToBe(NumberOfWindowOpen)); // expectedNumberOfWindows
//	}

}
