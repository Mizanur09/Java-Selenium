package Moduals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import globalized.GlobalizedAllPage;

public class WaitUtility extends GlobalizedAllPage {

	public static WebDriverWait pageWait = new WebDriverWait(driver, 30);

	public void ImplicitWaitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void PageLoadWaitTime() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	/***
	 * Browser will wait for given number in seconds
	 * @param Number Of Seconds
	 * @throws Exception
	 */
	public void WaitForSeconds(int NumberOfSeconds) throws Exception {
		Thread.sleep(1000*NumberOfSeconds);
	}
	
	/***
	 * java Fluent Wait 
	 * @param locator used to find the element
	 * @return
	 */
	public WebElement fluentWait(final By by) {
		WebElement targetElem = null;
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(NoSuchElementException.class);
			targetElem = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(by);
				}
			});
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return targetElem;
	}

	/***
	 * Wait 30 SECONDS for the Alert to be present
	 * @return
	 */
	public void WaitUntil_AlertIsPresent() {
		try {
			pageWait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/****
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator used to find the element
	 * @return
	 */
	public WebElement WaitFor_VisibilityOfElementLocated(By by) {
		WebElement Element = null;
		try {
			Element = pageWait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param locator used to find the element
	 * @return
	 */
	public WebElement WaitFor_ElementToBeClickable(By by) {
		WebElement Element = null;
		try {
			Element = pageWait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param title the fragment of title expected
	 * @return
	 */
	public void WaitUntil_fragmenOftitleMatchs(String fragmenOTitle) {
		pageWait.until(ExpectedConditions.titleContains(fragmenOTitle));
	}

	/***
	 * An expectation for checking the title of a page
	 * @param title the expected title, which must be an exact match
	 * @return
	 */
	public void WaitUntil_ExecttitleMatchs(String ExactTitle) {
		pageWait.until(ExpectedConditions.titleIs(ExactTitle));
	}

	/***
	 * An expectation for the URL of the current page to be a specific url.
	 * @param URL the URL that the page should be on
	 * @return
	 */
	public void WaitUntil_SpecificURL(String URL) {
		pageWait.until(ExpectedConditions.urlToBe(URL));
	}

	/***
	 * An expectation for the URL of the current page to contain specific text.
	 * @param the fraction of the URL that the page should be on
	 * @return
	 */
	public void WaitUntil_fragmenOfURL(String URL) {
		pageWait.until(ExpectedConditions.urlContains(URL));
	}

	/***
	 * Expectation for the URL to match a specific regular expression
	 * @param URL the regular expression that the URL should match RegEx ("*&^%$ URL ****")
	 * @return
	 */
	public void WaitUntil_(String URL) {
		pageWait.until(ExpectedConditions.urlMatches(URL));
	}

	/****
	 * Is Element selected with given boolean
	 * @param locator used to find the element
	 * @param GivenBoolean
	 * @return
	 */
	public void WaitUntil_ElementSelectedToBe(By by, boolean GivenBoolean) {
		pageWait.until(ExpectedConditions.elementSelectionStateToBe(by, GivenBoolean));
	}

	/*****
	 * ### Checking the attribute as given (Attribute name ) && (Attribute Value) ###
	 * An expectation for checking WebElement with given locator has attribute with a specific value
	 * @param locator used to find the element
	 * @param attribute used to define css or html attribute
	 * @param value used as expected attribute value
	 * @return
	 */
	public void WaitUntil_AttributeToBe(By by, String attribute, String value) {
		pageWait.until(ExpectedConditions.attributeToBe(by, attribute, value));
	}

	/****
	 * An expectation for checking WebElement any non empty value for given attribute
	 * @param locator used to find the element
	 * @param attribute used to define css or html attribute
	 * @return
	 */
	public void WaitUntil_AttributeNotEmpty(By by, String attributeThaChanges) {
		pageWait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(by), attributeThaChanges));
	}

	/****
	 * An expectation for checking that an element with text is either invisible or not present on theDOM
	 * @param locator used to find the element
	 * @param text    of the element
	 * @return
	 */
	public void WaitUntil_invisibilityOfElementWithTex(By by, String Text) {
		pageWait.until(ExpectedConditions.invisibilityOfElementWithText(by, Text));
	}

	/****
	 * An expectation for checking number of WebElements with given locator
	 * @param locator used to find the element
	 * @param Number used to define minimum number of element
	 * @return
	 */
	public void WaitUntil_NumberOfElementShouldBe(By by, int Number) {
		pageWait.until(ExpectedConditions.numberOfElementsToBe(by, Number));
	}

	/****
	 * An expectation for checking number of WebElements with given locator being less than defined number.
	 * @param locator used to find the element
	 * @param Number used to define minimum number of element
	 * @return
	 */
	public void WaitUntil_NumberOfElementsToBeLessThan(By by, int Number) {
		pageWait.until(ExpectedConditions.numberOfElementsToBeLessThan(by, Number));
	}

	/***
	 * An expectation for checking number of WebElements with given locator being more than defined number.
	 * @param locator used to find the element
	 * @param Number used to define minimum number of element
	 * @return
	 */
	public void WaitUntil_NumberOfElementsToBeMoreThan(By by, int Number) {
		pageWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, Number));
	}

	/****
	 * An expectation for checking if the given text is present in the specified elements value attribute
	 * @param locator used to find the element
	 * @param text to be present in the element's value attribute
	 * @return
	 */
	public void WaitUntil_TextToBePresentInElement_AnyAttributeValue(By by, String Text) {
		pageWait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(by), Text));
	}

	/****
	 * An expectation for checking WebElement with given locator has text with a value as a part of it pattern used as expected text matcher pattern.
	 * @param locator used to find the element
	 * @param pattern used as expected text matcher pattern
	 * @return
	 */
	public void WaitUntil_(By by, String sentanceTextOfTheText) {
		pageWait.until(ExpectedConditions.textMatches(by, Pattern.compile(sentanceTextOfTheText)));
	}

	/***
	 * An expectation for checking whether the given frame is available to switch to.
	 * @param locator used to find the element
	 * @return
	 */
	public void WaitUntil_AvailableFrameByELement(By by) {
		pageWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}

	/****
	 * An expectation for checking whether the given frame is available to switch to. 
	 * If the frame is available it switches the given driver to the specified frame.
	 * @param Check for the Frame by using FrameName
	 * @return
	 */
	public void WaitUntil_frameToBeAvailableAndSwitchToIt(String FrameName) {
		pageWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameName));
	}

	/***
	 * An expectation for checking the element to be invisible.
	 * @param locator used to find the element
	 * @return
	 */
	public void WaitUntil_InvisibilityOfElement(By by) {
		pageWait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
	}

	/***
	 * An expectation for checking all elements from given list to be invisible.
	 * @param locator used to find the element
	 * @return
	 */
	public void WaitUntil_InvisibilityOfAllElements(By by) {
		pageWait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(by)));
	}

	/****
	 * An expectation for checking that an element with text is either invisible or not present on theDOM.
	 * @param locator used to find the element
	 * @param Text of the element
	 * @return
	 */
	public void WaitUntil_InvisibilityOfElementWithText(By by, String VisibilityText) {
		 pageWait.until(ExpectedConditions.invisibilityOfElementWithText(by, VisibilityText));
	}

	/***
	 * An expectation to check if js executable.Useful when you know that there should be a Javascript value or something at the stage.
	 * @param String javaScript used as executable script
	 * @return
	 */
	public void WaitUntil_JavaScriptToBeexecuted(String JavaScriptInString) {
		pageWait.until(ExpectedConditions.javaScriptThrowsNoExceptions(JavaScriptInString));
	}

}