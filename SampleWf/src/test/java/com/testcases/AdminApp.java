package com.testcases;

import org.testng.annotations.Test;

import com.module.LoginAdminModule;
import com.utility.BaseClass;

public class AdminApp extends BaseClass
{
	@Test
public static void adminloginapp() throws Exception 
{
	Thread.sleep(2000);
	LoginAdminModule.adminlogin(driver);
	return;
}
}
