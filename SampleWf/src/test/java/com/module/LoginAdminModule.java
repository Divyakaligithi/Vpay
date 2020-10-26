package com.module;

import org.openqa.selenium.WebDriver;

import com.locators.VpayAdminloginlocators;

public class LoginAdminModule {
	  static WebDriver driver;

	public static void adminlogin(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		VpayAdminloginlocators.SignIn(driver).click();
		Thread.sleep(5000);
		VpayAdminloginlocators.UserName(driver, "username").sendKeys("VPDADMIN");
		Thread.sleep(5000);
		VpayAdminloginlocators.Password(driver, "pswd").sendKeys("Venkat@123");
		Thread.sleep(5000);

		VpayAdminloginlocators.Loginbutton(driver).click();
		System.out.println("Admin login sucessfully");
			
	}
}
