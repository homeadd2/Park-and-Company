package testcases.module.incentiveprogm;

import objectrepo.ObjectRepository;

import org.testng.annotations.Test;

import pageobjectmodel.ActivityIncentiveTemplate;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ManageIncentivePrograms;
import pageobjectmodel.NewProgram;
import baseclass.BaseClass;

public class TestActivityIncentiveTemplate extends BaseClass {
	
	@Test
	public void TestActivityIncentiveTemp() throws InterruptedException{
		Logout();
		LoginPage lpage = new LoginPage(ObjectRepository.driver);
		HomePage hPage = lpage.LoginApplication(ObjectRepository.config.getUsername(), ObjectRepository.config.getPassword());
		ManageIncentivePrograms mIPage = hPage.OpenManageIncentivePrograms();
		NewProgram npPage = mIPage.clickNewProgram();
		ActivityIncentiveTemplate aiPage =  npPage.CreateActivityIncentiveTemplate();
		Thread.sleep(2000);
		Logout();
	}

}
