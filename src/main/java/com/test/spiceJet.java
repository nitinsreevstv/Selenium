package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spiceJet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[1]")).sendKeys("Gop");
		driver.findElement(By.xpath("(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[2]")).sendKeys("Lucknow");
	
		String date = "14-November-2023";
		
		String[] newDate = date.split("-");
		
		String day = newDate[0];
		String month = newDate[1];
		String year = newDate[2];
		
//		for(int i = 0; i< newDate.length; i++) {
//			System.out.println(newDate[i]);
//		}
	
	
	
	
	
	
	}

}
