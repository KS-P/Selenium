package ui;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );
		WebDriverWait wait =new WebDriverWait(driver,50);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Like us On Facebook"))).click();
		Set<String> handler=driver.getWindowHandles();
	Iterator<String> it	=handler.iterator();
	String parentwindow=it.next();
	System.out.println("parentwindow is:" +parentwindow);
	String childwindow=it.next();
	System.out.println("childwindow is:" +childwindow);
	driver.switchTo().window(childwindow);
	System.out.println("childwindow popup is:" +driver.getTitle());
	
	
		
		
		
	}
}
