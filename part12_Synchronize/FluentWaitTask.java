package part12_Synchronize;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTask {
	public static void main(String[] args) {

		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");

		// click link , click start button
		driver.findElement(By.xpath("//a[@href='/dynamic_loading/1']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		// driver.findElement(By.cssSelector("[id='start'] button")).click();

		// FluentWait is a class implementing wait interface
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
			 if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
				return driver.findElement(By.cssSelector("[id='finish'] h4"));//if it found return "Hello World!" object
			 }else {
				return null;
			 }
			}
				
		});
		
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}
}
