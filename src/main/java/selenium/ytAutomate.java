package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ytAutomate {

	public static void main(String[] args) throws FindFailed 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com");
			
			driver.findElement(By.name("q")).sendKeys("Youtube" + Keys.ENTER);
			
			driver.findElement(By.xpath("(//h3[text()='YouTube'])[1]")).click();
			
			WebElement search = driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
			search.sendKeys("UP 53 Guider");
			search.submit();
			
			driver.findElement(By.xpath("//yt-formatted-string[text()='UP 53 Guider']")).click();
			
			List<WebElement> link = driver.findElements(By.xpath("//h3[@class=\"style-scope ytd-grid-video-renderer\"]"));
			
			for (int i = 0; i < link.size(); i++) {
				System.out.println(link.get(i).getText());
				if(link.get(i).getText().equals("#vlog - Gorakhpur to Nepal via Road with Sedan (#ciaz2020) #palpa #nepal #roadtrip #indiatonepal")) {
					link.get(i).click();
					break;
				}
			}
			
			String path = "C:\\\\Users\\\\acer\\\\eclipse-workspace\\\\selenium\\\\";
			
			Screen s = new Screen();
			
			Pattern pauseButton = new Pattern(path + "pouse.png");
			s.wait(pauseButton, 1000);
			
//			s.click();
			s.click();
			
			Pattern settings = new Pattern(path + "settings.png");
			s.wait(settings,1000);
			
			s.click();
			
			driver.quit();
		}

	}


