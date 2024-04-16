package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
//		
		driver.findElement(By.name("firstname")).sendKeys("Priyanshu");
//		
		driver.findElement(By.name("lastname")).sendKeys("Srivastava");
		
		driver.findElement(By.name("reg_email__")).sendKeys("priyanshu@trulymaddly.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("123@pass#");
	
//		
		Select select = new Select(driver.findElement(By.name("birthday_day")));
//
		select.selectByVisibleText("12");
//		
//		driver.findElement(By.name("bizOnlyToBuy")).click();
//		
//		driver.findElement(By.id("BUSINESS_REG_FORM_SUBMIT")).click();
	}

}
