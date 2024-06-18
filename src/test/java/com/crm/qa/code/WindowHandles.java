package com.crm.qa.code;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver","D:\\Automation_Point\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwin= driver.getWindowHandle();
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> win = driver.getWindowHandles();

	}

}
