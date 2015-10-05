package pageobjectmodel.incentivepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.GenericHelper;

import baseclass.PageBase;

public class SelectProgramPage extends PageBase {

	public SelectProgramPage(WebDriver _driver) {
		super(_driver);
	}
	
	@FindBy(xpath="//a[text()='Select Program Name']",how=How.XPATH)
	private WebElement SelectProgram;
	
	@FindBy(name="DATA_1",how=How.NAME)
	private WebElement ProgramName;
	
	@FindBy(name="DATA_2",how=How.NAME)
	private WebElement ProgramDesc;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=1]/button",how=How.XPATH)
	private WebElement SelectProgramNext;
	
	public void SelectProgramName(String pName,String pDesc) throws InterruptedException {
		SelectProgram.click();
		GenericHelper.waitForElement(ProgramName);
		ProgramName.sendKeys(pName);
		ProgramDesc.sendKeys(pDesc);
		SelectProgramNext.click();
		GenericHelper.waitForLoadingMask();
		SelectProgram.click();
		GenericHelper.waitForLoadingMask();
		Thread.sleep(1000);
	}
}
