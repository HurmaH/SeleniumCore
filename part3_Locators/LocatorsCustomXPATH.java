package part3_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCustomXPATH {
	/*
	 * 1. From Chrome: email element html code:
       <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
       2. Customizde XPATH template: //tag[@attribute='value'] -->>will find tag
                                  //*[@attribute='value'] -->> will find by attribute
       3. after making custom xpath validate it in console              
                                 
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='royal_email']")).sendKeys("hurmik@yahoo.com");
		driver.findElement(By.xpath("//*[@data-testid='royal_pass']")).sendKeys("234jjf");//original xpath was //*[@id="pass"]
		
		driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();//*[@id='forgot_password_link']
		
	}

}
