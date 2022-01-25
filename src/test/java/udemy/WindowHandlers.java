package udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlers {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
	Set<String> windowhandles=driver.getWindowHandles();
Iterator<String> it=windowhandles.iterator();
String parentid=it.next();
String chaildid=it.next();
driver.switchTo().window(chaildid);
	
System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
driver.switchTo().window(parentid);
System.out.println(driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).getText());
		
		
		
	}

}
