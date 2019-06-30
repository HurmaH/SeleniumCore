package part5_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_ParentChild{
	public static void main(String[] args) throws InterruptedException {
		    //set properties of webdriver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
			//create WebDriver object
			WebDriver driver = new ChromeDriver();
			
			//go to URL
			driver.get("https://spicejet.com");
			
			//find element from
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			//find Benglar from dropdown
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			// Benglar xpath ://a[@value='BLR']
			//Delhi xpath: //a[@value='DEL']
			
			Thread.sleep(2000);
			
			//Element TO opens by default no need to find element TO,
			//directly city name can be found, but if you dont what to use index, 
			//parent child relationship can be used for unique object
			
			//driver.findElement(By.xpath("//a[@value='DEL']")).click();//it will not click delhi because it see as it inside from
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
    
    }

}
