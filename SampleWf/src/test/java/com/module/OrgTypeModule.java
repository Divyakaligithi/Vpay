package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.OrgTypeLocators;


public class OrgTypeModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	OrgTypeLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	OrgTypeLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	OrgTypeLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	OrgTypeLocators.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	OrgTypeLocators.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	OrgTypeLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	OrgTypeLocators.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	OrgTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	OrgTypeLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  OrgTypeLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  OrgTypeLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  OrgTypeLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  OrgTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}




}
