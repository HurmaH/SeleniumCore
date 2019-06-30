package part2_Mehothods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsMethods1 {
	public static void main(String[] args) {
		
		//setting property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//creating object
		WebDriver driver = new ChromeDriver();
		//will open url
		driver.get("https://www.facebook.com/");
		
		//1. Locator ID
		//find email element, then sends string to input on that element
		//email has class inputtext
		driver.findElement(By.id("email")).sendKeys("hurmik@yahoo.com");
		
		
		//2.Locator name
		//find password object, then sends string to input on that element
	    driver.findElement(By.name("pass")).sendKeys("123456");
	    
	    //3.Locator linkText
	    //find Forgot account? button, then click
	    driver.findElement(By.linkText("Forgot account?")).click();
	    
	    
	    driver.close();
	    
	    
		
	}

}
