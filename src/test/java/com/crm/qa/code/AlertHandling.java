package com.crm.qa.code;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver","D:\\Automation_Point\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//simple alert
//		driver.findElement(By.id("alertBox")).click();
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
//		Thread.sleep(2000);
		
		//confirmation Alter
		
		/*
		 * driver.findElement(By.id("confirmBox")).click(); Alert
		 * alt1=driver.switchTo().alert(); System.out.println(alt1.getText());
		 * //alt1.accept(); alt1.dismiss(); Thread.sleep(2000);
		 * System.out.println(driver.findElement(By.id("output")).getText());
		 */
		
		//Propmpt popup
		driver.findElement(By.id("promptBox")).click();
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());
		
		
		alt1.sendKeys("satya");
		
		alt1.accept();
		//alt1.dismiss();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());
	}

}
