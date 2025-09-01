package com.orangehrm.listeners;
 
	import com.aventstack.extentreports.Status;
	import com.orangehrm.Base.BaseTest;
	import com.orangehrm.utilities.ScreenshotUtilities;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
 
	import java.io.IOException;
 
	public class TestListener extends BaseTest implements ITestListener {
 
	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }
 
	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, "Test Passed: " + result.getMethod().getMethodName());
	    }
 
	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.log(Status.FAIL, "Test Failed: " + result.getMethod().getMethodName());
	        test.log(Status.FAIL, result.getThrowable());
 
	        try {
	            String screenshotPath = ScreenshotUtilities.capturescreen(driver, result.getMethod().getMethodName());
	            test.addScreenCaptureFromPath(screenshotPath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
 
	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.log(Status.SKIP, "Test Skipped: " + result.getMethod().getMethodName());
	    }
 
	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("====== Test Suite Started: " + context.getName() + " ======");
	    }
 
	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	        System.out.println("====== Test Suite Finished: " + context.getName() + " ======");
	    }
	}
 
 
 