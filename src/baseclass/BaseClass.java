package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import componenthelper.GenericHelper;

public class BaseClass extends InitializeWebDriver {
	
	protected void Logout() {
		WebElement logout = GenericHelper.getElement(By.xpath("//span[@class='headerMenuPipe']/preceding-sibling::span[contains(text(),'Welcome')]"));
		logout = GenericHelper.waitForElementClickAble(logout);
		logout.click();
		logout = GenericHelper.waitForElement(By.xpath("//a[contains(text(),'Log Off')]"));
		logout.click();
		GenericHelper.waitForElement(By.xpath("//div[@class='loginWrapper']"));
	}

}
