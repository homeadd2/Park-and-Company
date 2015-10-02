package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends BaseClass {
	
	protected WebDriver driver;
	
	public PageBase(WebDriver _driver){
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}
		

}
