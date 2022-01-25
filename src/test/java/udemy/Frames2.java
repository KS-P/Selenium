package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']")).click();
//System.out.println(driver.findElement(By.tagName("frame")).getText());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
	
System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		

	}

}
