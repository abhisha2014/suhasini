package com.Craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Craftsvilla.genericUtilities.BasePage;

public class SignInPage extends BasePage
{
	

	@FindBy(id="emailId")
	private WebElement email;
	@FindBy(id="userPassword")
	private WebElement enterpassword;
	@FindBy(id="loginCheck")
	private WebElement login;
	@FindBy(id="set-password")
   private WebElement password;
	@FindBy(id="continueBtn")
	private WebElement continuebtn;
	@FindBy(id="userRegister")
	private WebElement registerbtn;

	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setemail(String emailaddress)
	{
		verifyElementPresent(email);
		email.sendKeys(emailaddress);
		
	}
	public void setpassword(String pwd)
	{
		verifyElementPresent(password);
		password.sendKeys(pwd);
	}
	public void clickcontinue()
	{
		verifyElementPresent(continuebtn);
		continuebtn.click();
	}
	public void clickregister()
	{
		verifyElementPresent(registerbtn);
		registerbtn.click();
	}
	public void waitforhomepage(String title)
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.titleContains(title));
		
	}
	public void  enterpassword(String pwd)
	{
		verifyElementPresent(enterpassword);
		enterpassword.sendKeys(pwd);
	}
	public void clicklogin()
	{
		verifyElementPresent(login);
		login.click();
	}
	
	
			
		
		


		
	
	}


		