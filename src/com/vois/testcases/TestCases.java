package com.vois.testcases;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vois.base.testbase;
import com.vois.pages.homepage;
import com.vois.util.report;


public class TestCases extends testbase {

	
	public TestCases() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Parameters ({"browser"})
	@BeforeMethod
	public void setup(String browser, Method method) throws IOException{
		logger = extent.startTest(method.getName());
		initialization(browser);
		homepage = new homepage();
	    homepage.entersearch();
	    firstpage = homepage.entersearch();
	    secondpage = firstpage.next2();
	    thirdpage = secondpage.next3();

	}
	
	
	@Test
	public void check() throws IOException {

      	int	SecondPageResults= secondpage.CountOfSecondPage();
		int ThirdPageResults=  thirdpage.CountOfthirddPage();
	
		assertEquals(SecondPageResults, ThirdPageResults);	
	}
   
	@AfterMethod
	public void teardown (Method method , ITestResult result) throws IOException {
		
          report.takePicture(method.getName());
		
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			logger.log(LogStatus.PASS, "test passed");
			logger.log(LogStatus.PASS, "<a href='" + result.getName() + ".png" + "'><span class='lable info'>Download Snapshot</span></a>");
			
		}
		else if(result.getStatus() == ITestResult.FAILURE)
		{
			logger.log(LogStatus.FAIL, result.getThrowable());
			logger.log(LogStatus.FAIL, "<a href='" + result.getName() + ".png" + "'><span class='lable info'>Download Snapshot</span></a>");
			
		}
		else
		{
			logger.log(LogStatus.SKIP, "test skipped");

		}
		driver.quit();
	}

}

