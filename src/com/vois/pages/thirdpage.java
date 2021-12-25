// This is all elements and methods related to the Third page
package com.vois.pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vois.base.testbase;

public class thirdpage extends testbase {
	public thirdpage() throws IOException {
		PageFactory.initElements(driver, this);

	}
	
	// This is the search result elements in the third page
	@FindBy (xpath = "//h3[@class]")
	List<WebElement> SearchResults3;
	
	
	// This method will return the count of search result elements in the third page
	public int CountOfthirddPage() {
		int thirdPageResults =SearchResults3.size();
		return thirdPageResults;
		}
	
	
}
