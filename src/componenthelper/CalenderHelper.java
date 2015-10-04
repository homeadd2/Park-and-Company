package componenthelper;

import org.openqa.selenium.By;

import objectrepo.ObjectRepository;
import baseclass.BaseClass;

public class CalenderHelper extends BaseClass {
	
	
	private static void clickHeader(String tableXpath) throws InterruptedException {
		ObjectRepository.driver.findElement(By.xpath(tableXpath + "/thead/tr[1]//strong")).click();
		Thread.sleep(1000);
	}
	
	private static void selectMonth(String tableXpath,String month) {
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <=3; j++){
				if(GenericHelper.isElementPresentQuick(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span"))){
					String aMonth = ObjectRepository.driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span")).getText();
					if(month.equalsIgnoreCase(aMonth)){
						ObjectRepository.driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span")).click();
						return;
					}
				}
			}
		}
	}
	
	private static void selectYear(String tableXpath,String year) {
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <=5; j++){
				if(GenericHelper.isElementPresentQuick(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span"))){
					String aYear = ObjectRepository.driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span")).getText();
					if(year.equalsIgnoreCase(aYear)){
						ObjectRepository.driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span")).click();
						return;
					}
				}
			}
		}
	}
	
	private static void selectDay(String tableXpath,String day) {
		for(int i = 1; i <= 6; i++){
			for(int j = 2; j <=8; j++){
				if(GenericHelper.isElementPresentQuick(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span"))){
					String aday = ObjectRepository.driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span")).getText();
					if(day.equalsIgnoreCase(aday)){
						ObjectRepository.driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + i + "]/td[" + j + "]//span")).click();
						return;
					}
				}
			}
		}
	}
	
	public static void selectDate(String tableXpath,String day,String month,String year) throws InterruptedException {
		clickHeader(tableXpath);
		Thread.sleep(1000);
		clickHeader(tableXpath);
		Thread.sleep(1000);
		selectYear(tableXpath, year);
		Thread.sleep(1000);
		selectMonth(tableXpath, month);
		Thread.sleep(1000);
		selectDay(tableXpath, day);
		Thread.sleep(1000);
		
	}

}
