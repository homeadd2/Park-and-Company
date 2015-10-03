package testcases.module.login;

import objectrepo.ObjectRepository;

import org.testng.annotations.Test;

import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ManageIncentivePrograms;
import baseclass.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void testcaseone() throws Exception{
		LoginPage lPage = new LoginPage(ObjectRepository.driver);
		HomePage hpage = lPage.LoginApplication(ObjectRepository.config.getUsername(), ObjectRepository.config.getPassword());
		ManageIncentivePrograms mIPage = hpage.OpenManageIncentivePrograms();
		mIPage.clickColumnoptions();
		Thread.sleep(2000);
		Logout();
		Thread.sleep(4000);
	}

}
