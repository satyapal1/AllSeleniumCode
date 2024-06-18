package com.crm.qa.code;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;

		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\Latest Code\\AllSeleniumCode\\src\\test\\"
				+ "java\\com\\crm\\qa\\code\\config.properties");
		
		prop.load(fis);
		
		//System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Automation_Point\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
	}

}
