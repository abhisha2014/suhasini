package com.Craftsvilla.pompages;

import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.genericUtilities.BasePage;

public class SignInPageExer extends BasePage
{

	public SignInPageExer(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Sign In']")
	private  WebElement SignIn;	
	@FindBy(id="facebookSignInBtn")
	private WebElement Facebook;
	@FindBy(xpath="//span[@class='icon']")
	private WebElement Google;
	@FindBy(id="login-signup-msg")
	private WebElement ProvideEmail;
	@FindBy(id="emailId")
	private WebElement enteremail;
	@FindBy(id="continueBtn")
	private WebElement continuebtn;
	@FindBy(xpath="//label[text()='Enter Password']")
	private WebElement enterpassword;
    @FindBy(xpath="//div[@class='error-msg']")
	private WebElement ErrorMsg;
    @FindBy(id="forgotPasswordLink")
    private WebElement ForgotPassword;
    @FindBy(id="userPassword")
	private WebElement Password;
    @FindBy(id="loginCheck")
	private WebElement login;
    @FindBy(id="terms-condition-text")
    private WebElement Byregistering;
    
    public void clickonsignin()
	{
		verifyElementPresent(SignIn);
		SignIn.click();
	}
    public void enteremail(String emailaddress)
	{
		verifyElementPresent(enteremail);
		enteremail.sendKeys(emailaddress);
	}
    public void enterpassword(String pwd)
	{
		verifyElementPresent(Password);
		Password.sendKeys(pwd);
	}
    public void loginSignupMsg(String msg)
    {
    	verifyElementPresent(ErrorMsg);
    	ErrorMsg.getText();
    }
    public void clickcontinue()
	{
		verifyElementPresent(continuebtn);
		continuebtn.click();
	}
    public void Displayenterpassword()
    {
    	verifyElementPresent(enterpassword);
    	enterpassword.click();
    }
	
		
	}
    
    
	


