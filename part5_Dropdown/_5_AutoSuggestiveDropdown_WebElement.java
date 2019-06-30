package part5_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_AutoSuggestiveDropdown_WebElement {
	public static void main(String[] args) throws InterruptedException {
		//set properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//create WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//go to URL
		driver.get("https://www.makemytrip.com/");
		
		//for repeating webElement
		WebElement source = driver.findElement(By.id("fromCity"));
		
		//find element From and click
		//driver.findElement(By.id("fromCity")).click();
		source.click();
		
		//type first three letters in FROM 
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mum");
				
		Thread.sleep(2000);
		
		//find Mumbai element and click
		driver.findElement(By.xpath("//div[@class='calc60']")).click();
		//OR send keys down and click
//		source.sendKeys(Keys.ARROW_DOWN);
//		source.sendKeys(Keys.ENTER);
		
		//type first three letters in TO 
		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
	    destination.sendKeys("del");
	    Thread.sleep(2000);
	    destination.sendKeys(Keys.ARROW_DOWN);
	    destination.sendKeys(Keys.ARROW_DOWN);
	    destination.sendKeys(Keys.ENTER);
	    
	    //System.out.println(source.getText());
	    //driver.findElement(By.id("toCity")).getText();
	}

}
