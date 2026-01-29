package com.seleniumday1;

import org.openqa.selenium.WebDriver;

public class SeleniumDay1_CommonMethods {
	
	WebDriver driver;
	public void init0(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Maximize_Browser_Windows() {
		driver.manage().window().maximize();
	}
	public void Delete_Cookies_From_BrowserWindow() {
		driver.manage().deleteAllCookies();
	}
	public void Navigate_Back() {
		driver.navigate().back();
	}
//	public void Navigate_Forward() {
//		driver.navigate().forward();
//	}
//	public void Navigate_Refresh() {
//		driver.navigate().refresh();
//	}
	
	//Extract page source\
	public String Extract_PageSource_Content() {
		String pgs=driver.getPageSource();
		return pgs;
	}


}
