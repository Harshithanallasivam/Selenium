package com.SeleniumScenarios;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Selenium.Scenarios.SeleniumScenario1;

public class SeleniumScenarios1_Access<SeleniumScenarios1> {
	WebDriver driver = new FirefoxDriver();
	SeleniumScenario1 ssc = new SeleniumScenario1();
  @Test
  public void f() throws InterruptedException {
	  ssc.init(driver);
	  List<String> FinalOptions = ssc.searchOptions();
	  System.out.println(FinalOptions);
  }
  
}
