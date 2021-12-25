//This file contains all elements and methods related to the Second page

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
	
	// This is the search result elements in the second page
	@FindBy (xpath = "//h3[@class]")
	List<WebElement> SearchResults2;
	
	// This method will return the count of search result elements in the second page
	public int CountOfSecondPage() {
		int SecondPageResults =SearchResults2.size();
		return SecondPageResults;
		}
	
	// The next button
	@FindBy (xpath = "//*[@id=\"pnnext\"]/span[2]")
	WebElement next3;
	
	// Click on the next button to go to the third page
	public thirdpage next3() throws IOException {
		next3.click();
		return new thirdpage();
		}
	

}
