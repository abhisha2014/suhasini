package com.Craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.genericUtilities.BasePage;

public class BuyProduct extends BasePage
{
	public BuyProduct(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private  WebElement Sarees;
	@FindBy(xpath="//a[@href=\"https://www.craftsvilla.com/cvfeeds/craftsvilla-cotton-sarees\']")
	private WebElement CottonSarees;
    @FindBy(xpath="//img[contains@src,'https://img3.craftsvilla.com/image/upload/']")
    private WebElement product;
    @FindBy(id="buynow")
    private WebElement buynow;
    
}
