package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import baseclass.PageBase;

public class HomePage extends PageBase {
	
	private WebDriver _driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this._driver = driver;
	}
	
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
	
	
	public void clickItem(){
		Programs.click();
		Partner.click();
		File.click();
	}
	
	

}
