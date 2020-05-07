package com.Restaurant.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Restaurant.pageObjects.loginCredentialsPage;
import com.Restaurant.utilities.XLUtils;

public class TC_AddLoginCredentials_003 extends SignUpBase {
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/Restaurant/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				
			
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}

	@Test(dataProvider="LoginData")
	public void SignUpTest(String name,String email,String pwd) throws  InterruptedException 
	{
		
	loginCredentialsPage lp=new loginCredentialsPage(driver);
	
	logger.info("Entered into SignUp");
	
	String a = lp.enterName(name);
	String b = lp.enterEmail(email);
	String c = lp.enterPasswd(pwd);
	lp.cickSubmit();
	if(a=="")
	{
		lp.captureErrorName();
		logger.info("Name is missing , unable to signup");
	}
	else if(b=="")
	{
		lp.captureErrorEmail();
		logger.info("Email is missing , unable to signup");
	}
	else if(c=="")
	{
		lp.captureErrorpwd();
		logger.info("pwd is missing , unable to signup");
	}
	else
	{
		logger.info("Successfully signup");
	}
	}

}
