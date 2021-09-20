package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(3000);
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Sydney");
		Thread.sleep(3000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		from.sendKeys(Keys.ENTER);
		
	}

}
