package Moduals;

import java.util.concurrent.TimeUnit;

import globalized.GlobalizedAllPage;

public class WaitUtility extends GlobalizedAllPage{
	
	public void ImplicitWaitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void PageLoadWaitTime() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

}
