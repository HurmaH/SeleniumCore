package part5_Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _1_StaticDropdown {
	public static void main(String[] args) {
		//set properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//create WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//go to URL
		driver.get("https://www.cheapoair.com/");
		driver.findElement(By.linkText("Hotels")).click();
		
		//Create Select object to use select tag or static dropdown
		//add Webelement in argument
		Select s = new Select(driver.findElement(By.xpath("//select[@name='room']")));
		s.selectByValue("3");
		s.selectByIndex(5);
		s.selectByVisibleText("7");
		
		//Select s = new Select(driver.findElement(By.id("")))
	}

}
