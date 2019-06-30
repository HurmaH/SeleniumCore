package part6_RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtun_dynamicHandling {
	public static void main(String[] args) {
		//set properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//create WebDriver object
		WebDriver driver = new ChromeDriver();
				
		//go to URL
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		
		//count all radio buttons, all radio buttons has same name as group1
		int count  = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(count);
		
	}

}
