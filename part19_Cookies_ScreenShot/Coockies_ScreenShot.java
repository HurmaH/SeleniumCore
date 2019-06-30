package part19_Cookies_ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coockies_ScreenShot {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");//deleting specific cookie
		
		driver.get("https://google.com");
		
		//Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//https://commons.apache.org/proper/commons-io/
		FileUtils.copyFile(src, new File("C:\\Users\\Hurmik\\Documents\\SeleniumScreen\screenshot.png"));
		 
	
	}

}
