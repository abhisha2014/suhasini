package com.Craftsvilla.genericUtilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;



public class BasePage
{
	public WebDriver driver=null;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void verifyTitle(String exp_title)
	{
		WebDriverWait w=new WebDriverWait(driver,60);
		try
		{
			w.until(ExpectedConditions.titleContains(exp_title));
			String act_title=driver.getTitle();
			Assert.assertEquals(act_title,exp_title);
			
		}
		catch(Exception e)
		{
			Reporter.log("mismatch in the title of the webpage");
		}
	}
	public void  verifyElementPresent(WebElement signIn)
	{
		WebDriverWait w=new WebDriverWait(driver,60);
		try
		{
			w.until(ExpectedConditions.visibilityOf(signIn));
			Reporter.log(signIn+"found");
		}
		catch(Exception e) 
		{
			Reporter.log(signIn+"Not found");
		}
	}
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		try
		{
			Actions action=new Actions(driver);
			action.moveToElement(ele).perform();
			Reporter.log(ele+"mousehoverd on");
		}
		catch(Exception e)
		{
			Reporter.log(ele+"unable to mousehoverd on");
		}
	
	}
}
