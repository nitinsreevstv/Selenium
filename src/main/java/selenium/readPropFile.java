package selenium;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class readPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\selenium\\src\\main\\java\\selenium\\config.properties");
		
		prop.load(ip);
		
		System.out.println("The Author of this program is " + prop.getProperty("name"));
		
		String url = prop.getProperty("URL");
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			
			driver = new ChromeDriver();
		}
		
		driver.get(url);
	}
}
