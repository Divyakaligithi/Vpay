package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.MinWages;


public class MinWagesModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	MinWages.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	MinWages.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	MinWages.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	MinWages.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	MinWages.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	MinWages.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	MinWages.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	MinWages.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	MinWages.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	MinWages.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	MinWages.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	MinWages.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	MinWages.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	MinWages.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	MinWages.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	MinWages.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	MinWages.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  MinWages.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  MinWages.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  MinWages.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  MinWages.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}


}
