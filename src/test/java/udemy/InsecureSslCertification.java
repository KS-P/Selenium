package udemy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
public class InsecureSslCertification {

	public static void main(String[] args) {
		
		
		//Desired capabilities=
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Below to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(c);
	}

}
