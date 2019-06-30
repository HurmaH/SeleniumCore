package part4_ParentChild_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraverseSiblingAndParent{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[1]")).click();
		
		//following sibling first sibling
		driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[1]/following-sibling::li[1]")).click();
			
	    //following sibling second sibling
		driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		
		//following sibling third sibling
		driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[1]/following-sibling::li[3]")).click();
		
		//parent travers
		driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[1]/parent::ul")).getAttribute("role");
	
	}


}
