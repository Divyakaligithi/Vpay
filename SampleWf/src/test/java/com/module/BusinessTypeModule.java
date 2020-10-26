package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.BusinessTypeLocators;

public class BusinessTypeModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	BusinessTypeLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	BusinessTypeLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	BusinessTypeLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	BusinessTypeLocators.code(driver).sendKeys("I10");
	Thread.sleep(5000);
	
	//to enter name
	BusinessTypeLocators.name(driver).sendKeys("Groceries");
	Thread.sleep(5000);


	//TO save
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	BusinessTypeLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	BusinessTypeLocators.name(driver).sendKeys("Dairy Parlour");
	Thread.sleep(5000);
			
	//TO save
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	BusinessTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	BusinessTypeLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  BusinessTypeLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  BusinessTypeLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  BusinessTypeLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  BusinessTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}
	}
