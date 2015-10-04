package testcases.module.incentiveprogm;

import objectrepo.ObjectRepository;

import org.testng.annotations.Test;

import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.ManageIncentivePrograms;
import pageobjectmodel.NewProgram;
import pageobjectmodel.SalesIncentiveTemplateBasic;
import baseclass.BaseClass;

public class TestSalesIncentiveTemplate extends BaseClass {
	
	@Test
	public void TestSalesIncentiveTemp() throws InterruptedException {
		LoginPage lpage = new LoginPage(ObjectRepository.driver);
		HomePage hPage = lpage.LoginApplication(ObjectRepository.config.getUsername(), ObjectRepository.config.getPassword());
		ManageIncentivePrograms mIPage = hPage.OpenManageIncentivePrograms();
		NewProgram npPage = mIPage.clickNewProgram();
		SalesIncentiveTemplateBasic sitPage = npPage.CreateSalesIncentiveTemplate();
	}

}
