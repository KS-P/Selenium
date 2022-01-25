package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
WebElement autosuggest=	driver.findElement(By.id("autocomplete"));
autosuggest.sendKeys("ind");
autosuggest.sendKeys(Keys.DOWN);
autosuggest.sendKeys(Keys.DOWN);
 System.out.println(autosuggest.getAttribute("value"));
	
	

	}

}
