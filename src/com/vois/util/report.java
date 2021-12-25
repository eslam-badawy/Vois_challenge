package com.vois.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.vois.base.testbase;

public class report extends testbase {

	public report() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeSuite
	public void start() {
		extent = new ExtentReports("D:\\workspace\\vois\\report\\index.html", true);
		extent.addSystemInfo("owner", "eslam");
	}
	
	
	@AfterSuite
	public void end() {
		extent.flush();
	}
	
	public static void takePicture(String name) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File ("D:\\workspace\\vois\\report\\"+name+".png"));
                                              	
	}    
	

}
