package componenthelper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import objectrepo.ObjectRepository;
import baseclass.BaseClass;

public class JavaScriptExecutorHelper extends BaseClass {
	
	private static JavascriptExecutor exeScript;
	
	public static void executeScript(String script) {
		exeScript = ((JavascriptExecutor)ObjectRepository.driver);
		exeScript.executeScript(script);
	}
	
	public static void scrollElementAndClick(WebElement element) throws InterruptedException {
		Thread.sleep(1000);
		JavaScriptExecutorHelper.executeScript("window.scrollTo(0," + element.getLocation().y + ");");
		element.click();
	}
	
	public static void scrollElementAndClick(By locator) {
		WebElement element = ObjectRepository.driver.findElement(locator);
		GenericHelper.waitForElement(element);
		JavaScriptExecutorHelper.executeScript("window.scrollTo(0," + element.getLocation().y + ");");
		element.click();
	}

}
