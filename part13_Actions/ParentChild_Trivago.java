package part13_Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentChild_Trivago {
	public static void main(String[] args) {

		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.com/");
		
		//driver.findElement(By.cssSelector("img[alt='best-family-vacations']")).click();//child window will open
		
		System.out.println("Before switching to child:");
	    System.out.println(driver.getTitle());//will give title of parent which means driver did not swtich to child 
		driver.findElement(By.cssSelector("*[alt='best-family-vacations']")).click();
	    
		Set <String> ids = driver.getWindowHandles(); //set data structure
		Iterator <String> itr = ids.iterator();
		String parentID = itr.next();
		String childID = itr.next();
		
		driver.switchTo().window(childID);
		System.out.println("After switching to child: ");
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println("After switching to parent: "+driver.getTitle());

	}

}
