package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement element=driver.findElement(By.linkText("Electronics"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		WebDriverWait wait =new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Smart Watches"))).click();
		
		

	}

}
