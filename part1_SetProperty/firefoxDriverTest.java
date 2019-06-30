package part1_SetProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefoxDriverTest {
	public static void main(String[] args) {
		
		
		//WebDriver is interface, FirefoxDriver implements all methods
		//Step1. set properties of web browser / invoke .exe file
		//System.setProperty(key, value)
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\geckodriver.exe");
		
		//Step2. Create Driver Object for Firefox Browser
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
