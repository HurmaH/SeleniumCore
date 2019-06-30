package part1_SetProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverTest {
public static void main(String[] args) {
		
		
		//WebDriver is interface, ChromeDriver implements all methods
		//Step1. set properties of web browser / invoke .exe file
		//System.setProperty(key, value)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		//Step2. Create Driver Object for Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//general methods:
		driver.get("http://www.google.com");       //1.  goes to url
		System.out.println(driver.getTitle());     //2. get page title
		System.out.println(driver.getCurrentUrl());//3.return current Url
		System.out.println(driver.getPageSource());//4. returns on console source code
		
		driver.get("https://www.amazon.com/");//goes forward on same window
		
		driver.navigate().back();                  //5. click back on web browser to previous page
		driver.navigate().forward();               //6. click forward on web browser
		
		driver.close();                            //7. it closes current window opened by selenium script
		driver.quit();                             //8. it closes all open  browsers by selenium 
	}


}
