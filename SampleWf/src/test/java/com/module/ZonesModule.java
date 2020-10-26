package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.ZonesLocators;


public class ZonesModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	ZonesLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	ZonesLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	ZonesLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	ZonesLocators.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	ZonesLocators.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	ZonesLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	ZonesLocators.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	ZonesLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	ZonesLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  ZonesLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  ZonesLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  ZonesLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  ZonesLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}




}
