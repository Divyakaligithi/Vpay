package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.UserStatusLocators;


public class UserStatusModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	UserStatusLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	UserStatusLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	UserStatusLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	UserStatusLocators.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	UserStatusLocators.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	UserStatusLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	UserStatusLocators.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	UserStatusLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	UserStatusLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  UserStatusLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  UserStatusLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  UserStatusLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  UserStatusLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}



}
