package com.Craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.genericUtilities.BasePage;

public class EmbroideredSarees extends BasePage
{

	public EmbroideredSarees(WebDriver driver) 
	{
		super(driver);
   PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall'][1]")
      private WebElement Sarees;
	@FindBy(xpath="//a[text()='Embroidered Sarees']")
	private WebElement EmbroideredSarees;
	@FindBy(xpath="//span[text()='Below  500']")
	private WebElement Below500;
	@FindBy(xpath="//span[text()='500-1000']")
	private WebElement below1000;
	
	
	
}
