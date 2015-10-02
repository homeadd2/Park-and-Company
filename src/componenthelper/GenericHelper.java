package componenthelper;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import objectrepo.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericHelper {
	
	public static WebDriverWait getWebDriverWait(int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(ObjectRepository.driver, timeOutInSeconds);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		return wait;
		
	}
	
	public static boolean isElementPresent(By locator){
		try {
			if(ObjectRepository.driver.findElements(locator).size() == 1)
				return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static WebElement getElement(By locator){
		if(isElementPresent(locator))
			return ObjectRepository.driver.findElement(locator);
		throw new NoSuchElementException("Element Not Found : " + locator.toString());
	}
	
	public static void windowMaximize() {
		ObjectRepository.driver.manage().window().maximize();
	}
	
	public static void setPageLoadTimeOut(int timeout) {
		ObjectRepository.driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
	}
	
	public static void setElementLoadTimeOut(int timeout) {
		ObjectRepository.driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	public static WebElement waitForElement(By locator) {
		WebDriverWait wait = getWebDriverWait(60);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementClickAble(By locator) {
		WebDriverWait wait = getWebDriverWait(60);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static WebElement waitForElementClickAble(WebElement element) {
		WebDriverWait wait = getWebDriverWait(60);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement waitForElement(WebElement element) {
		WebDriverWait wait = getWebDriverWait(60);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

}
