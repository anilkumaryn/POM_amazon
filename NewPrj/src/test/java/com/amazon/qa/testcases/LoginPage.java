package com.amazon.qa.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Object Repo or page factory 
	
	@FindBy(name="email")
	WebElement Username ;
	
	@FindBy(id="continue")
	WebElement ClickonContinue;
	 
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@type=submit]")
	WebElement Submit;
	
	
	
}
