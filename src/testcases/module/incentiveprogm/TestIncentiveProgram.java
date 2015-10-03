package testcases.module.incentiveprogm;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import componenthelper.ButtonHelper;
import componenthelper.GenericHelper;
import objectrepo.ObjectRepository;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ManageIncentivePrograms;
import settings.ErrorMessage;
import baseclass.BaseClass;

public class TestIncentiveProgram extends BaseClass {
	
	@Test
	public void TestColumnOptions() throws InterruptedException {
		Logout();
		LoginPage lpage = new LoginPage(ObjectRepository.driver);
		HomePage hPage = lpage.LoginApplication(ObjectRepository.config.getUsername(), ObjectRepository.config.getPassword());
		ManageIncentivePrograms mIPage = hPage.OpenManageIncentivePrograms();
		mIPage.clickColumnoptions();
		GenericHelper.waitForElement(By.name("columnOptionsForm"));
		Assert.assertTrue(GenericHelper.isElementPresent(By.name("columnOptionsForm")), ErrorMessage.pageLoadErrMsg + "Column Option Grid");
		ButtonHelper.click(By.id("addAttributeClose"));
		Thread.sleep(2000);
		Logout();
	}

}
