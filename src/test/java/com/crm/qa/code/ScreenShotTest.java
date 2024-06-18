package com.crm.qa.code;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
        WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver","D:\\Automation_Point\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//a[normalize-space()='JAVA']")).click();
		
		//casting driver into takescreenshot store in ts
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Now using ts variable and call getScreenshotAs method(actual its take the screenshot) and take outputtype as a file(java.io pkg)
		//and now store it in file instance File file 
		File file = ts.getScreenshotAs(OutputType.FILE)	;
		
		//then store in a local file
		FileUtils.copyFile(file, new File("./ScreenShots/Image2.png"));
		
		
		

	}

}
