package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class bytelearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://stage.bytelearn.ai/");
		
		driver.findElement(By.xpath("//button[@class=\"home_ctaButton__muj_L\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"1st\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"2nd\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"3rd\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"4th\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"5th\"]")).click();
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.className("close-icon")).click();

	}

}
