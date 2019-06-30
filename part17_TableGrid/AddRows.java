package part17_TableGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRows {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20268/eng-vs-aus-match-32-icc-cricket-world-cup-2019");
	
	WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));//parent object
	int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();//will check only inside of the table
	int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	for (int i=0; i<count-2; i++) {//will exclude last 2 lines
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());//parent to child transfer
	}
	
	System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());//sibling to sibling transfer
	System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	
	}
}
