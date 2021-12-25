package com.vois.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vois.pages.firstpage;
import com.vois.pages.homepage;
import com.vois.pages.secondpage;
import com.vois.pages.thirdpage;
import com.vois.util.WebListener;



public class testbase {
	public static Properties prop;
	public static WebDriver driver;
	public static WebListener weblistener;
	public static EventFiringWebDriver e_driver;
	public static homepage homepage;
    public static firstpage firstpage;	
    public static secondpage secondpage;
    public static thirdpage thirdpage;
    public static ExtentReports extent;
	public static ExtentTest logger;

	
	public testbase() throws IOException { 
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\workspace\\vois\\src\\com\\vois\\config\\config.properties");
		prop.load(fis);
	}
	
	@Parameters({"browser"})
	public void initialization(String browser) {
		if (browser.contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}
		else if (browser.contentEquals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxPath"));
			driver = new FirefoxDriver();
		}
		else if (browser.contentEquals("edge"))
		{
			System.setProperty("webdriver.edge.driver",prop.getProperty("edgePath"));
			driver = new EdgeDriver();
		}
		
		weblistener = new WebListener();
		e_driver = new EventFiringWebDriver(driver);
		e_driver.register(weblistener);
		driver=e_driver;
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	
	
	
	
	
	
}
