package pageobjectmodel.incentivepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import baseclass.PageBase;

public class ProgramIncentive extends PageBase {

	public ProgramIncentive(WebDriver _driver) {
		super(_driver);
	}
	
	@FindBy(xpath="//label[text()='ACTIVITY_CODE']/following-sibling::div/input",how=How.XPATH)
	private WebElement Activity_Code;
	
	@FindBy(xpath="//label[text()='ACTIVITY_TYPE']/following-sibling::div/input",how=How.XPATH)
	private WebElement Activity_Type;
	
	@FindBy(xpath="//label[text()='DESCRIPTION']/following-sibling::div/input",how=How.XPATH)
	private WebElement Description;
	
	@FindBy(xpath="//label[text()='POINTS']/following-sibling::div/input",how=How.XPATH)
	private WebElement Points;
	
	@FindBy(xpath="//button[@type='submit' and text()='Submit']",how=How.XPATH)
	private WebElement Submit;
	
	public void AddProgramIncentive(String acCode,String acType,String desc,String points){
		Activity_Code.sendKeys(acCode);
		Activity_Type.sendKeys(acType);
		Description.sendKeys(desc);
		Points.sendKeys(points);
		Submit.click();
	}

}
