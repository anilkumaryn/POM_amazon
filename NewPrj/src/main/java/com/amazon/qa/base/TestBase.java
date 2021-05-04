package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.qa.util.TestUtil;

public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	
	
	public TestBase() {
		
		prop = new Properties();
		try {
			FileInputStream ip=new FileInputStream("/Users/ayeliyur/Desktop/ABG_GUI_Automation-main/NewPrj/src/main/java/com/amazon/qa/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public static void initilzation () {
		
		String browserName = prop.getProperty("broswer");
		if (browserName.equals("chrome")) {
			System.getProperty("webdriver.chrome.driver.", "C://Selenium//Chromedriver.exe");
			 driver=new ChromeDriver();
			
		} 
		// need to in Properties file under config package 
		else if (browserName.equals("firefox")) {
			System.getProperty("webdriver.chrome.driver.", "C://Selenium//Chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		// have it all iniliaztion done here for less wo
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPILCIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
	}

} 
