package part14_HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_FrameElement {
	public static void main(String[] args) {

		// 1. Open Url and hit browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//switch frame in 3 ways, id, index, WebElement
		//frame index: driver.switchTo().frame(0) -- first iframe tag
		
		//Frame webElement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //1.look do we have id
		driver.findElement(By.id("draggable")).click();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions go = new Actions (driver);
		go.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();//back to original web, goes out of frame
		
	}

}
