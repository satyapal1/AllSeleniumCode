package com.crm.qa.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");

	}

}
