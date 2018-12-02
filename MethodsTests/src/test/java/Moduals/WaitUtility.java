package Moduals;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import globalized.GlobalizedAllPage;

public class WaitUtility extends GlobalizedAllPage {

	public static WebDriverWait wait = new WebDriverWait(driver, 30);

	public void ImplicitWaitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void PageLoadWaitTime() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	public void Pa() throws Exception {
		new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
	}

//	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   //
	/***
	 * Wait 30 SECONDS 
	 */
	public void WaitUntil_AlertIsPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}

	/***
	 * Wait 30 SECONDS 
	 * Visibility Of Element Located
	 */
	public void WaitFor_VisibilityOfElementLocated(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	/***
	 * Wait 30 SECONDS 
	 * Element To Be Clickable
	 */
	public void WaitFor_ElementToBeClickable(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	/***
	 * Wait 30 SECONDS 
	 * Fragment Of Title Match
	 */
	public void WaitUntil_fragmenOftitleMatchs(String fragmenOTitle) {
		wait.until(ExpectedConditions.titleContains(fragmenOTitle));
	}

	/***
	 * Wait 30 SECONDS 
	 * Execute Title Match
	 */
	public void WaitUntil_ExecttitleMatchs(String ExactTitle) {
		wait.until(ExpectedConditions.titleIs(ExactTitle));
	}

	/***
	 * Wait 30 SECONDS 
	 * URL contain exact match of the URL (boolean )
	 */
	public void WaitUntil_SpecificURL(String URL) {
		wait.until(ExpectedConditions.urlToBe(URL));
	}
	
	/***
	 * Wait 30 SECONDS 
	 * Specific URL
	 */
	public void WaitUntil_fragmenOfURL(String URL) {
		wait.until(ExpectedConditions.urlContains(URL));
		// URL contain any fragment of the current URL
	}

	public void WaitUntil_(String URL) {
		wait.until(ExpectedConditions.urlMatches(URL));
		// URL contain any RegEx ("*&^%$ URL ****")
	}

	public void WaitUntil_ElementSelectedToBe(By by, boolean GivenBoolean) {
		wait.until(ExpectedConditions.elementSelectionStateToBe(by, GivenBoolean));
	}

	public void WaitUntil_AttributeToBe(By by, String attribute, String value) {
		wait.until(ExpectedConditions.attributeToBe(by, attribute, value));
	}

	public void WaitUntil_AttributeNotEmply(By by, String attributeThaChanges) {
		wait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(by), attributeThaChanges));
	}

	public void WaitUntil_invisibilityOfElementWithTex(By by, String Text) {
		wait.until(ExpectedConditions.invisibilityOfElementWithText(by, Text));
	}

	public void WaitUntil_NumberOfElementShouldBe(By by, int Number) {
		wait.until(ExpectedConditions.numberOfElementsToBe(by, Number));
	}

	public void WaitUntil_NumberOfElementsToBeLessThan(By by, int Number) {
		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(by, Number));
	}

	public void WaitUntil_NumberOfElementsToBeMoreThan(By by, int Number) {
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, Number));
	}

	public void WaitUntil_TextToBePresentInElement_AnyAttributeValue(By by, String Text) {
		wait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(by), Text));
	}

	public void WaitUntil_(By by, String sentanceTextOfTheText) {
		wait.until(ExpectedConditions.textMatches(by, Pattern.compile(sentanceTextOfTheText)));
	}

	public void WaitUntil_AvailableFrameByELement(By by) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}

	public void WaitUntil_frameToBeAvailableAndSwitchToIt(String FrameName) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameName));
	}

	public void WaitUntil_InvisibilityOfElement(By by) {
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
	}

	public void WaitUntil_InvisibilityOfAllElements(By by) {
		wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(by)));
	}

	public void WaitUntil_InvisibilityOfElementWithText(By by, String VisibilityText) {
		wait.until(ExpectedConditions.invisibilityOfElementWithText(by, VisibilityText));
	}

	public void WaitUntil_JavaScriptToBeexecuted(String JavaScriptInString) {
		wait.until(ExpectedConditions.javaScriptThrowsNoExceptions(JavaScriptInString));
	}

}