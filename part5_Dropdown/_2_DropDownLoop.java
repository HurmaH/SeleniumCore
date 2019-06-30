package part5_Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _2_DropDownLoop {
	public static void main(String[] args) {
		//set properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		//create WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//go to URL
		driver.get("https://www.cheapoair.com/");
		
		//find element for drop down and click
		driver.findElement(By.xpath("//div[@class='col-6']/section/div/input")).click();
		
		//print text appearing on dropdown box before loop
//        String before = driver.findElement(By.xpath("//input[@placeholder='Select Traveler(s)']")).getText();
//		System.out.println(before);
				
		//increase until becomes 7
		for(int i=1; i<7; i++) {
			//find plus element to increase number and click
		    driver.findElement(By.xpath("//div[@class='col-4']/div")).click();
		}
				
		//click on done button after number becomes 7
		driver.findElement(By.xpath("//div[@class='form-row']/div[3]/button")).click();
		
		//print text appearing on dropdown box after loop
//		String after = driver.findElement(By.xpath("//input[@placeholder='Select Traveler(s)']")).getText();
//		System.out.println(after);
		
		
		
	}

}
