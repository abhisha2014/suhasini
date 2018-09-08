package com.Craftsvilla.Testscrips;


import org.testng.annotations.Test;

import com.Craftsvilla.genericUtilities.BaseTest;
import com.Craftsvilla.genericUtilities.ReadExcel;
import com.Craftsvilla.pompages.HomePage;
import com.Craftsvilla.pompages.SignInPage;

public class SignUpScripts extends BaseTest
{
	
	

	public HomePage hp=null;
	public SignInPage sp=null;

        @Test
        public void signUp()
        {
        	hp=new HomePage(driver);
        	sp=new SignInPage(driver);
        	
        
			String[][] credentials=ReadExcel.getData(filepath,"Sign_Up");  
        	for(int i=1;i<credentials.length;i++)       
        	{
        		String email=credentials[i][0];
        		String password=credentials[i][1];
        		
        		hp.clickOnSignIn();
        		sp.setemail(email);
        		sp.clickcontinue();
        		sp.setpassword(password);
        		sp.clickregister();
        		hp.mouseHovertoaccount();
        		hp.clicklogout();
        		sp.waitforhomepage("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
        	}
        		
        		
        		
        		
        		
        		
        		
        		
        		
        	}

	

}
