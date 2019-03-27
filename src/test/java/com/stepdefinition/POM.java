package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass {
	
	public POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement loginPass;

	
	@FindBy(name ="pass")
	private WebElement pass;


	public WebElement getLoginPass() {
		return loginPass;
	}


	public WebElement getPass() {
		return pass;
	}
	
}
