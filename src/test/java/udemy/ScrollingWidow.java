package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingWidow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.id("product"));
	int noOfRows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
	System.out.println(noOfRows);
int noOfColumns=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
System.out.println(noOfColumns);
List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
System.out.println(secondrow.get(0).getText());

System.out.println(secondrow.get(1).getText());

System.out.println(secondrow.get(2).getText());
				
					}

}
