package part15_EndToEndPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksCount {
	public static void main(String[] args) {

		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //better than thread.sleep
		
		//1. Give the count of link
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Give the count of link in footer only
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. Give the count of link of first column in footer
		WebElement firstColDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int colLinkSize = firstColDriver.findElements(By.tagName("a")).size();
		System.out.println(colLinkSize);
		
		//4. Click on each link in the columnDriver and check if the pages are open
		for (int i=1; i<colLinkSize; i++) { //link at index 0 is not working
			
			//firstColDriver.findElements(By.tagName("a")).get(i).click();this will just click first link
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			//Thread.sleep(5000);
		}
		
		Set <String>ids = driver.getWindowHandles();
		Iterator <String> iter = ids.iterator();
		
		while(iter.hasNext()) {//checking whethter it has next iterator or not
			
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
