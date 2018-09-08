package com.Craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.genericUtilities.BasePage;


public class SareesPage extends BasePage
{


	public  SareesPage (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@herf='Georgette Sarees']")
	private WebElement GeorgetteSarees;
	@FindBy(xpath="//a[@herf='Party Wear']")
	private WebElement Partyware;
	@FindBy(xpath="//a[@herf='Embroidered Sarees']")
	private WebElement EmbroideredSarees;

	
	public void clickonGeorgetteSarees()
	{
		 verifyElementPresent(GeorgetteSarees);
		GeorgetteSarees.click();
	}
	public void clickonPartyWear()
	{
		 verifyElementPresent(Partyware);
		Partyware.click();
	}
	public void clickonEmbroideredSarees ()
	{
		verifyElementPresent(EmbroideredSarees);
		EmbroideredSarees.click();
	}
}
	
	
				
		
		
		

	
	


