package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorConcept {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchBox.sendKeys("keyboard");
		
		WebElement searchClick = driver.findElement(By.id("nav-search-submit-button"));
		
		searchClick.click();
		
		driver.findElement(By.xpath("//*[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//*[@class='rush-component s-featured-result-item ']//*[@class='a-section aok-relative s-image-fixed-height']//img[@class='s-image']")).click();
		
		driver.findElement(By.name("submit.addToCart")).click();
	}

}
