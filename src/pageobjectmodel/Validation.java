package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sun.swing.internal.plaf.basic.resources.basic;

import baseclass.PageBase;

public class Validation extends PageBase {

	public Validation(WebDriver _driver) {
		super(_driver);
	}
	
	@FindBy(name="FIRST_NAME",how=How.ID_OR_NAME)
	private  WebElement FirstName;
	
	@FindBy(name="LAST_NAME",how=How.ID_OR_NAME)
	private  WebElement Lastname;
	
	@FindBy(name="EMAIL",how=How.ID_OR_NAME)
	private  WebElement Email;
	
	@FindBy(name="ACTIVITY_CODE",how=How.ID_OR_NAME)
	private  WebElement ActivityCode;
	
	@FindBy(name="DATE",how=How.ID_OR_NAME)
	private  WebElement Date;
	
	public void checkValidationField(boolean fName,boolean lName,boolean eMail,boolean acCode,boolean date) {
		
		if(fName)
			FirstName.click();
		if(lName)
			Lastname.click();
		if(eMail)
			Email.click();
		if(acCode)
			ActivityCode.click();
		if(date)
			Date.click();
	}

}
