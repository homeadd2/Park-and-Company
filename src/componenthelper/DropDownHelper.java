package componenthelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {
	
	private static Select select;
	
	public static void selectByVisibleText(By locator,String text) {
		select = new Select(GenericHelper.getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void selectByVisibleText(WebElement element,String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

}
