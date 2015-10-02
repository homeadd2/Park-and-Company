package baseclass;

import java.util.NoSuchElementException;

import objectrepo.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass extends InitializeWebDriver {
	
	protected boolean isElementPresent(By locator){
		try {
			if(ObjectRepository.driver.findElements(locator).size() == 1)
				return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	protected WebElement getElement(By locator){
		if(isElementPresent(locator))
			return ObjectRepository.driver.findElement(locator);
		throw new NoSuchElementException("Element Not Found : " + locator.toString());
	}

}
