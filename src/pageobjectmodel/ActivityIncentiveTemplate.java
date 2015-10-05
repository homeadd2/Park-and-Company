package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pageobjectmodel.incentivepage.ConfigureProgramPage;
import pageobjectmodel.incentivepage.EligibleGroupPage;
import pageobjectmodel.incentivepage.ProgramIncentive;
import pageobjectmodel.incentivepage.SelectProgramDatesPage;
import pageobjectmodel.incentivepage.SelectProgramPage;
import pageobjectmodel.incentivepage.Validation;
import baseclass.PageBase;
import componenthelper.GenericHelper;
import componenthelper.JavaScriptExecutorHelper;

public class ActivityIncentiveTemplate extends PageBase {

	private WebDriver driver;
	
	public ActivityIncentiveTemplate(WebDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}
	
	@FindBy(xpath="//a[text()='Program Incentive']",how=How.XPATH)
	private WebElement ProgramIncentive;
	
	@FindBy(xpath="//button[text()='Add']",how=How.XPATH)
	private WebElement Add;
	
	
	@FindBy(xpath="//a[text()='Validation']",how=How.XPATH)
	private WebElement Validation;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=6]/button",how=How.XPATH)
	private WebElement ValidationNext;
	
	@FindBy(xpath="//a[text()='Finish']",how=How.XPATH)
	private WebElement Finish;
	
	public void AddProgramIncentive(String acCode,String acType,String desc,String points) throws InterruptedException{
		JavaScriptExecutorHelper.scrollElementAndClick(ProgramIncentive);
		GenericHelper.waitForLoadingMask();
		GenericHelper.waitForElement(Add);
		Add.click();
		ProgramIncentive addInc = new ProgramIncentive(driver);
		addInc.AddProgramIncentive(acCode, acType, desc, points);
		JavaScriptExecutorHelper.scrollElementAndClick(ProgramIncentive);
		GenericHelper.waitForLoadingMask();
	}
	
	
	public void checkValidationField(boolean fName,boolean lName,boolean eMail,boolean acCode,boolean date) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(Validation);
		GenericHelper.waitForLoadingMask();
		Validation val = new Validation(driver);
		val.checkValidationField(fName, lName, eMail, acCode, date);
		ValidationNext.click();
		Validation.click();
		GenericHelper.waitForLoadingMask();
		
	}
	
	public void clickFinish() {
		Finish.click();
	}


	public void SelectProgramName(String pName, String pDesc) throws InterruptedException {
		SelectProgramPage spPage = new SelectProgramPage(driver);
		spPage.SelectProgramName(pName, pDesc);
	}


	public void SelectProgramVisibilityStartDate(String day, String month,
			String year) throws InterruptedException {
		SelectProgramDatesPage spdPage = new SelectProgramDatesPage(driver);
		spdPage.SelectProgramVisibilityStartDate(day, month, year);
	}


	public void SelectProgramVisibilityEndDate(String day, String month,
			String year) throws InterruptedException {
		SelectProgramDatesPage spdPage = new SelectProgramDatesPage(driver);
		spdPage.SelectProgramVisibilityEndDate(day, month, year);
		
	}


	public void SelectProgramStartDate(String day, String month,
			String year) throws InterruptedException {
		SelectProgramDatesPage spdPage = new SelectProgramDatesPage(driver);
		spdPage.SelectProgramStartDate(day, month, year);
		
	}


	public void SelectProgramEndDate(String day, String month,
			String year) throws InterruptedException {
		SelectProgramDatesPage spdPage = new SelectProgramDatesPage(driver);
		spdPage.SelectProgramEndDate(day, month, year);
		
	}


	public void SelectProgramLastSubmitDate(String day, String month,
			String year) throws InterruptedException {
		SelectProgramDatesPage spdPage = new SelectProgramDatesPage(driver);
		spdPage.SelectProgramLastSubmitDate(day, month, year);
		
	}


	public void SelectProgramCloseDates(String day, String month,
			String year) throws InterruptedException {
		SelectProgramDatesPage spdPage = new SelectProgramDatesPage(driver);
		spdPage.SelectProgramCloseDates(day, month, year);
		
	}


	public void AddPoints(String maxPointAllow, String pointExpire, String myPointMsg) throws InterruptedException {
		ConfigureProgramPage cpPage = new ConfigureProgramPage(driver);
		cpPage.AddPoints(maxPointAllow, pointExpire, myPointMsg);
	}


	public void AddPointType(String type, String poitAlloc) throws InterruptedException {
		ConfigureProgramPage cpPage = new ConfigureProgramPage(driver);
		cpPage.AddPointType(type, poitAlloc);
		
	}


	public void AddEligibleGroup(String grpName) throws InterruptedException {
		EligibleGroupPage egPage = new EligibleGroupPage(driver);
		egPage.AddEligibleGroup(grpName);
		
	}

}
