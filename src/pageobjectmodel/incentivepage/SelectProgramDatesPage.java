package pageobjectmodel.incentivepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.CalenderHelper;
import componenthelper.GenericHelper;
import componenthelper.JavaScriptExecutorHelper;

import baseclass.PageBase;

public class SelectProgramDatesPage extends PageBase {

	public SelectProgramDatesPage(WebDriver _driver) {
		super(_driver);
	}
	
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
}
