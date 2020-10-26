package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.module.LoginAdminModule;
import com.module.MinWagesModule;
import com.utility.BaseClass;

public class MinWagesTestcase extends BaseClass{

	@Test
	public void referencecode() throws InterruptedException, IOException 
{
	Thread.sleep(3000);
	LoginAdminModule.adminlogin(driver);
	Thread.sleep(2000);
	
	
	
	MinWagesModule.referencecode(driver);

}
}
