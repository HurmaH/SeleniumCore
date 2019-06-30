package part12_Synchronize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {

		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotels.com/");
		
		//this is implicit wait method:
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//find leaving from, type nyc, enter
		driver.findElement(By.id("qf-0q-destination")).sendKeys("nyc");
		driver.findElement(By.id("qf-0q-destination")).sendKeys(Keys.ENTER);
		//after this step page is loading but selenium tryes to proceed following step so need synchronization
		
		WebDriverWait d = new WebDriverWait (driver,20);
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("The Hotel @ Times Square")));
		//OR
		d.until(ExpectedConditions.elementToBeClickable(By.linkText("The Hotel @ Times Square")));
		
		//click on the hotel link
		driver.findElement(By.linkText("The Hotel @ Times Square")).click();
	
	
	}

}
