package com.seleniumday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase001 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.awesomeqa.com/ui");
	    String PgTitle = driver.getTitle();
	    System.out.println(PgTitle);
	}

}
