package com.AccessSeleniumDay1_Lib;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.seleniumday1.SeleniumDay1_CommonMethods;
import com.seleniumday1.SeleniumDay1_Lib;
import junit.framework.Assert;
public class Awesome_TC_01 {
	WebDriver driver = new ChromeDriver();
	SeleniumDay1_CommonMethods pg0 = new SeleniumDay1_CommonMethods();
	SeleniumDay1_Lib pg1= new SeleniumDay1_Lib();
	String  Exp_HomePgTitleIs = "Your Store";
  @Test(priority=1)
  public void InvokeApp_Awesome() {
	  pg0.init0(driver);
	  pg0.Maximize_Browser_Windows();
	  pg1.init(driver);
	  pg0.Delete_Cookies_From_BrowserWindow();
	  pg1.InvokeAwesomeQaApp();
	  String HomePgTitlesIs= pg1.AwesomeHome_PageTitle();
	  System.out.println("HomePgTitleIs"+" "+ HomePgTitlesIs);
  }
  @Test(priority=2)
  public void Fetch_And_Validate_Title() {
	  String HomePgTitlesIs= pg1.AwesomeHome_PageTitle();
	  System.out.println("HomePgTitleIs"+" "+ HomePgTitlesIs);  
	  Assert.assertEquals(HomePgTitlesIs, Exp_HomePgTitleIs);
  }
  @Test(priority=3)
  public void Count_Links_Test() throws InterruptedException {
	  List cnt=pg1.Count_links_From_HomePage();
	  System.out.println("Total number of links: "+" "+cnt);
  }
}
