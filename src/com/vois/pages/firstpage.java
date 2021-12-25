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
	
	
	@FindBy (xpath = "//*[@id=\"pnnext\"]/span[2]/span")
	WebElement next2;
	
	public secondpage next2() throws IOException {
		next2.click();
		return new secondpage();
		}


}
