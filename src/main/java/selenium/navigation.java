package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException    {
		Properties pro = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\selenium\\src\\main\\java\\selenium\\config.properties");
		
		pro.load(ip);
		
		String browser = pro.getProperty("Browser");
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String url = pro.getProperty("URL");
		
		driver.get(url);
		
		String xpath_google = pro.getProperty("xpath_for_google_textarea");
		
		WebElement amazon = driver.findElement(By.xpath(xpath_google));
		
		String website = pro.getProperty("website");
		
		amazon.sendKeys(website);
		
		amazon.submit();
		
//		Thread.sleep(1000);
		
		String newUrl = driver.getCurrentUrl();
		
		driver.navigate().to(newUrl);
		
		String amazonXpath = pro.getProperty("amazon_xpath");
		
		driver.findElement(By.xpath(amazonXpath)).click();
		
		
		
	}

}
