package browserclass;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	private static FirefoxDriver frDriver;
	
	public static FirefoxDriver getFireFoxDriver(){
		frDriver = new FirefoxDriver();
		return frDriver;
	}

}
