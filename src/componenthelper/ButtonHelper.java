package componenthelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class ButtonHelper extends BaseClass {
	
	private static WebElement element;
	
	public static void click(By locator) {
		element = GenericHelper.getElement(locator);
		element.click();
	}
	
}
