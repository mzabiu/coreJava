package com.java.driver.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void launchDriver() {

	}

	@AfterMethod(alwaysRun = true)
	public void afterExecution() {

	}

}
