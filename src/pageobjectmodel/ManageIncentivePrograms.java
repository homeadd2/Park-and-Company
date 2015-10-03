package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import settings.ErrorMessage;
import componenthelper.ButtonHelper;
import componenthelper.GenericHelper;
import baseclass.PageBase;

public class ManageIncentivePrograms extends PageBase {

	private WebDriver driver;
	
	public ManageIncentivePrograms(WebDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}
	
	@FindBy(xpath="//a[contains(text(),'Column options')]",how=How.XPATH)
	private WebElement Columnoptions;
	
	@FindBy(xpath="//button[text()='+ New Program']",how=How.XPATH)
	private WebElement NewProgram;
	
	public void clickColumnoptions() {
		Columnoptions.click();
		GenericHelper.waitForElement(By.name("columnOptionsForm"));	
	}
	
	public NewProgram clickNewProgram(){
		NewProgram.click();
		GenericHelper.waitForLoadingMask();
		return new NewProgram(driver);
	}

}
