package com.module;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.locators.CalculationTypeLocators;

public class CalculationTypeModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	CalculationTypeLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	CalculationTypeLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	CalculationTypeLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	CalculationTypeLocators.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	CalculationTypeLocators.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	CalculationTypeLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	CalculationTypeLocators.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	CalculationTypeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	CalculationTypeLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  CalculationTypeLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  CalculationTypeLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  CalculationTypeLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  CalculationTypeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}

}
