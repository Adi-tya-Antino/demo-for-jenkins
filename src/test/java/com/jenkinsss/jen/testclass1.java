package com.jenkinsss.jen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass1 {
	
	public static WebDriver driver;
	
@SuppressWarnings("deprecation")
	@BeforeMethod
	public void launchdriver() {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GCV\\Downloads\\chromedriver-win64");
		driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void Test1() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title 1 " +driver.getTitle());
		
	}
	@Test
	public void Test2() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title 2 " +driver.getTitle());
		
	}
	@Test
	public void Test3() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title 3 " +driver.getTitle());
		
	}
	@AfterMethod
	public void quit() {
//		driver.quit();
	}

	
}
