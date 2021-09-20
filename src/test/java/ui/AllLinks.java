package ui;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.helper.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		System.out.println(alllinks.size());
		for(int i=0; i<alllinks.size(); i++) {
			
			WebElement element = alllinks.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			
			HttpURLConnection  httpconn=(HttpURLConnection) link.openConnection();
			httpconn.connect();
			int rescode=httpconn.getResponseCode();
			
			if(rescode>=400)
			{
				System.out.println(url +" - "+ "is broken link");
			}
			else
			{
				System.out.println(url +" - "+ "is valid link");
			}
				
				
			
			//String linktext=alllinks.get(i).getText();
			//System.out.println(linktext);
			
			
		}
			

	}
}
