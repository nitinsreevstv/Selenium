package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeAutomate {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		Properties pro = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\selenium\\src\\main\\java\\selenium\\config.properties");
		pro.load(ip);
		
		String location1 = pro.getProperty("chromeDriver"); 
		
		String browser = pro.getProperty("Browser");
		
		if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", location1 + "chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", location1 + "edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.com");
		
		WebElement searchButton = driver.findElement(By.xpath("(//input[@value=\"Google Search\"])[2]"));
		
//		System.out.println(driver.getCurrentUrl());
		
		javaScriptExecutor js = new javaScriptExecutor();
		js.flash(searchButton, driver);
		
//		
		
		
		
		
	}

}
