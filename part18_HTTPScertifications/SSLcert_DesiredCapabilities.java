package part18_HTTPScertifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcert_DesiredCapabilities {
	public static void main(String[] args) {
		 //ssl certificates
		
		//desired capabilities
		//general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Belongs to my local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch); //matching with local browser
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
	}

}
