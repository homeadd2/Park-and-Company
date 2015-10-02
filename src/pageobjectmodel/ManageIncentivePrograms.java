package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import componenthelper.ButtonHelper;
import componenthelper.GenericHelper;
import baseclass.PageBase;

public class ManageIncentivePrograms extends PageBase {

	private WebDriver driver;
	
	public ManageIncentivePrograms(WebDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}
	
	@FindBy(xpath="//a[contains(text(),'Column options')]",how=How.XPATH)
	private WebElement Columnoptions;
	
	public void clickColumnoptions() throws InterruptedException {
		Columnoptions.click();
		Thread.sleep(2000);
		ButtonHelper.click(By.xpath("//button[text()='Cancel']"));
		GenericHelper.waitForElement(Columnoptions);
	}

}
