package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class registrartion {
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
		
		String regNum = pro.getProperty("reg_phone");
		
		driver.findElement(By.xpath("//input[@name='mobile-home']")).sendKeys(regNum);
		Thread.sleep(2000);
		
		driver.findElement(By.id("otpinput1-home")).sendKeys("1");
		driver.findElement(By.id("otpinput2-home")).sendKeys("1");
		driver.findElement(By.id("otpinput3-home")).sendKeys("1");
		driver.findElement(By.id("otpinput4-home")).sendKeys("1");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=' ']")).click();
		
		driver.findElement(By.xpath("//button[@class='Button__Wrapper-sc-qvpvnq-1 dipuxs']")).click();
		
		String name = pro.getProperty("Name"); 
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(name);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='12']")).click();
		
		driver.findElement(By.xpath("//button[text()='Apr']")).click();
		
		driver.findElement(By.xpath("//button[text()='1998']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Feet']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Feet']")).sendKeys("5");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Inche\"]")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Inche\"]")).sendKeys("7");
		
		driver.findElement(By.xpath("//button[@class='Button__Wrapper-sc-qvpvnq-1 ghJwNC']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Mumbai']")).click();
		
		Thread.sleep(1000);
		
//		String city = pro.getProperty("City");
//		
//		driver.findElement(By.xpath("//div[@class=\"RegistrationStyle__CitySearchBox-sc-1xzh429-21 fCQehK\"]")).sendKeys(city);
//		
//		driver.findElement(By.xpath("//p[text()='Kushinagar, Uttar Pradesh, India']")).click();
//		
		driver.findElement(By.xpath("//p[text()='Single']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Job']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Masters']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Computer']")).click();
		
		Thread.sleep(1000);
		
		String company = pro.getProperty("Company");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Add Company\"]")).sendKeys(company);
		
		driver.findElement(By.xpath("//p[text()='Private']")).click();
		
		driver.findElement(By.xpath("//button[@class=\"Button__Wrapper-sc-qvpvnq-1 gbUfOQ\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Friendly']")).click();
		driver.findElement(By.xpath("//p[text()='Sexy']")).click();
		driver.findElement(By.xpath("//p[text()='Funny']")).click();
		
		driver.findElement(By.xpath("//button[@class='Button__Wrapper-sc-qvpvnq-1 kJSzcx']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"newImage\"]")).sendKeys("C:\\Users\\acer\\Pictures\\InkedIMG_20230611_113741.jpg");
		
		driver.findElement(By.xpath("//button[@class=\"Button__Wrapper-sc-qvpvnq-1 ckLwbl\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"Button__Wrapper-sc-qvpvnq-1 gbUfOQ\"]")).click();
		
	
		
		
	}

}
