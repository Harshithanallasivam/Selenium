package com.AccessSeleniumDay1_Lib;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumday1.SeleniumDay1_CommonMethods;
import com.seleniumday1.SeleniumDay1_Lib;

public class Navigation_Test {
	
	WebDriver driver = new ChromeDriver();
	
	SeleniumDay1_Lib pg1 = new SeleniumDay1_Lib();
	SeleniumDay1_CommonMethods sdc = new SeleniumDay1_CommonMethods();
  @Test
  public void NavigateBackTest() throws InterruptedException {
	  
	  pg1.init(driver);
	  pg1.InvokeAwesomeQaApp();
	  sdc.init0(driver);
	  sdc.Navigate_Back();
	  
  }
}
