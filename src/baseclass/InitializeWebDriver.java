package baseclass;

import objectrepo.ObjectRepository;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import browserclass.ChromeBrowser;
import browserclass.FirefoxBrowser;
import componenthelper.GenericHelper;
import componenthelper.NavigationHelper;
import configreader.ReadConfigProperty;
import customexception.NoSuchBrowserException;


public class InitializeWebDriver {
	
	@BeforeTest
	public void setUp() {
		
		ObjectRepository.config = new ReadConfigProperty();
		
		switch (ObjectRepository.config.getBrowser()) {
		
		case Chrome:
			ObjectRepository.driver = ChromeBrowser.getChromeDriver();
			break;
			
		case Firefox:
			ObjectRepository.driver = FirefoxBrowser.getFireFoxDriver();
			break;

		default:
			throw new NoSuchBrowserException("Browser Not Found : " + ObjectRepository.config.getBrowser().toString());
		}
		
		GenericHelper.windowMaximize();
		GenericHelper.setElementLoadTimeOut(ObjectRepository.config.getElementLoadTimeOut());
		GenericHelper.setPageLoadTimeOut(ObjectRepository.config.getPageLoadTimeOut());
		NavigationHelper.navigateToWebsite();
			
	}
	
	@AfterTest(alwaysRun=true)
	public void tearDown() {
		if(ObjectRepository.driver != null)
			ObjectRepository.driver.quit();
	}

}
