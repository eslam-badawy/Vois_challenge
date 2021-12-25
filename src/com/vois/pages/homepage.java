//This file contains all elements and methods related to the Home page
package com.vois.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vois.base.testbase;

public class homepage extends testbase {

	public homepage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	// This is the textbox element
	@FindBy (xpath = "//input[@type='text']")
	WebElement Textbox;
	
	// This method will enter the searchInput(vodafone) in the textbox
	public firstpage entersearch() throws IOException {
	Textbox.sendKeys(prop.getProperty("searchinput") + Keys.ENTER);
	Textbox.clear();
	return new firstpage();
	}
	
	
}
