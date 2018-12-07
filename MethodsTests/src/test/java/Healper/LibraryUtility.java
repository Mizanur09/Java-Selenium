package Healper;

import org.openqa.selenium.WebDriver;

import Globalized.GlobalizedAllPage;

public class LibraryUtility extends GlobalizedAllPage{
	private WebDriver driver;
	private boolean isDemoMode = false;

	/***
	 * Constructor of UtilityLibrary class
	 * @param _driver
	 */
	public LibraryUtility(WebDriver _driver) {
		this.driver = _driver;
	}

	/***
	 * Setter for driver
	 * @param _driver
	 */
	public void setDriver(WebDriver _driver) {
		this.driver = _driver;
	}
	
	public void setDemoMode(boolean isDemoMode) {
		this.isDemoMode = isDemoMode;
	}
	
	public LibraryUtility PrintException(Exception exceptionName) {
		PrintString("Error => " + exceptionName.getMessage());
		exceptionName.printStackTrace();
		return this;
	}
	
	public LibraryUtility PrintString(String Value) {
		System.out.println("%%%%%%%%%%%%%% "+ Value+ " %%%%%%%%%%%%%%");
		return this;
	}
	
	
}
