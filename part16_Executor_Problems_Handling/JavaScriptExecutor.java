package part16_Executor_Problems_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// enter key words BENG
		WebElement from = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		from.sendKeys("BENG");
		from.sendKeys(Keys.DOWN);

		// Verify whether "BENGALURU INTERNATION AIRPORT"
		System.out.println(from.getText());// not visible text, it is under class = hidden-accessible

		// JavaScript Dom can extract hidden elements
		// Selenium cannot identify hidden elements - (Ajax implementation)
		// investigate the properties of object if it have any hidden text

		// JavascripExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";// return JavaScript,
																					// System.out.println Java
		String text = (String) js.executeScript(script);// when it is executes scripts it returns the string
		System.out.println(text);
		int i = 0;// it is added to make conditions
		// BENGALURU INTERNATIONAL AIPORT
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			i++;
			from.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}
		}

		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}

	}

}
