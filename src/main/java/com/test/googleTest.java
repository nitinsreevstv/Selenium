package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void googleOpen() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Amazon" + Keys.ENTER);
		String nam = driver.getTitle();
		System.out.println(nam);
	}
	
	@Test
	public void amazonTest() {
		driver.get("https://www.amazon.com");
		String nam = driver.getTitle();
		System.out.println(nam);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
