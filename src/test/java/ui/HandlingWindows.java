package ui;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Start my free trial")).click();
				Set<String> windowhandles = driver.getWindowHandles();
System.out.println(windowhandles);
Iterator<String> iterator=windowhandles.iterator();
String parentwindow=iterator.next();
String childwindow=iterator.next();
System.out.println(childwindow);
driver.switchTo().window(childwindow);

		driver.findElement(By.name("UserFirstName")).sendKeys("Sivaranjani");
		driver.findElement(By.name("UserLastName")).sendKeys("Paleti");
		
		driver.switchTo().window(parentwindow);

	}

}
