package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct alert message");
		}
		else {
			System.out.println("Incorrect alert message");
		}
		alert.accept();
		
		
		
		

	}

}
