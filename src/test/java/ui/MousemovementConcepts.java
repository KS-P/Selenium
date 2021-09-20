package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MousemovementConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.id("highlight-addons"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Seat + Meal Combo")).click();

	}

}
