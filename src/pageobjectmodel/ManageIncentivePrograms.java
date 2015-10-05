package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import baseclass.PageBase;

import componenthelper.DropDownHelper;
import componenthelper.GenericHelper;
import componenthelper.JavaScriptExecutorHelper;

/**
 * @author rahul.rathore
 *	
 *	05-Oct-2015
 *
 */
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
	
	@FindBy(xpath="//select[@data-role='dropdownlist']",how=How.XPATH)
	private WebElement ItemPerPage;
	
	public void clickColumnoptions() {
		Columnoptions.click();
		GenericHelper.waitForElement(By.name("columnOptionsForm"));	
	}
	
	public NewProgram clickNewProgram() throws InterruptedException{
		JavaScriptExecutorHelper.scrollElementAndClick(NewProgram);
		GenericHelper.waitForLoadingMask();
		return new NewProgram(driver);
	}
	
	public void selectItemPerList(String number) throws InterruptedException {
		JavaScriptExecutorHelper.scrollElementAndClick(ItemPerPage);
		DropDownHelper.selectByVisibleText(ItemPerPage, "100");
		GenericHelper.waitForLoadingMask();
	}
	
	/**
	 * @param gridXpath //div[@id='ManageIncentiveProgramsGrid']/div/child::div[position()=3]
	 * using which one can reach to table tag
	 * @throws InterruptedException 
	 */
	
	public void verifyIncentiveGridEntry(String gridXpath,String program,String startDate,String endDate,String status) throws InterruptedException {
		selectItemPerList("100");
		for(int i = 1; i <= 100; i++){
			if(GenericHelper.isElementPresent(By.xpath(gridXpath + "//table//tbody//tr[" + i + "]//td[1]/a"))){
				Assert.assertEquals(GenericHelper.getText(By.xpath(gridXpath + "//table//tbody//tr[" + i + "]//td[1]/a")), program);
				Assert.assertEquals(GenericHelper.getText(By.xpath(gridXpath + "//table//tbody//tr[" + i + "]//td[2]")), startDate);
				Assert.assertEquals(GenericHelper.getText(By.xpath(gridXpath + "//table//tbody//tr[" + i + "]//td[3]")), endDate);
				Assert.assertEquals(GenericHelper.getText(By.xpath(gridXpath + "//table//tbody//tr[" + i + "]//td[4]/span")), status);
			}
		}
	}

}
