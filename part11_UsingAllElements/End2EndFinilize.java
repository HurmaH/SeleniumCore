package part11_UsingAllElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndFinilize {
	public static void main(String[] args) throws InterruptedException {
		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");

		// 2.Select From and To cities
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL'])"))
				.click();// 2nd delhi

		// 3.Select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// 4. Return date should be disabled
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("Return date is disabled");
			Assert.assertTrue(true); // if inside this block it means it is successful

		} else {
			Assert.assertTrue(false);// if condition is not satisfied, so we fail the test
		}

		// 5. check Family and friends checkBox
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

		// 6.Enter 3 Adults
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		;
		Thread.sleep(2000);// slows code so following elements will be reachable

		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();// click on + button
		}

		driver.findElement(By.id("btnclosepaxoption")).click();// click on done button

		// 7.Select currency
		Select cur = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		cur.selectByValue("USD");

		// 8.Find search button and click
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		// driver.findElement(By.xpath("input[@type='submit']")).click();
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
