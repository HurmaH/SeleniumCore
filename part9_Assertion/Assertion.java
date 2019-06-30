package part9_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {

		// set properties of webdriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		// create WebDriver object
		WebDriver driver = new ChromeDriver();

		// go to URL
		driver.get("https://spicejet.com");

		// Assertion to check whether it gives false, if false continue
		// Assert.assertFalse(condition);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

		// Assertion to check whether it gives True, if true continue
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		// how many chackboxes
		// css path for all checkboxes: input[type='checkbox']
		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);

		// find Passengers box and click
		WebElement passenger = driver.findElement(By.cssSelector("div[id='divpaxinfo']"));
		passenger.click();
		Thread.sleep(2000);// slows code so following elements will be reachable
		// print text on that box
		System.out.println(passenger.getText());

		// find + sign and click
		// click until Adult number until 6
		int i = 1;
		while (i < 6) {
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
			i++;
		}
		// find done button and click

		driver.findElement(By.id("btnclosepaxoption")).click();
		// print text on that box

		// Asserion to check expected text is "6 Adult" or not
		// Assert.assertEquals(actual, expected);
		Assert.assertEquals(passenger.getText(), "6 Adult");
		System.out.println(passenger.getText());

	}

}
