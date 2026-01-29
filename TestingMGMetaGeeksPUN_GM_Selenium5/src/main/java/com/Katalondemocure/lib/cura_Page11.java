package com.Katalondemocure.lib;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cura_Page11 {
	WebDriver driver;
	FileReader fr;
	Properties p= new Properties();
	
	By unm= By.name("username");
	By pwd= By.name("password");
	By lg= By.id("btn-login");

	public void init_cura_Page11(WebDriver driver) {
		this.driver=driver;
	}
	public void Enter_Name_Login() throws IOException {
		String path1="C://Users//harshitha.n8//eclipse-workspace//TestingMGMetaGeeksPUN_GM_Selenium5//TestData//Data1.properties";
		fr= new FileReader(path1);
		p.load(fr);
		
		
		driver.findElement(unm).sendKeys(p.getProperty("username1"));
		driver.findElement(pwd).sendKeys(p.getProperty("password1"));
		System.out.println(p.getProperty("username1"));
		System.out.println(p.getProperty("password1"));
	}
	public void clc_login() {
		driver.findElement(lg).click();
	}

}
