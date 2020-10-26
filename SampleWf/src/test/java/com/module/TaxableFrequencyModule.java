package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.TaxableFrequency;


public class TaxableFrequencyModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	TaxableFrequency.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	TaxableFrequency.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	TaxableFrequency.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	TaxableFrequency.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	TaxableFrequency.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	TaxableFrequency.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	TaxableFrequency.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	TaxableFrequency.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	TaxableFrequency.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  TaxableFrequency.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  TaxableFrequency.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  TaxableFrequency.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  TaxableFrequency.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}

}
