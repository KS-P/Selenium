package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isDisplayed() isEnabled()
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		System.out.println("Display status:" +search.isDisplayed());
		
		System.out.println("Enabled status:" +search.isEnabled());
		
		//isSelected() - radio buttons,check boxes, dropdown
		
	WebElement MaleRbt=	driver.findElement(By.id("gender-male"));
		System.out.println("selected status: " +MaleRbt.isSelected());
		WebElement FemaleRbt=driver.findElement(By.id("gender-female"));
		System.out.println("selected status: " +FemaleRbt.isSelected());
		
		MaleRbt.click(); //select male radio button
		System.out.println("selected status: " +MaleRbt.isSelected());//True
		System.out.println("selected status: " +FemaleRbt.isSelected());//False
		
		FemaleRbt.click();//select female radio button
		
		System.out.println("selected status: " +MaleRbt.isSelected());//false
		System.out.println("selected status: " +FemaleRbt.isSelected());//true
		
	}

}
