package componenthelper;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import objectrepo.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericHelper {
	
	public static void windowMaximize() {
		ObjectRepository.driver.manage().window().maximize();
	}
	
	public static void setPageLoadTimeOut(int timeout) {
		ObjectRepository.driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
	}
	
	public static void setElementLoadTimeOut(int timeout) {
		ObjectRepository.driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	public static void waitForElement(By locator) {
		WebDriverWait wait = new WebDriverWait(ObjectRepository.driver, 60);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
