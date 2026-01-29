package com.AccessSeleniumDay1_Lib;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class test {
  @Test(dataProvider = "dp")
  public void f(String user, String pwd) {
	  System.out.println("User:"+user);
	  System.out.println("Password:"+pwd);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"abc@gmail.com","abcdef"},
      new Object[] {"def@gmail.com", "ghijkl"},
      new Object[] {"anush@gmail.com","mnopq" },
      new Object[] {"athul@gmail.com","rstuv"}
    };
  }
}
