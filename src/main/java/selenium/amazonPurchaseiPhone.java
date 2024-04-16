package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonPurchaseiPhone {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Amazon");
		search.submit();
		
		driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
		
		WebElement amazonSearch = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		amazonSearch.sendKeys("I Phone 12");
		
		amazonSearch.submit();
		
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 12 (64GB) - Purple'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println(allWindowHandles); // All handler Id
		
		Iterator<String> it = allWindowHandles.iterator(); 
		
		String parentId = it.next();
		
		System.out.println(parentId);	
		
		String childId = it.next();
		
		System.out.println(childId);
		
		driver.switchTo().window(childId);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.xpath("//input[@aria-labelledby=\"attach-sidesheet-checkout-button-announce\"]")).click();
		
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Nitin");
				
		driver.findElement(By.id("ap_phone_number")).sendKeys("8585859696");
		
		driver.findElement(By.id("ap_password")).sendKeys("#@Nitin12");
		
		driver.findElement(By.id("continue")).click();
		
		driver.switchTo().window(parentId);
		
		driver.navigate().refresh();
		
//		driver.close();
		
//		driver.quit();
	}

}
