package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[descendant-or-self::text()='Click for JS Confirm']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(5000);
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[descendant-or-self::text()='Click for JS Confirm']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		
		Thread.sleep(5000);
		
		alert2.dismiss();
		
		driver.findElement(By.xpath("//button[descendant-or-self::text()='Click for JS Prompt']")).click();
		
		Alert alert3 = driver.switchTo().alert();
		
		System.out.println(alert3.getText());
		
		Thread.sleep(5000);
		
		alert3.sendKeys("nitin");
		
		alert3.accept();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
