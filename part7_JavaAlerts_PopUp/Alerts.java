package part7_JavaAlerts_PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		//set properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//create WebDriver object
		WebDriver driver = new ChromeDriver();
					
		//go to URL
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		//Java pop will appear, so driver need to be switched to Alerts
		//we know it is Java pop up because HTML code is not available for that pop up screen
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();//Accept,ok, yes - positive scenarios
		//driver.switchTo().alert().dismiss();//negative scenarios
		
		//if there is option to enter some text:
		driver.switchTo().alert().sendKeys("Helllo");
	}

}
