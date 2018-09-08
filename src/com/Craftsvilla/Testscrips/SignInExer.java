package com.Craftsvilla.Testscrips;

import org.testng.annotations.Test;

import com.Craftsvilla.genericUtilities.BaseTest;
import com.Craftsvilla.genericUtilities.ReadExcel;
import com.Craftsvilla.pompages.HomePage;
import com.Craftsvilla.pompages.SignInPage;

public class SignInExer extends BaseTest
{
public HomePage hp=null;
public SignInPage sp=null;

@Test
public void SignIn()
{
	hp=new  HomePage(driver);
	sp=new SignInPage(driver);
	
	String[][] signincredentials=ReadExcel.getData(filepath,"Sign_In");
	 for(int i=1;i<signincredentials.length;i++)
	 {
		 String email=signincredentials[i][0];
		 String enterpassword=signincredentials[i][1];
		 
		 hp.clickOnSignIn();
		 sp.setemail(email);
		 sp.enterpassword(enterpassword);
		 sp.clicklogin();
		 hp.clicklogout();
 		sp.waitforhomepage("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
		 
	 }
	 
	
	
}

}
