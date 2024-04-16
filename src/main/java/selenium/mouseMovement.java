package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver(); // with opening the browser
		
//		WebDriver driver = new HtmlUnitDriver(); // without opening the browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-le9fof r-1otgn73']//*[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8' and text()='Add-ons']"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='test-id-Extra Seat']")).click(); 
	 
		}

}
