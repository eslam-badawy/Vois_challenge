package com.vois.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vois.base.testbase;

public class secondpage extends testbase {

	public secondpage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy (xpath = "//h3[@class]")
	List<WebElement> SearchResults2;
	
	@FindBy (xpath = "//*[@id=\"pnnext\"]/span[2]")
	WebElement next3;
	
	public int CountOfSecondPage() {
		int SecondPageResults =SearchResults2.size();
		return SecondPageResults;
		}
	
	public thirdpage next3() throws IOException {
		next3.click();
		return new thirdpage();
		}
	

}
