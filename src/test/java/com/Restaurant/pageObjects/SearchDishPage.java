package com.Restaurant.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchDishPage {

	WebDriver ldriver;
	
	public SearchDishPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//input[@id='dish-search']")
	@CacheLookup
	WebElement click_searchtxt;
	
	@FindBy(how = How.XPATH, using ="//button[@type='submit']/span")
	@CacheLookup
	WebElement clicksearchBtn;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'TaskUs Demo  13')]")
	@CacheLookup
	WebElement clicksearchDish;

		
	public void txt_SearchDish() {
		click_searchtxt.sendKeys("indian");
			
	}

	public void click_Search() {
		clicksearchBtn.click();
		
	}
	public void click_ChosenDish() {
		clicksearchDish.click();
		
	}
	

	
	
	
	
	
}
