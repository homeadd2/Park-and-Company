/**
 * 
 */
package configreader;

import interfaces.IReadConfiguration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;





import settings.BrowserType;
import settings.RelativePathUtils;

/**
 * @author - rahul.rathore
 * @date - 01-Oct-2015
 * @project - Park-and-Company
 * @package - configreader
 * @file name - ReadConfigProperty.java
 */
public class ReadConfigProperty implements IReadConfiguration {

	
	protected InputStream input = null;
	protected Properties prop = null;
	
	
	
	public ReadConfigProperty() {
		try {
			
			input = new FileInputStream(RelativePathUtils.getBaseDir("resources")  + "config.properties");
			prop = new Properties();
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ReadConfigProperty(String fileName) {
		try {
			input = new FileInputStream(RelativePathUtils.getBaseDir("resources") + fileName);
			prop = new Properties();
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getWebSite() {
		if(prop.getProperty("WebSite") == null)
			return "";
		return prop.getProperty("WebSite");
	}
	
	@Override
	public BrowserType getBrowser() {
		if(prop.getProperty("Browser") == null)
			return BrowserType.Firefox;
		return Enum.valueOf(BrowserType.class, prop.getProperty("Browser"));
	}
	
	@Override
	public String getUsername() {
		if(prop.getProperty("Username") == null)
			return "";
		return prop.getProperty("Username");
	}
	
	@Override
	public String getPassword() {
		if(prop.getProperty("Password") == null)
			return "";
		return prop.getProperty("Password");
	}
	
	@Override
	public int getElementLoadTimeOut() {
		if(prop.getProperty("ElementLoadTimeOut") == null)
			return 0;
		return Integer.parseInt(prop.getProperty("ElementLoadTimeOut"));
	}

	@Override
	public int getPageLoadTimeOut() {
		if(prop.getProperty("PageLoadTimeOut") == null)
			return 0;
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

}
