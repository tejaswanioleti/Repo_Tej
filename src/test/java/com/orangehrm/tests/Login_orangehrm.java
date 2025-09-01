package com.orangehrm.tests;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.orangehrm.Base.BaseTest;
import com.orangehrm.pages.loginpage;
import com.orangehrm.utilities.ExcelUtilities;
import com.orangehrm.utilities.ScreenshotUtilities;
 
public class Login_orangehrm extends BaseTest{
	
	 static String projectpath=System.getProperty("user.dir")  ;
	@Test(dataProvider="logindata")
	public void verifylogin(String username, String password) throws IOException
	
	{    
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ExtentTest test = extent.createTest("login with the user:"+username);
		loginpage obj=new loginpage(driver);
		obj.enterusername(username);
		obj.enterpassword(password);
		obj.clickonbutton();
		
		if(obj.dashisdisplayed())
		
		{
			test.pass("Login is sucess for user:"+username);
			
		}
		else
			test.fail(" login unsuccess for the user:"+username).addScreenCaptureFromPath(ScreenshotUtilities.capturescreen(driver, "Verify login"));
	
	
	if((driver.getTitle()).equals("orange"))
	{
		test.pass("title is matched");
	}
	else
		test.fail("title is not matched").addScreenCaptureFromPath(ScreenshotUtilities.capturescreen(driver, "Verify login"));
 
	}
	@DataProvider
	public Object[][] logindata() throws IOException
	{
		return ExcelUtilities.getdata(projectpath+"\\src\\test\\resources\\Orangehrm_Testdata\\data.xlsx", "Sheet1");
	}
 
}