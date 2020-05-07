package com.Restaurant.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Restaurant.pageObjects.LoginPage;
import com.Restaurant.pageObjects.SearchDishPage;
import com.Restaurant.utilities.XLUtils;

public class TC_SearchForDish_002 extends TC_LoginTest_001
{

	@Test
	public void Search_Dish() throws InterruptedException
	{
		Thread.sleep(1000);
		TC_LoginTest_001 Tc1 = new TC_LoginTest_001();
		SearchDishPage s = new SearchDishPage(driver);
		s.txt_SearchDish();
		logger.info("Entered Indian");
		s.click_Search();
		logger.info("Clicked Serach Button");
		s.click_ChosenDish();
		logger.info("Chosen the Indian Restaurant Successfully");
	}
	}
	
	
	
	

