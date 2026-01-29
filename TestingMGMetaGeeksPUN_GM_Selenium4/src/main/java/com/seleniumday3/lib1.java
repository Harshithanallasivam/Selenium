package com.seleniumday3;
import org.openqa.selenium.WebDriver;

public class lib1 {
	WebDriver driver;
	public lib1(WebDriver driver) {
		this.driver=driver;
	}
	public String gettitle() {
		driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
		String title = driver.getTitle();
		return title;
	}

}
