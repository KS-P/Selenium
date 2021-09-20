package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select=new Select(ddown);
		WebElement firstoption = select.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		
		/*select.selectByValue("level1");
		Thread.sleep(4000);
		
		select.selectByVisibleText("251 - 500 employees");
		Thread.sleep(4000);
		
		select.selectByIndex(3);
		Thread.sleep(4000);*/
		
	}

}
