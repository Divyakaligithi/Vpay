package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.GradeLocators;


public class GradeModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	GradeLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	GradeLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	GradeLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	GradeLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	GradeLocators.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	GradeLocators.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	GradeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	GradeLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	GradeLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	GradeLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	GradeLocators.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	GradeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	GradeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	GradeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	GradeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	GradeLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	GradeLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  GradeLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  GradeLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  GradeLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  GradeLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}

}
