package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		WebElement radio=driver.findElement(By.id("doi0"));
		Actions actions=new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		driver.manage().window().maximize();
		driver.findElement(By.name("interest_market_c")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("interest_market_c")).click();
		
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
