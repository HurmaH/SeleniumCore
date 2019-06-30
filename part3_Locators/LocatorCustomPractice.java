package part3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCustomPractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();//regular expression
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hurmik");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("1234");
		
		//contains
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}

}
