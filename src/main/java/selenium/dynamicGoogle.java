package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicGoogle {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		Properties pro = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\selenium\\src\\main\\java\\selenium\\config.properties");
		pro.load(ip);
		
		String searchText = pro.getProperty("googleSearch");
		
		driver.findElement(By.name("q")).sendKeys(searchText);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class=\"pcTkSc\"]"));
		
		System.out.println(list.size());
		
		for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("testing interview questions")) {
				list.get(i).click();
				break; 
			}
		}
	}

}
