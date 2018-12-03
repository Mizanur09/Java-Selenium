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
	public WebElement WaitUntil_AlertIsPresent() {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
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
			pageWait.until(ExpectedConditions.visibilityOfElementLocated(by));
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
			pageWait.until(ExpectedConditions.elementToBeClickable(by));
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
	public WebElement WaitUntil_fragmenOftitleMatchs(String fragmenOTitle) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.titleContains(fragmenOTitle));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for checking the title of a page
	 * @param title the expected title, which must be an exact match
	 * @return
	 */
	public WebElement WaitUntil_ExecttitleMatchs(String ExactTitle) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.titleIs(ExactTitle));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for the URL of the current page to be a specific url.
	 * @param URL the URL that the page should be on
	 * @return
	 */
	public WebElement WaitUntil_SpecificURL(String URL) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.urlToBe(URL));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for the URL of the current page to contain specific text.
	 * @param the fraction of the URL that the page should be on
	 * @return
	 */
	public WebElement WaitUntil_fragmenOfURL(String URL) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.urlContains(URL));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * Expectation for the URL to match a specific regular expression
	 * @param URL the regular expression that the URL should match RegEx ("*&^%$ URL ****")
	 * @return
	 */
	public WebElement WaitUntil_(String URL) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.urlMatches(URL));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * Is Element selected with given boolean
	 * @param locator used to find the element
	 * @param GivenBoolean
	 * @return
	 */
	public WebElement WaitUntil_ElementSelectedToBe(By by, boolean GivenBoolean) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.elementSelectionStateToBe(by, GivenBoolean));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/*****
	 * ### Checking the attribute as given (Attribute name ) && (Attribute Value) ###
	 * An expectation for checking WebElement with given locator has attribute with a specific value
	 * @param locator used to find the element
	 * @param attribute used to define css or html attribute
	 * @param value used as expected attribute value
	 * @return
	 */
	public WebElement WaitUntil_AttributeToBe(By by, String attribute, String value) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.attributeToBe(by, attribute, value));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking WebElement any non empty value for given attribute
	 * @param locator used to find the element
	 * @param attribute used to define css or html attribute
	 * @return
	 */
	public WebElement WaitUntil_AttributeNotEmpty(By by, String attributeThaChanges) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(by), attributeThaChanges));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking that an element with text is either invisible or not present on theDOM
	 * @param locator used to find the element
	 * @param text    of the element
	 * @return
	 */
	public WebElement WaitUntil_invisibilityOfElementWithTex(By by, String Text) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.invisibilityOfElementWithText(by, Text));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking number of WebElements with given locator
	 * @param locator used to find the element
	 * @param Number  used to define minimum number of element
	 * @return
	 */
	public WebElement WaitUntil_NumberOfElementShouldBe(By by, int Number) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.numberOfElementsToBe(by, Number));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking number of WebElements with given locator being less than defined number.
	 * @param locator used to find the element
	 * @param Number  used to define minimum number of element
	 * @return
	 */
	public WebElement WaitUntil_NumberOfElementsToBeLessThan(By by, int Number) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.numberOfElementsToBeLessThan(by, Number));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for checking number of WebElements with given locator being more than defined number.
	 * @param locator used to find the element
	 * @param Number  used to define minimum number of element
	 * @return
	 */
	public WebElement WaitUntil_NumberOfElementsToBeMoreThan(By by, int Number) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, Number));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking if the given text is present in the specified elements value attribute
	 * @param locator used to find the element
	 * @param text    to be present in the element's value attribute
	 * @return
	 */
	public WebElement WaitUntil_TextToBePresentInElement_AnyAttributeValue(By by, String Text) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(by), Text));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking WebElement with given locator has text with a value as a part of it pattern used as expected text matcher pattern.
	 * @param locator used to find the element
	 * @param pattern used as expected text matcher pattern
	 * @return
	 */
	public WebElement WaitUntil_(By by, String sentanceTextOfTheText) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.textMatches(by, Pattern.compile(sentanceTextOfTheText)));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for checking whether the given frame is available to switch to.
	 * @param locator used to find the element
	 * @return
	 */
	public WebElement WaitUntil_AvailableFrameByELement(By by) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking whether the given frame is available to switch to. 
	 * If the frame is available it switches the given driver to the specified frame.
	 * @param Check for the Frame by using FrameName
	 * @return
	 */
	public WebElement WaitUntil_frameToBeAvailableAndSwitchToIt(String FrameName) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameName));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for checking the element to be invisible.
	 * @param locator used to find the element
	 * @return
	 */
	public WebElement WaitUntil_InvisibilityOfElement(By by) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation for checking all elements from given list to be invisible.
	 * @param locator used to find the element
	 * @return
	 */
	public WebElement WaitUntil_InvisibilityOfAllElements(By by) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(by)));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/****
	 * An expectation for checking that an element with text is either invisible or not present on theDOM.
	 * @param locator used to find the element
	 * @param Text    of the element
	 * @return
	 */
	public WebElement WaitUntil_InvisibilityOfElementWithText(By by, String VisibilityText) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.invisibilityOfElementWithText(by, VisibilityText));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

	/***
	 * An expectation to check if js executable.Useful when you know that there should be a Javascript value or something at the stage.
	 * @param String javaScript used as executable script
	 * @return
	 */
	public WebElement WaitUntil_JavaScriptToBeexecuted(String JavaScriptInString) {
		WebElement Element = null;
		try {
			pageWait.until(ExpectedConditions.javaScriptThrowsNoExceptions(JavaScriptInString));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return Element;
	}

}