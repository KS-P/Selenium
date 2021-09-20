package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessbrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
				options.setHeadless(true);
		
		
		ChromeDriver driver=new ChromeDriver(options);
							
		driver.get("https://www.target.com/");
		System.out.println("Title is : " +driver.getTitle());

	}

}
