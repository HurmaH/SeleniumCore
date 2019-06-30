package part8_CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox{
	public static void main(String[] args) throws InterruptedException {
		    //set properties of webdriver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
			//create WebDriver object
			WebDriver driver = new ChromeDriver();
			
			//go to URL
			driver.get("https://spicejet.com");
			//check before click is it clicked or not
			System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
			//check after click is it clicked or not
			System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
			
			//how many chackboxes
			//css path for all checkboxes: input[type='checkbox']
			int count =driver.findElements(By.cssSelector("input[type='checkbox']")).size();
			System.out.println(count);
			
			
			//find Passengers box and click
			WebElement passenger = driver.findElement(By.cssSelector("div[id='divpaxinfo']"));
			passenger.click();
			Thread.sleep(2000);//slows code so following elements will be reachable
			//print text on that box
			System.out.println(passenger.getText());
						
			//find + sign and click
			//click until Adult number until 6
			
			
			int i=1;
			while (i<6) {
				driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
				i++;			
			}
			//find done button and click
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			//print text on that box
			System.out.println(passenger.getText());
    
    }

}
