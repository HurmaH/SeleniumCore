package part3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCustomCSS {
	/*
	 * 1. From Chrome: email element html code:
       <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
       2. Customizde CSS template: tag[attribute='value'] -->>will find tag
                                   [attribute='value'] -->> will find by attribute
       3. after making custom css validate it in console              
                                 
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//1. tag[attribute='value']
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hurmik@yahoo.com");
		//2. [attribute='value']
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		driver.get("https://login.salesforce.com/");
		//3.tagname#idValue or #idValue
		driver.findElement(By.cssSelector("input#username")).sendKeys("loginName");
		
		//4.tagname.classValue
		//driver.findElement(By.cssSelector("input.input r4 wide mb16 mt8 password")).sendKeys("12234");
		//above cannot find because it has space
		
		//5.#idValue
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
