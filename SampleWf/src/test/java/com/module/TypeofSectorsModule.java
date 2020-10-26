package com.module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.locators.TypeofSectorsLocators;


public class TypeofSectorsModule {

	public static void referencecode(WebDriver driver) throws InterruptedException, IOException
	{
	Thread.sleep(5000);	
	TypeofSectorsLocators.clickSystemsettings(driver).click();
	Thread.sleep(5000);
	
	TypeofSectorsLocators.clickrefrencecodes(driver).click();
	Thread.sleep(5000);
	
	//to click on dropdown
	TypeofSectorsLocators.clickdropdown(driver).click();
	Thread.sleep(5000);
	
	
	
	//to click on '+'
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(2000);
	
	

	//to enter code
	TypeofSectorsLocators.code(driver).sendKeys("5");
	Thread.sleep(5000);
	
	//to enter name
	TypeofSectorsLocators.name(driver).sendKeys("Hour");
	Thread.sleep(5000);


	//TO save
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	//73
	
	//For Cancel Button.
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(5000);

	//Creating a Duplicate Record.
	//to click on Add '+'
	
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(2000);
			
			
   //to enter code
	TypeofSectorsLocators.code(driver).sendKeys("7");
	Thread.sleep(5000);
			
	//to enter name
	TypeofSectorsLocators.name(driver).sendKeys("HOUR");
	Thread.sleep(5000);
			
	//TO save
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
   //116
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
  // For Cancel Button.	
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
 // For remove of pop up mssg.	
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
	// for right click operation. 137
	

//Click on edit 	
	TypeofSectorsLocators.clickicon(driver).click();
	Thread.sleep(5000);
	
//edit the name	
	TypeofSectorsLocators.clickicon(driver).clear();
  Thread.sleep(5000);
  
//Re-enter the Name	
  TypeofSectorsLocators.code(driver).sendKeys("2Aa");
  Thread.sleep(5000);
	
//to save
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//Click on pivot table
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);

//to check the checkbox 
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);

//check the Name
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Name
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//To clear name 
  TypeofSectorsLocators.name(driver).clear();
  Thread.sleep(5000);
  
// For Code
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// To clear code	  
  TypeofSectorsLocators.name(driver).clear();
  Thread.sleep(5000);		
	       
// For status
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
// For Click
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
//For Filter. 
  TypeofSectorsLocators.clickicon(driver).click();
  Thread.sleep(5000);
  
  	  
	
	}


}
