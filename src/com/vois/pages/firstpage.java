//This file contains all elements and methods related to the First page
package com.vois.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vois.base.testbase;

public class firstpage extends testbase{

	public firstpage() throws IOException {
		PageFactory.initElements(driver, this);

	}
	
	// The next button
	@FindBy (xpath = "//*[@id=\"pnnext\"]/span[2]/span")
	WebElement next2;
	
	// Click on the next button to go to the second page
	public secondpage next2() throws IOException {
		next2.click();
		return new secondpage();
		}


}
