/**
 * 
 */
package testcases.module.login;

import org.testng.annotations.Test;

import objectrepo.ObjectRepository;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ManageIncentivePrograms;
import baseclass.BaseClass;

public class TestLogin extends BaseClass {
	@Test
	public void testCaseOne() throws InterruptedException {
		LoginPage lPage = new LoginPage(ObjectRepository.driver);
		HomePage hpage = lPage.LoginApplication(ObjectRepository.config.getUsername(), ObjectRepository.config.getPassword());
		ManageIncentivePrograms mIPage = hpage.OpenManageIncentivePrograms();
		mIPage.clickColumnoptions();
		Thread.sleep(2000);
		Logout();
		
	}

}
