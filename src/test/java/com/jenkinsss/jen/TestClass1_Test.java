package com.jenkinsss.jen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1_Test {

    public static WebDriver driver;

    @SuppressWarnings("deprecation")
    @BeforeMethod
    public void launchDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GCV\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title 1: " + driver.getTitle());
    }

    @Test
    public void test2() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title 2: " + driver.getTitle());
    }

    @Test
    public void test3() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title 3: " + driver.getTitle());
    }

    @AfterMethod
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
