package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
	int dates=driver.findElements(By.xpath("//td[@class='day']")).size();
	for(int i=0;i<dates;i++)
		
	{
String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
		if(text.equalsIgnoreCase("8"))
		{
			driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
			break;
		}
		
	}
		
		
		
		
		}

}
