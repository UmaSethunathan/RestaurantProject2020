package com.Restaurant.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class loginCredentialsPage {
WebDriver ldriver;
	
public loginCredentialsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
		
	@FindBy(how = How.XPATH, using ="//*[@id='Name']")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Email']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Password']")
	@CacheLookup
	WebElement txtpwd;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	@CacheLookup
	WebElement clickSubmit;
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div/div/div/div[2]/form/div[1]/div[2]/span")
	@CacheLookup
	WebElement captureErrorNme;
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div/div/div/div[2]/form/div[2]/div[2]/span")
	@CacheLookup
	WebElement captureErrorEmail;
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div/div/div/div[2]/form/div[3]/div[2]/span")
	@CacheLookup
	WebElement captureErrorpwd;
	
	public String enterName(String s) {
		txtName.clear();
		txtName.sendKeys(s);
		return s;
		
			
	}
	public String enterEmail(String e) {
		txtEmail.clear();
		txtEmail.sendKeys(e);
		return e;
		
	}
	
	public String enterPasswd(String p) {
		txtpwd.clear();
		txtpwd.sendKeys(p);
		return p;
}
	public void cickSubmit() {
		clickSubmit.click();
}
	public void captureErrorName()
	{
		
		System.out.println("issue name: "  +captureErrorNme.getText());
	}
	public void captureErrorEmail()
	{
		
		System.out.println("issue name: "  +captureErrorEmail.getText());
	}
	public void captureErrorpwd()
	{
		
		System.out.println("issue name: "  +captureErrorpwd.getText());
	}
}