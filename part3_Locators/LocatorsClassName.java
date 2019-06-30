package part3_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClassName {
	public static void main(String[] args) {
		
		//setting property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//creating object
		WebDriver driver = new ChromeDriver();
		//will open url
		driver.get("https://www.facebook.com/");
		
		//1. Locator class ="inputtext"
		driver.findElement(By.className("inputtext")).sendKeys("hurmik@yahoo.com");
		
		
		//2.Locator class ="inputtext"
	    driver.findElement(By.className("inputtext")).sendKeys("123456");
	    
	    //Selenium will look from top left, as both of the elemnts has same className
	    //and whenever it gets first element it identifies it.
	    
	    
		
	}

}
