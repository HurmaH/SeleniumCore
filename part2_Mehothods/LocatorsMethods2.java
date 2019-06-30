package part2_Mehothods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsMethods2 {
	public static void main(String[] args) {
		
		//setting property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//creating object
		WebDriver driver = new ChromeDriver();
		//will open url
		driver.get("https://login.salesforce.com/");
		
		//1. Locator ID
		//find email element, then sends string to input on that element
		 driver.findElement(By.id("username")).sendKeys("Hurmikk");
		
		//2.Locator name
		//find password object, then sends string to input on that element
	      driver.findElement(By.name("pw")).sendKeys("12345");
	    
	    //3.Locator className, 
	    //but it should not contain space, if there is space:
	    //
	    driver.findElement(By.className("button r4 wide primary")).click();//expecting error because of space in classname
	    
	    
	    
	    
	    
	    //driver.close();
	    
	    
		
	}

}
