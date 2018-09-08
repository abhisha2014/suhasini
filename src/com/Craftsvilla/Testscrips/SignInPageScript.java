package com.Craftsvilla.Testscrips;

import org.testng.annotations.Test;

import com.Craftsvilla.genericUtilities.BaseTest;
import com.Craftsvilla.pompages.SignInPageExer;

public class SignInPageScript extends BaseTest
{
	public SignInPageExer SPE=null;

	@Test
	public void SignIn(String emailaddress,String pwd)
	{
		SPE=new SignInPageExer(driver);
		
		SPE.clickonsignin();
		SPE.enteremail(emailaddress);
		SPE.clickcontinue();
		SPE.Displayenterpassword();
		SPE.enterpassword(pwd);
		
		
		
	}
}
