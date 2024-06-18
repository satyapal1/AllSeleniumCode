package com.crm.qa.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver","D:\\Automation_Point\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get("https://qa-my.innago.com/");
		 * driver.findElement(By.xpath("//input[@placeholder='Email Address']")).
		 * sendKeys("satya_cus@yopmail.com");
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		 * "Pass@123");
		 * driver.findElement(By.xpath("//button[@id='signin-button']")).click();
		 */
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Satya");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select sct = new Select(driver.findElement(By.id("course")));
		sct.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Ravi");
				
	}

}
