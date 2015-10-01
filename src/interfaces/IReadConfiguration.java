package interfaces;

import settings.BrowserType;



public interface IReadConfiguration {
	
	/**
	 * @return the url from file
	 */
	public String getWebSite();
	
	/**
	 * @return the browser name from file
	 */
	public BrowserType getBrowser();
	
	/**
	 * @return the username of the application from file
	 */
	public String getUsername();
	
	/**
	 * @return the password of the application from file
	 */
	public String getPassword();
	
	/**
	 * @return the default implicit wait for element
	 */
	public int getElementLoadTimeOut();
	
	/**
	 * @return the page load time out 
	 */
	public int getPageLoadTimeOut();
}
