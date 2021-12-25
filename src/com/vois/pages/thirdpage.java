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
	
	@FindBy (xpath = "//h3[@class]")
	List<WebElement> SearchResults3;
	
	
	
	public int CountOfthirddPage() {
		int thirdPageResults =SearchResults3.size();
		return thirdPageResults;
		}
	
	
}
