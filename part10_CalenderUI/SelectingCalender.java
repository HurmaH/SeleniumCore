package part10_CalenderUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectingCalender {
	public static void main(String[] args) throws InterruptedException {
		// set properties of webdriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		// create WebDriver object
		WebDriver driver = new ChromeDriver();

		// go to URL
		driver.get("https://www.path2usa.com/travel-companions");
		
		//selecting exact date and month 
		//August 23
		driver.findElement(By.id("travel_date")).click();
		
		//Selecting month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August")) {
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		//selecting 23
		List<WebElement> days = driver.findElements(By.className("day"));
		for (int i=0; i<days.size(); i++) {
			String dayText = days.get(i).getText();
			if (dayText.equals("23")) {
				days.get(i).click();
				break;
			}
		}

	}

}
