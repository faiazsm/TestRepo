package com.AssignmentWD;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A02assignmentPOM {
	WebDriver driver;
	A02LoginTestPOM a;
	
  @Test
  public void Assignment02() throws InterruptedException, IOException {
	  a.enteruserName("Admin");
	  a.enterpassword("admin123");
	  a.clickOnLogin();
	  a.readTitle();
  }
  @AfterMethod
  public void afterMethod() {
	  a.logOut();
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  a = new A02LoginTestPOM(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
