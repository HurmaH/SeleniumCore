package part3_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCSS {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("Hurmik@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("122345");
		
		driver.findElement(By.cssSelector("#Login")).click(); //
		
		String err1 = driver.findElement(By.cssSelector("div#error.loginError")).getText();//selector from insoector bar down there,will return error message in string
		System.out.println(err1);
		
		String err2 = driver.findElement(By.cssSelector("#error")).getText();//selector from copy-copy selector
		System.out.println(err2);
		//driver.close();
	}

}
