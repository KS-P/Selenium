package ui;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		WebElement ddown = driver.findElementByName("States");
		Select select = new Select(ddown);
		select.selectByValue("California");
		Thread.sleep(4000);
		select.selectByIndex(5);
		Thread.sleep(3000);
		List<WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		select.deselectAll();
		Thread.sleep(3000);
		
		select.selectByValue("California");
		Thread.sleep(3000);
		select.selectByIndex(5);
		Thread.sleep(3000);
		select.deselectByIndex(5);
		Thread.sleep(3000);
		List<WebElement> allItems1 = select.getAllSelectedOptions();
		System.out.println(allItems1.size());
		

	}

}
