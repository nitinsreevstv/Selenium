package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class javaScriptExecutor {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties pro = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\selenium\\src\\main\\java\\selenium\\config.properties");
		
		pro.load(ip);
		
		String browser = pro.getProperty("Browser");
		
		if(browser.equals("Chrome" )) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String facebook = pro.getProperty("facebook");
		
		String username = pro.getProperty("username");
		
		String password = pro.getProperty("password");
		
		driver.get(facebook);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		
		WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
		
		javaScriptExecutor js = new javaScriptExecutor();
		
		js.flash(logIn, driver); // flashing the button
		
		drawBorder(logIn, driver); // bordering the button
	// code for screenshot
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,  new File("C:\\Users\\acer\\Downloads\\image.jpg"));
	
		// Alert Message Print 
		generateAlert(driver,"The page have error");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
	}

	
	
	public void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		
		for(int i = 0; i <100; i ++) {
			changecolor("rgb(255,0,0)", element, driver);
			changecolor(bgcolor, element, driver);
		}
		
	}
	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '" +color+ "'", element);
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	private static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}

}
