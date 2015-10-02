package testcases.module.login;

import objectrepo.ObjectRepository;

import org.testng.annotations.Test;

import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import baseclass.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void testcaseone(){
		LoginPage lPage = new LoginPage(ObjectRepository.driver);
		HomePage hpage = lPage.LoginApplication(ObjectRepository.config.getUsername(), ObjectRepository.config.getPassword());
		hpage.clickItem();
		
	}

}
