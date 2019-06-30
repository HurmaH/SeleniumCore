package part4_ParentChild_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithText{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Appium ']")).click();
		
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
			
	    driver.findElement(By.xpath("//li[text()=' Soap UI ']")).click();
		
		driver.findElement(By.xpath("//li[text()=' Testing ']")).click();
		
	}


}
