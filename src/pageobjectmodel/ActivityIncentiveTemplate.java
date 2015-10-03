package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.GenericHelper;

import baseclass.PageBase;

public class ActivityIncentiveTemplate extends PageBase {

	private WebDriver driver;
	
	public ActivityIncentiveTemplate(WebDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}
	
	@FindBy(xpath="//a[text()='Select Program Name']",how=How.XPATH)
	private WebElement SelectProgram;
	
	@FindBy(name="DATA_1",how=How.NAME)
	private WebElement ProgramName;
	
	@FindBy(name="DATA_2",how=How.NAME)
	private WebElement ProgramDesc;
	
	@FindBy(xpath="//div[@id='collapse227']/descendant::button",how=How.XPATH)
	private WebElement collapse227Next;
	
	public void SelectProgramName(String pName,String pDesc) {
		SelectProgram.click();
		GenericHelper.waitForElement(ProgramName);
		ProgramName.sendKeys(pName);
		ProgramDesc.sendKeys(pDesc);
		collapse227Next.click();
	}

}
