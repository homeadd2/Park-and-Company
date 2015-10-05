package pageobjectmodel.incentivepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.DropDownHelper;
import componenthelper.GenericHelper;
import componenthelper.JavaScriptExecutorHelper;

import baseclass.PageBase;

public class ConfigureProgramPage extends PageBase {

	public ConfigureProgramPage(WebDriver _driver) {
		super(_driver);
	}
	
	@FindBy(xpath="//a[text()='Configure Program']",how=How.XPATH)
	private WebElement ConfigureProgram;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=3]//input[@data-control='TEXTBOX_DATA_1']",how=How.XPATH)
	private WebElement MaximumPointsAllowed;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=3]//input[@data-control='TEXTBOX_DATA_2']",how=How.XPATH)
	private WebElement PointsExpire;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=3]//input[@data-control='TEXTBOX_DATA_3']",how=How.XPATH)
	private WebElement MyPointsMessage;
	
	@FindBy(xpath="//div[@id='PointTypesSection']/descendant::select[position()=1]",how=How.XPATH)
	private WebElement PointType;
	
	@FindBy(name="pointAllocationPrimary",how=How.ID_OR_NAME)
	private WebElement PointAllocation;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=3]/button",how=How.XPATH)
	private WebElement ConfigureProgramNext;
	
	public void AddPoints(String maxPointAllow,String pointExpire,String myPointMsg) throws InterruptedException{
		
		JavaScriptExecutorHelper.scrollElementAndClick(ConfigureProgram);
		GenericHelper.waitForLoadingMask();
		
		JavaScriptExecutorHelper.scrollElementAndClick(MaximumPointsAllowed);
		MaximumPointsAllowed.clear();
		MaximumPointsAllowed.sendKeys(maxPointAllow);
		JavaScriptExecutorHelper.scrollElementAndClick(PointsExpire);
		PointsExpire.clear();
		PointsExpire.sendKeys(pointExpire);
		JavaScriptExecutorHelper.scrollElementAndClick(MyPointsMessage);
		MyPointsMessage.clear();
		MyPointsMessage.sendKeys(myPointMsg);
		
	}
	
	public void AddPointType(String type,String poitAlloc) throws InterruptedException{
		
		PointAllocation.clear();
		PointAllocation.sendKeys(poitAlloc);
		JavaScriptExecutorHelper.scrollElementAndClick(PointType);
		DropDownHelper.selectByVisibleText(PointType, type);
		Thread.sleep(1000);
		ConfigureProgramNext.click();
		GenericHelper.waitForLoadingMask();
		ConfigureProgram.click();
		GenericHelper.waitForLoadingMask();
	}

}
