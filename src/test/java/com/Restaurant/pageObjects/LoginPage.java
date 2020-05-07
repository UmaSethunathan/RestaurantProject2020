package com.Restaurant.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="postcode")
	@CacheLookup
	WebElement txtcode;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement click_submitBtn;
	
	@FindBy(xpath="//span[contains(text(),'open restaurants')]")
	@CacheLookup
	WebElement count;
		
	public void setPostcode()
	{
		txtcode.sendKeys("AR511AA");
	}
	
		
	
	public void clickSubmit()
	{
		click_submitBtn.click();
	}	
	
	public void restaruntaCount()
	{
		System.out.println("Total number of Restaurants: "+count.getText());
	}
	
	
	
}









