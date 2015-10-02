package browserclass;

import org.openqa.selenium.chrome.ChromeDriver;

import settings.RelativePathUtils;

public class ChromeBrowser {
	
	private static ChromeDriver chrDriver;
	
	public static ChromeDriver getChromeDriver(){
			String chromePath = RelativePathUtils.getBaseDir("resources"); 
			System.setProperty("webdriver.chrome.driver", chromePath + "chromedriver.exe");
			chrDriver = new ChromeDriver();
			return chrDriver;
		}

}
