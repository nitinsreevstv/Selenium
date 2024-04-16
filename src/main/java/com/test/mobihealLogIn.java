package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobihealLogIn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://mobiheal.in/");
		
		driver.findElement(By.tagName("a")).click();
	}

}
