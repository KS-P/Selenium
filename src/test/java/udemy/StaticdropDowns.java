package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticdropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
	Select dropdown=new Select(currency);
	dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());

dropdown.selectByVisibleText("AED");
System.out.println(dropdown.getFirstSelectedOption().getText());
	
dropdown.selectByValue("INR");

System.out.println(dropdown.getFirstSelectedOption().getText());
	
	

	}

}
