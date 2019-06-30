package part1_SetProperty;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetExplorerTest {
public static void main(String[] args) {
		
		
		//WebDriver is interface, ChromeDriver implements all methods
		//Step1. set properties of web browser / invoke .exe file
		//System.setProperty(key, value)
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\MicrosoftWebDriver.exe");
		
		//Step2. Create Driver Object for Chrome Browser
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}


}
