package part4_ParentChild_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathParentChild_GoogleSearch {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("30 weeks baby");
	
	driver.findElement(By.xpath("//input[@name='btnK']")).click();
	}

}
