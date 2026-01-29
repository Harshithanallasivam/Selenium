package com.SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.seleniumday3.base1;
import com.seleniumday3.lib1;
import com.seleniumday3.lib2;

public class TestNGScripts extends base1{
	
	WebDriver driver;
	lib1 obj1;
	lib2 obj2;
	@BeforeClass
	public void setup() {
		driver =  (WebDriver) new ChromeDriver();
		obj1=new lib1(driver);
		obj2=new lib2(driver);
	}
  @Test
  public void f() throws InterruptedException {
	  String a=obj1.gettitle();
	  System.out.println(a);
	  int n=obj2.linkcount();
	  System.out.println(n);
  }
}
