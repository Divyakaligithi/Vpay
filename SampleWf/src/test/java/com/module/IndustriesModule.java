    package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.IndustriesLocators;
public class IndustriesModule {
	
		public static void referencecode(WebDriver driver) throws InterruptedException, IOException
		{
		Thread.sleep(5000);	
			IndustriesLocators.clickSystemsettings(driver).click();
			Thread.sleep(5000);
			
			IndustriesLocators.clickrefrencecodes(driver).click();
			Thread.sleep(5000);
			
			//to click on dropdown
			IndustriesLocators.clickdropdown(driver).click();
			Thread.sleep(5000);
			
			
			
			//to click on '+'
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(2000);
			
			

			//to enter code
			IndustriesLocators.code(driver).sendKeys("I10");
			Thread.sleep(5000);
			
			//to enter name
	        IndustriesLocators.name(driver).sendKeys("Groceries");
			Thread.sleep(5000);

		
			//TO save
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(5000);
			
			//73
			
			//For Cancel Button.
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(5000);

			//Creating a Duplicate Record.
			//to click on Add '+'
			
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(2000);
					
					
	       //to enter code
			IndustriesLocators.code(driver).sendKeys("7");
			Thread.sleep(5000);
					
			//to enter name
			IndustriesLocators.name(driver).sendKeys("A+");
			Thread.sleep(5000);
					
			//TO save
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(5000);
			
		   //116
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(5000);
			
		  // For Cancel Button.	
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(5000);
			
		 // For remove of pop up mssg.	
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(5000);
			
			// for right click operation. 137
			
		
		//Click on edit 	
			IndustriesLocators.clickicon(driver).click();
			Thread.sleep(5000);
			
		//edit the name	
			IndustriesLocators.clickicon(driver).clear();
		  Thread.sleep(5000);
		  
		//Re-enter the Name	
		  IndustriesLocators.code(driver).sendKeys("2Aa");
		  Thread.sleep(5000);
			
		//to save
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		  
	    //Click on pivot table
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		
		//to check the checkbox 
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		
		//check the Name
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		  
		//For Name
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		  
		//To clear name 
		  IndustriesLocators.name(driver).clear();
		  Thread.sleep(5000);
		  
		// For Code
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		  
		// To clear code	  
		  IndustriesLocators.name(driver).clear();
		  Thread.sleep(5000);		
			       
		// For status
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		  
	   // For Click
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		  
	   //For Filter. 
		  IndustriesLocators.clickicon(driver).click();
		  Thread.sleep(5000);
		  
		  	  
			
	}
}
