package part5_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_DynamicDropdown {
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
			
			Thread.sleep(2000);
			
			//Element TO opens by default no need to find element TO,
			//directly city name can be found
			driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();//2nd delhi
    
    }

}
