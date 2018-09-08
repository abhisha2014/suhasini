package com.Craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.genericUtilities.BasePage;
import com.Craftsvilla.genericUtilities.BaseTest;

public class ProductDescription extends BasePage
{
public ProductDescription(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver,this);
}
@FindBy(id="addtocart")
private WebElement addtocart;
@FindBy(id="buynow")
private WebElement buynow;
@FindBy(id="address-email")
private WebElement Emailaddress;
@FindBy(id="address-first-name")
private WebElement EnterFirstName;
@FindBy(id="address-last-name")
private WebElement EnterLastName;
@FindBy(id="address-pincode")
private WebElement PinCode;
@FindBy(id="address-form-submit")
private WebElement DeliverAddress;
@FindBy(xpath="//div[@class='payment-type'][1]")
private WebElement cashondelivery;




public void clickonaddcart()
{
verifyElementPresent(addtocart);
addtocart.click();
}
public void clickbuynow()
{
verifyElementPresent(buynow);
buynow.click();
}
public void entermailadd(String email)
{
	verifyElementPresent(Emailaddress);
	Emailaddress.sendKeys( email);

}
public void Firstname(String Fname)
{
	verifyElementPresent(EnterFirstName);
	EnterFirstName.sendKeys(Fname);
}
public void Lastname(String Lname)
{
	verifyElementPresent(EnterLastName);
	EnterFirstName.sendKeys(Lname);
}
public void code(String ProductPincode)
{
	verifyElementPresent(PinCode);
	PinCode.sendKeys(ProductPincode);
	
}
       public  void Delivery()
   {
	   verifyElementPresent(DeliverAddress);
	   DeliverAddress.click();
		
   }
       public void Cashondelivery()
       {
    	   verifyElementPresent(cashondelivery);
    	   cashondelivery.click();
       }




}


