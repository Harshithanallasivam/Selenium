package com.seleniumday3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class lib2 {
	WebDriver driver;
	public lib2(WebDriver driver) {
		this.driver=driver;
		
	}
	public int linkcount() throws InterruptedException {
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		int count = Links.size();
		return count;
	}

}
