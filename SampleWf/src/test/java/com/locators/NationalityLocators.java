package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NationalityLocators {


	 public static WebElement clickSystemsettings(WebDriver driver)
	    {
		WebElement clickSystemSettings = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/app-left-side-menu[1]/aside[1]/section[1]/ul[1]/li[3]/a[1]/span[1]"));
		return clickSystemSettings;
	    }
	
	//to click on reference code
	 public static WebElement clickrefrencecodes(WebDriver driver)
	    {
		WebElement clickreferencecodes = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/app-left-side-menu[1]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
		return clickreferencecodes;
	    }

	 //to click on dropdown
	 public static WebElement clickdropdown(WebDriver driver)
	    {
		WebElement selectdropdown = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[1]/div[1]/select[1]"));
		return selectdropdown;
	    }
	 
	
	 
	 
	 //to click on dropdown
	 public static void selectdropdown(WebDriver driver)
	   {   
	    Select drpIndustries = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
	    drpIndustries.selectByIndex(9);
	   }
	 
	 
	 //to click on '+'
	 public static WebElement clickicon(WebDriver driver)
	    {
		WebElement icon = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[1]/div[2]/button[1]"));
		return icon;
	    }
	 
	 
	//to enter code
	 public static WebElement code(WebDriver driver)
	    {
		WebElement code = driver.findElement(By.xpath("//input[@placeholder='Enter Code']"));
		return code;
	    }
	 
	 //to enter name
	 public static WebElement name(WebDriver driver)
	    {
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		return name;
	    }

	 
	//save
	 public static WebElement save(WebDriver driver)
	    {
		WebElement save = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		return save;
	    }
	 
	//
	 public static WebElement click(WebDriver driver)
	    {
		WebElement click = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		return click;
	    }
	// For Cancel Button.
	 public static WebElement cancel(WebDriver driver)
	    {
		WebElement cancel = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/div[1]/div[1]/div[1]/div[3]/button[1]"));
		return cancel;
	    }
	 
	//Creating a Duplicate Record.
	//to click on Add '+'
		 public static WebElement clickicon1(WebDriver driver)
		    {
			WebElement icon = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[1]/div[2]/button[1]"));
			return icon;
		    }
		 
		 
		//to enter code
		 public static WebElement code1(WebDriver driver)
		    {
			WebElement code = driver.findElement(By.xpath("//input[@placeholder='Enter Code']"));
			return code;
		    }
		 
		 //to enter name
		 public static WebElement name1(WebDriver driver)
		    {
			WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
			return name;
		    }
		
	   //save
		 public static WebElement save1(WebDriver driver)
		    {
			WebElement save = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
			return save;
		    }
		 
		
		 public static WebElement click1(WebDriver driver)
		    {
			WebElement click = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
			return click;
		    }
		// For Cancel Button.
		 public static WebElement cancel1(WebDriver driver)
		    {
			WebElement cancel = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/div[1]/div[1]/div[1]/div[3]/button[1]"));
			return cancel;
		    }
		 // For remove of pop up mssg.
		 public static WebElement Popup(WebDriver driver)
		    {
			WebElement cancel = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/div[1]/div[1]/div[1]/div[3]/button[1]"));
			return cancel;
		    }
		 
	 
	 
	 // for right click operation.
//	 Actions actions = new Actions(driver);
// WebElement elementLocator= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]"));
//actions.contextClick(elementLocator).perform();
	 
	 //Click on edit 
		 public static WebElement edit1(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[6]/div[1]/div[1]/div[1]/span[2]"));
			return edit;
		    }
	 //edit the name
		 public static WebElement nameE(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]"));//.clear();
			return edit;
		    }
	 //Re-enter the Name
		 public static WebElement RenameE(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]"));//.sendKeys("AB++");
			return edit;
		    }
	//to save
		 public static WebElement save2(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]"));//.click
			return edit;
		    }
	//Click on pivot table	
		 public static WebElement pivottable(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/div[1]/span[1]"));//.click;
			return edit;
		    }
//to check the checkbox
		 public static WebElement checkbox(WebDriver driver)
		    {
			WebElement option1 = driver.findElement(By.xpath("//div[@class='ag-primary-cols-header-panel']//div//span[@class='ag-icon ag-icon-checkbox-checked']"));									
		    option1.click();
		    return option1;
		    }
	//check the Name	
		 public static WebElement checkname(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/input[1]"));//.click;
			return edit;
		    }
	//For Name
		 public static WebElement forname(WebDriver driver)
		    {
		    WebElement name = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/span[1]"));									
			name.click();
			return name;
		    }
	//To clear name	 
		 public static WebElement clearname(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/input[1]"));//.clear;
			return edit;
		    }
// For Code	 
		 public static WebElement forcode(WebDriver driver)
		    {
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/input[1]"));//.sendKeys("Code");
			return edit;
		    }
// For code Click
		 public static WebElement c(WebDriver driver)
		    {
			WebElement code= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]"));
			//code.click();
			return code;
		    }
//To clear code	 
		 public static WebElement clearcode(WebDriver driver)
		    {
			WebElement code= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/input[1]"));//.clear();
			return code;
		    }
//	For status
		 public static WebElement forstatus(WebDriver driver)
		    {
			WebElement code= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/input[1]"));//.sendKeys("Status");
			return code;
		    }
//	For Click	 
		 public static WebElement clickstatus(WebDriver driver)
		    {
			WebElement code= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/input[1]"));
			return code;
		    }
//	For Filter
		 public static WebElement filte(WebDriver driver)
		    {
			WebElement code= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-referancecode[1]/section[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]/div[1]/span[1]"));//.click();
			return code;
		    }
	

}
