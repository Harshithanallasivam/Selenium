package com.Katalondemocure.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cura_PageAppointment {
	WebDriver driver;
	public void cura_Page1_init(WebDriver driver) {
		this.driver=driver;
	}
	By mkappform = By.xpath("//h2[contains(text(),'Make Appointment')]");
	By opt = By.xpath("//select//option[3]");
	By prg =By.id("//*[@id='radio_program_none']");
	public void appForm() {
		driver.findElement(mkappform);
		driver.findElement(opt);
		driver.findElement(prg);
		
	}
	public String Click_On_Make_An_Appoinment() {
		//driver.findElement(mkap).click();
	    String mkaptext=driver.findElement(mkappform).getText();
	    return mkaptext;
		}
}
//}
