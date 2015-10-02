package componenthelper;

import objectrepo.ObjectRepository;

public class NavigationHelper {
	
	public static void navigateToWebsite() {
		ObjectRepository.driver.navigate().to(ObjectRepository.config.getWebSite());
		
	}
	
	public static void navigateToWebsite(String webSite) {
		ObjectRepository.driver.navigate().to(webSite);
	}

}
