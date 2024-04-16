package selenium;

import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\acer\\\\eclipse-workspace\\\\selenium\\\\src\\\\main\\\\java\\\\selenium\\\\config.properties");
		
		pro.load(fis);
		
		String Url1 = pro.getProperty("URL");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get(Url1);
		
		WebElement putinput = driver.findElement(By.name("q"));
		
		putinput.sendKeys("selenium");
		
		putinput.submit();
		
		Thread.sleep(3000);
		
		String s = driver.getTitle();
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		
//		driver.switchTo().window(s);
		driver.navigate().to(s1);
		
		Thread.sleep(1000);
		
		WebElement urlClick = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		
		urlClick.click();
		
//		driver.close();
	}

}
