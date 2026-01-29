package comSeleniumDay2_Scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.seleniumday2Lib.SeleniumDay2Lib1;

public class SeleniumDay2Lib_S1 {
	
	WebDriver driver = new ChromeDriver();
	SeleniumDay2Lib1 obj = new SeleniumDay2Lib1();
	
	String ExpStr ="My Account";
  @Test(priority=1)
  public void Test_Login_Validate() throws InterruptedException {
	  obj.init(driver);
	  System.out.println(obj.Launch_OcartLogin());
	  Thread.sleep(2000);
	  String ActStr=obj.Perform_Login_Invalid("gayatrimis2@gmail.com","gayatrimis2@gmail.com");
	  Thread.sleep(4000);
	  System.out.println(ActStr);
	  Thread.sleep(4000);

	 //Assert.assertEquals(ExpStr,  ActStr);
  }
}
