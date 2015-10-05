package pageobjectmodel.incentivepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.DropDownHelper;
import componenthelper.GenericHelper;
import componenthelper.JavaScriptExecutorHelper;

import baseclass.PageBase;

public class EligibleGroupPage extends PageBase {

	public EligibleGroupPage(WebDriver _driver) {
		super(_driver);
	}

	@FindBy(xpath="//a[text()='Eligible Group(s)']",how=How.XPATH)
	private WebElement EligibleGroup;
	
	@FindBy(xpath="//select[@title='Group']",how=How.XPATH)
	private WebElement EligibleGroupDropown;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=5]/button",how=How.XPATH)
	private WebElement EligibleGroupNext;
	
	public void AddEligibleGroup(String grpName) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(EligibleGroup);
		GenericHelper.waitForLoadingMask();
		DropDownHelper.selectByVisibleText(EligibleGroupDropown, grpName);
		EligibleGroup.click();
		GenericHelper.waitForLoadingMask();
		
	}
}
