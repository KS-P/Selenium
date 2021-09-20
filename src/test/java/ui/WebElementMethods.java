package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.sugarcrm.com/");

	}

}
