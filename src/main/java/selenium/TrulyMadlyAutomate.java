package selenium;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TrulyMadlyAutomate {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties pro = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\selenium\\src\\main\\java\\selenium\\config.properties");
		pro.load(ip);
		String browser = pro.getProperty("Browser");
		
		if(browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			
			driver = new ChromeDriver();
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String tmUrl = pro.getProperty("tmLink");
		
		driver.get(tmUrl);
		
		String number = pro.getProperty("phoneNumber");
		
		driver.findElement(By.xpath("//input[@name='mobile-home']")).sendKeys(number);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("otpinput1-home")).sendKeys("1");
		driver.findElement(By.id("otpinput2-home")).sendKeys("1");
		driver.findElement(By.id("otpinput3-home")).sendKeys("1");
		driver.findElement(By.id("otpinput4-home")).sendKeys("1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=\"Me\"]")).click();
		
		driver.findElement(By.xpath("//div[text()='Settings']")).click();
		
		scrollDown(driver);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Delete Account']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()=\"Didn't like it here\"]")).click();
		
		Thread.sleep(1000);
		
		scrollDown(driver);
		
		driver.findElement(By.xpath("//p[text()='Boring conversations']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Okay']")).click();
		
		
	}
	
	public static void scrollDown(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,250)", "");
	}
}
