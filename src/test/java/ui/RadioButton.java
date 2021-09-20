package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
      
		driver.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");
		driver.manage().window().maximize();
		
		
	}

}
