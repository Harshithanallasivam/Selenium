package com.seleniumday2Lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDay2Lib1 {
	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	public String Launch_OcartLogin() {
		driver.get("https://www.awesomeqa.com/ui/index.php?route=account/login");
		String LoginPageTitle=driver.getTitle();
		return LoginPageTitle;
	}
	
	
	public String Perform_Login_Invalid(String email1, String password1){
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email1);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password1);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String confirmation_message=driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]")).getText();
		
		Actions act = new Actions(driver);
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/a/i"));
		act.moveToElement(e1).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[5]/a")).click();
		return confirmation_message;
		
	}
	public String Perform_Login_inInvalid(String email1, String password1) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email1);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password1);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String confirmation_message=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible')]")).getText();
		return confirmation_message;
	}
	

}
