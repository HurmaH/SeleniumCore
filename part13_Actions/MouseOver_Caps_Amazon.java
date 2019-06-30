package part13_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Caps_Amazon {
	public static void main(String[] args) {

		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		// CAPS all letters-keyDown(Keys.SHIFT), 
		//highlight - doubleClick()
		WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(box).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		// Moves to specific element
		WebElement moveTo = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//right click on element - contextClick()
		a.moveToElement(moveTo).contextClick().build().perform();
	}

}
