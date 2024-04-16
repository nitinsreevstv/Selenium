package com.test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class mobiHealGeneratePolicy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dev-web.trulymadly.com/");
		
		String phoneNum = "7390801090";
		
		driver.findElement(By.xpath("//input[@name='mobile-home']")).sendKeys(phoneNum);
		
		for ( int i = 1; i <=4; i ++) {
			
		driver.findElement(By.id("otpinput"+i+"-home")).sendKeys("1");
		
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class=\" \"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String name = "Priyanshu";
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your full name\"]")).sendKeys(name);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[text()='12']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[text()='Apr']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[text()='1998']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//p[text()='Amritsar']")).click();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//p[text()='Single']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()='Software Engineer']")).click();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//p[text()='Masters']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()='Computer']")).click();
		Thread.sleep(500);
		
		String companyName = "Mobisec";
		
		driver.findElement(By.xpath("//input[@placeholder=\"Add Company\"]")).sendKeys(companyName);
		
		driver.findElement(By.id("salary-pack-1")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()='Simple']")).click();
		driver.findElement(By.xpath("//p[text()='Sexy']")).click();
		driver.findElement(By.xpath("//p[text()='CarLover']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("newImage")).sendKeys("F:\\Best 20\\IMG_20201014_115646.jpg");
		driver.findElement(By.cssSelector(".react-drawer-overlay")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[text()='Upload']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".Button__TitleIcon-sc-qvpvnq-0")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
