package com.kaelondemocura.scripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Katalondemocure.lib.cura_Page1;
import com.Katalondemocure.lib.cura_Page11;
import com.Katalondemocure.lib.cura_PageAppointment;

public class TestScripts001 {
	WebDriver driver = new ChromeDriver();
	cura_Page1 cpage1=new cura_Page1();
	//cura_Page2 cpage2=new cura_Page2();
	cura_Page11 cpage11=new cura_Page11();


  @Test(priority=1)
  public void InvokeApp() {
	  cpage1.cura_Page1_init(driver);
	  cpage1.LaunchApp("https://katalon-demo-cura.herokuapp.com/");
  }
  @Test(priority=2)
  public void Click_Make_appointment() {
	  String capp=
	  cpage1.Click_On_Make_An_Appoinment();
	  System.out.println(capp);
  }
  @Test(priority=3)
  public void PerformLogin_User() throws IOException {
	  cpage11.init_cura_Page11(driver);
	  cpage11.Enter_Name_Login();
	  cpage11.clc_login();
	  cura_PageAppointment cura_PageAppointment = new cura_PageAppointment();
	  cura_PageAppointment.appForm();
  }
  
}
