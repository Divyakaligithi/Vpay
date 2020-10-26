package com.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://vpay-admin-dev.ingwalabs.com/#/login");
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}
}
