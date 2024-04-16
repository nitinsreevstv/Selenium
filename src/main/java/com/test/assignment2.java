package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://rahulshettyacademy.com/angularpractice");

		driver.findElement(By.className("form-control")).sendKeys("Priyanshu");

		driver.findElement(By.name("email")).sendKeys("psri7080@gmail.com");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pass@1234");
		
		driver.findElement(By.id("exampleCheck1")).click();

		Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));

		select.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("14-November-2020");

		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		
		System.out.println(driver.findElement(By.className("alert-success")).getText());


	}

}
