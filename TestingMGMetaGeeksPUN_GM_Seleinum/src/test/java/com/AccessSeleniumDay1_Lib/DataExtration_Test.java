package com.AccessSeleniumDay1_Lib;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumday1.SeleniumDay1_CommonMethods;
import com.seleniumday1.SeleniumDay1_Lib;
public class DataExtration_Test {	
	WebDriver driver = new ChromeDriver();	
	//create object
	SeleniumDay1_Lib sd1l = new SeleniumDay1_Lib();
	SeleniumDay1_CommonMethods scm1 = new SeleniumDay1_CommonMethods();
  @Test(priority=1)
  public void Extract_Page_Content() {
	  sd1l.init(driver);
	  sd1l.InvokeAwesomeQaApp();
	  scm1.init0(driver);
	  String pgsource = scm1.Extract_PageSource_Content(); 
	  System.out.println(pgsource);
  }
}
