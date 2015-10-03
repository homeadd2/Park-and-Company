package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.DropDownHelper;
import componenthelper.GenericHelper;
import baseclass.PageBase;

public class NewProgram extends PageBase {
	
	private WebDriver driver;
	
	public NewProgram(WebDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}
	
	@FindBy(name="IncentiveTemplate",how=How.ID_OR_NAME)
	private WebElement DefineYourProgram;
	
	@FindBy(xpath="//button[text()='Build']",how=How.XPATH)
	private WebElement Build;
	
	public ActivityIncentiveTemplate CreateActivityIncentiveTemplate() {
		DropDownHelper.selectByVisibleText(By.name("IncentiveTemplate"), "Activity Incentive Template");
		Build.click();
		GenericHelper.waitForLoadingMask();
		return new ActivityIncentiveTemplate(driver);
		
	}
}
