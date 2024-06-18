package com.crm.qa.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Point\\chromedriver.exe");
		 driver = new ChromeDriver();

	}

}
