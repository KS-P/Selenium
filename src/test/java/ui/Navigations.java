package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");//both are used to launch the Url but navigate.to is used to lanuch the external Url.
	driver .manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.walmart.com/");
	driver.navigate().back();
	
	
}
}
