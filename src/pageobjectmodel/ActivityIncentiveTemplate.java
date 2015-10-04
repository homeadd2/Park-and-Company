package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.CalenderHelper;
import componenthelper.DropDownHelper;
import componenthelper.GenericHelper;
import componenthelper.JavaScriptExecutorHelper;
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
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=1]/button",how=How.XPATH)
	private WebElement SelectProgramNext;
	
	@FindBy(xpath="//a[text()='Select Program Dates']",how=How.XPATH)
	private WebElement SelectPrograDates;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=2]/button",how=How.XPATH)
	private WebElement SelectDatesNext;
	
	@FindBy(xpath="//button[@data-control='BUTTON_DATA_1']",how=How.XPATH)
	private WebElement  VisibilityStartDate;
	
	@FindBy(xpath="//button[@data-control='BUTTON_DATA_2']",how=How.XPATH)
	private WebElement  VisibilityEndDate;
	
	@FindBy(xpath="//button[@data-control='BUTTON_DATA_3']",how=How.XPATH)
	private WebElement  StartDate;
	
	@FindBy(xpath="//button[@data-control='BUTTON_DATA_4']",how=How.XPATH)
	private WebElement  EndDate;
	
	@FindBy(xpath="//button[@data-control='BUTTON_DATA_5']",how=How.XPATH)
	private WebElement  LastSubmitDate;
	
	@FindBy(xpath="//button[@data-control='BUTTON_DATA_6']",how=How.XPATH)
	private WebElement  CloseDate;
	
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
	
	@FindBy(xpath="//div[@id='PointTypesSection']/descendant::input[@name='pointAllocationPrimary' and position()=1]",how=How.XPATH)
	private WebElement PointAllocation;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=3]/button",how=How.XPATH)
	private WebElement ConfigureProgramNext;
	
	@FindBy(xpath="//a[text()='Program Incentive']",how=How.XPATH)
	private WebElement ProgramIncentive;
	
	@FindBy(xpath="//button[text()='Add']",how=How.XPATH)
	private WebElement Add;
	
	@FindBy(xpath="//a[text()='Eligible Group(s)']",how=How.XPATH)
	private WebElement EligibleGroup;
	
	@FindBy(xpath="//select[@title='Group']",how=How.XPATH)
	private WebElement EligibleGroupDropown;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=5]/button",how=How.XPATH)
	private WebElement EligibleGroupNext;
	
	@FindBy(xpath="//a[text()='Validation']",how=How.XPATH)
	private WebElement Validation;
	
	@FindBy(xpath="//div[@id='accordion']/descendant::div[@id='rendered'][position()=6]/button",how=How.XPATH)
	private WebElement ValidationNext;
	
	@FindBy(xpath="//a[text()='Finish']",how=How.XPATH)
	private WebElement Finish;
	
	
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
	
	/**
	 * Data format should be dd/mm/yyyy
	 * @throws InterruptedException 
	 * */
	
	public void SelectProgramVisibilityStartDate(String day,String month,String year) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(SelectPrograDates);
		GenericHelper.waitForLoadingMask();
		VisibilityStartDate.click();
		
		GenericHelper.waitForElement(By.xpath("//div[@data-control='DATA_1']//table[@role='grid']"));
		/* VisibilityStartDate  */
		CalenderHelper.selectDate("//div[@data-control='DATA_1']//table[@role='grid']", day, month, year); 
		GenericHelper.waitForLoadingMask();
		
	}
		
	public void SelectProgramVisibilityEndDate(String day,String month,String year) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(VisibilityEndDate);
		GenericHelper.waitForElement(By.xpath("//div[@data-control='DATA_2']//table[@role='grid']"));
		/* VisibilityEndDate  */
		CalenderHelper.selectDate("//div[@data-control='DATA_2']//table[@role='grid']", day, month, year); 
		GenericHelper.waitForLoadingMask();
		
	}
	
	public void SelectProgramStartDate(String day,String month,String year) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(StartDate);
		GenericHelper.waitForElement(By.xpath("//div[@data-control='DATA_3']//table[@role='grid']"));
		/* StartDate  */
		CalenderHelper.selectDate("//div[@data-control='DATA_3']//table[@role='grid']", day, month, year); 
		GenericHelper.waitForLoadingMask();
		
	}
	
	public void SelectProgramEndDate(String day,String month,String year) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(EndDate);
		GenericHelper.waitForElement(By.xpath("//div[@data-control='DATA_4']//table[@role='grid']"));
		/* StartDate  */
		CalenderHelper.selectDate("//div[@data-control='DATA_4']//table[@role='grid']", day, month, year); 
		GenericHelper.waitForLoadingMask();
	}
	
	public void SelectProgramLastSubmitDate(String day,String month,String year) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(LastSubmitDate);
		GenericHelper.waitForElement(By.xpath("//div[@data-control='DATA_5']//table[@role='grid']"));
		/* LastSubmitDate  */
		CalenderHelper.selectDate("//div[@data-control='DATA_5']//table[@role='grid']", day, month, year); 
		GenericHelper.waitForLoadingMask();
	}
	
	public void SelectProgramCloseDates(String day,String month,String year) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(CloseDate);
		GenericHelper.waitForElement(By.xpath("//div[@data-control='DATA_6']//table[@role='grid']"));
		/* CloseDate  */
		CalenderHelper.selectDate("//div[@data-control='DATA_6']//table[@role='grid']", day, month, year); 
		GenericHelper.waitForLoadingMask();
		
		JavaScriptExecutorHelper.scrollElementAndClick(SelectDatesNext);
		GenericHelper.waitForLoadingMask();
		
		JavaScriptExecutorHelper.scrollElementAndClick(SelectPrograDates);
		GenericHelper.waitForLoadingMask();
	}
	
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
		
		JavaScriptExecutorHelper.scrollElementAndClick(PointType);
		DropDownHelper.selectByVisibleText(PointType, type);
		PointAllocation.clear();
		PointAllocation.sendKeys(poitAlloc);
		Thread.sleep(1000);
		ConfigureProgramNext.click();
		GenericHelper.waitForLoadingMask();
		ConfigureProgram.click();
		GenericHelper.waitForLoadingMask();
	}
	
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
	
	public void AddEligibleGroup(String grpName) throws InterruptedException {
		
		JavaScriptExecutorHelper.scrollElementAndClick(EligibleGroup);
		GenericHelper.waitForLoadingMask();
		DropDownHelper.selectByVisibleText(EligibleGroupDropown, grpName);
		EligibleGroup.click();
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

}
