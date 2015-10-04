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
		LoginPage lpage = new LoginPage(ObjectRepository.driver);
		HomePage hPage = lpage.LoginApplication(ObjectRepository.config.getUsername(), ObjectRepository.config.getPassword());
		ManageIncentivePrograms mIPage = hPage.OpenManageIncentivePrograms();
		NewProgram npPage = mIPage.clickNewProgram();
		ActivityIncentiveTemplate aiPage =  npPage.CreateActivityIncentiveTemplate();
		aiPage.SelectProgramName("Test", "Test");
		aiPage.SelectProgramVisibilityStartDate("05", "April", "2002");
		aiPage.SelectProgramVisibilityEndDate("01", "October", "2002");
		aiPage.SelectProgramStartDate("26", "April", "2002");
		aiPage.SelectProgramEndDate("30", "November", "2015");
		aiPage.SelectProgramLastSubmitDate("01", "December", "2015");
		aiPage.SelectProgramCloseDates("31", "December", "2015");
		aiPage.AddPoints("1001", "22", "Hello1");
		aiPage.AddPointType("test", "100");
		aiPage.AddProgramIncentive("CODE1", "TPE1", "TesTing", "100");
		aiPage.AddEligibleGroup("test");
		aiPage.checkValidationField(true, false, true, false, false);
		Thread.sleep(2000);
		Logout();
	}

}
