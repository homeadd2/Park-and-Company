package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import componenthelper.GenericHelper;
import baseclass.PageBase;

public class HomePage extends PageBase {
	
	private WebDriver _driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this._driver = driver;
	}
	
	private final String errMsg = "Error Page Not Loaded : ";
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='Programs ']",how=How.XPATH)
	private WebElement Programs;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='User ']",how=How.XPATH)
	private WebElement User;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='Partner ']",how=How.XPATH)
	private WebElement Partner;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='File ']",how=How.XPATH)
	private WebElement File;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='Communication ']",how=How.XPATH)
	private WebElement Communication;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='Configuration ']",how=How.XPATH)
	private WebElement Configuration;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='Reports']",how=How.XPATH)
	private WebElement Reports;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='Onboarding ']",how=How.XPATH)
	private WebElement Onboarding;
	
	@FindBy(xpath="//div[@id='header4']/descendant::a[text()='Manage Incentive Programs']",how=How.XPATH)
	private WebElement ManageIncentivePrograms;
	
	
	
	public ManageIncentivePrograms OpenManageIncentivePrograms(){
		Programs.click();
		GenericHelper.waitForElement(ManageIncentivePrograms);
		ManageIncentivePrograms.click();
		GenericHelper.waitForElement(By.id("titleDiv"));
		Assert.assertTrue(GenericHelper.isElementPresent(By.id("titleDiv")), errMsg + "Manage Incentive Programs Page");
		
		return new ManageIncentivePrograms(_driver);
	}
	
	

}
