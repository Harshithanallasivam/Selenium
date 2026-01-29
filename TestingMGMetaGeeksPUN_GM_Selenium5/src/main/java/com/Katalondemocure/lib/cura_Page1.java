package com.Katalondemocure.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cura_Page1 {
	WebDriver driver;
	public void cura_Page1_init(WebDriver driver) {
		this.driver=driver;
	}
	
	By validatePg1=By.xpath("//*[contains(text(),'We Care About Your Health')]");
	By mkap=By.id("btn-make-appointment");
    By mkappform = By.xpath("//h2[contains(text(),'Make Appointment')]");
	
	public String LaunchApp(String BaseURL) {
		driver.get(BaseURL);
		String val1="The app is launched successfully";
		String val2="Check the URL again!";
		
		if(driver.findElement(mkap).isDisplayed()) {
			return val1;
		}else {
			return val2;
		}

	}
	public String Click_On_Make_An_Appoinment() {
		driver.findElement(mkap).click();
	    String mkaptext=driver.findElement(mkappform).getText();
	    return mkaptext;
		}
	}