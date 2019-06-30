package part3_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXPATH {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hurmik@yahoo.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("234jjf");//original xpath was //*[@id="pass"]
		
		//firefox might give xpath starting with html, which is not valid,
		//therefore web browser should be changed to other to get valid xpath
		//firefox xpath: /html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		//*[@id='forgot_password_link']
	}

}
