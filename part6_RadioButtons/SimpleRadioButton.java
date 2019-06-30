package part6_RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleRadioButton {
	public static void main(String[] args) {
		//set properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//create WebDriver object
		WebDriver driver = new ChromeDriver();
				
		//go to URL
		driver.get("http://echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Butter']")).click();
		
		//Assume no value attribute
		//count all radio buttons, all radio buttons has same name as group1
		int count  = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(count);
		
		
		//itirating and clicking each of the radio button
		for (int i=0; i<count; i++) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		
		//itirate so that it will click only when text is "Butter"
		for (int i=0; i<count; i++) {
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			//System.out.println(text);
			
			if (text.equals("Butter")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
	}

}
