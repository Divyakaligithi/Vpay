package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.NationalityLocators;


public class NationalityModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	NationalityLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	NationalityLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	NationalityLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	NationalityLocators.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	NationalityLocators.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	NationalityLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	NationalityLocators.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	NationalityLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	NationalityLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  NationalityLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  NationalityLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  NationalityLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  NationalityLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}



}
