package com.Craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.genericUtilities.BasePage;

public class HomePage extends BasePage
{
	

	//initiatization
	public HomePage(WebDriver driver)
	
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	//Declaration
	@FindBy(xpath="//span[text()='Sign In']")                                     
	private  WebElement SignIn;
	@FindBy(xpath="//span[text()='Cart ']")
	private  WebElement Cart ;
	@FindBy(xpath="//i[@class='icon first_arrow hidden-xs']")
	private  WebElement account;
	@FindBy(xpath="//a[@herf='https://cvaccount.craftsvilla.com/customer/account/logout']")
	private  WebElement logout;
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private  WebElement Sarees;
	@FindBy(xpath="//a[contains(@href,'mens-fashion/?')]")
	private  WebElement mensfashion;
	
	//utilization
	public void clickOnSignIn()
	{
		verifyElementPresent(SignIn);
		SignIn.click();
	}
	public void clickoncart()
	{
		verifyElementPresent(Cart);
		Cart.click();
	
	}
	public void gotosarees()
	{
		verifyElementPresent(Sarees);
		mouseHover(driver,Sarees);
	}
	public void gotomensfashion()
	{
		verifyElementPresent(mensfashion);
		mouseHover(driver,mensfashion);
	}
	public void mouseHovertoaccount()
	{
		verifyElementPresent(account);
		mouseHover(driver,account);
	}
		public void clicklogout()
		{
			verifyElementPresent(logout);
			logout.click();
		}
	}
	
	
	
	


