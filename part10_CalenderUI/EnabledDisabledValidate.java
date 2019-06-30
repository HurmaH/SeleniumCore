package part10_CalenderUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisabledValidate {
	public static void main(String[] args) throws InterruptedException {
		// set properties of webdriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		// create WebDriver object
		WebDriver driver = new ChromeDriver();

		// go to URL
		driver.get("https://spicejet.com");

		// for some methods isEnabled method is working for some not,Selenium gets
		// confused and cannot work exactly
		// so we can change below isEnable() method to getAttribute
//			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		// getAttribute() before clicking "Two Way"
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		// find radio button "Round Trip",once round trip selected second table will be
		// enabled
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// getAttribute() after clicking "Two Way"
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("its enabled");
			Assert.assertTrue(true); // if inside this block it means it is successful

		} else {
			Assert.assertFalse(false);// if condition is not satisfied, so we fail the test
		}

	}

}
