package part12_Synchronize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {

		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotels.com/");
		
		//this is implicit wait method:
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//find leaving from, type nyc, enter
		driver.findElement(By.id("qf-0q-destination")).sendKeys("nyc");
		driver.findElement(By.id("qf-0q-destination")).sendKeys(Keys.ENTER);
		//after this step page is loading but selenium tryes to proceed following step so need synchronization
		
		//click on the first link
		driver.findElement(By.linkText("The Hotel @ Times Square")).click();
	
	
	}

}
