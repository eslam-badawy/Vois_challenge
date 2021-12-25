package com.vois.testcases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.vois.base.testbase;

public class config extends testbase{

	public config() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	@BeforeSuite
	public void start() {
		extent = new ExtentReports("D:\\workspace\\vois\\report\\index.html",true);
		extent.addSystemInfo("OS", "windows");
		extent.addSystemInfo("owner", "eslam badawy");
		extent.addSystemInfo("Test name", "Vodafone challenge");
		extent.addSystemInfo("Language","JAVA");
		extent.addSystemInfo("FrameWork Design", "Page Object");
		
	}
	
	
	@AfterSuite
	public void end() {
		extent.flush();
		
	}
	
	
	

}
