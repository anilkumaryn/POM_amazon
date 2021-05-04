package com.amazon.qa.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.qa.util.TestUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun extends TestUtil {

	static WebDriver driver;
	static Properties prop;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver.", "C://Selenium//Chromedriver.exe");
		driver=new ChromeDriver();
		

	// have it all iniliaztion done here for less wo
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPILCIT_WAIT, TimeUnit.SECONDS);
	
	
	driver.get("https://www.youtube.com/");
	

	}

}
