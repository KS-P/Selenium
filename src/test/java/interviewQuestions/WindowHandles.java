package interviewQuestions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//getWindowHandle()
	//String windowid=driver.getWindowHandle();//returns id of single browser window
	//System.out.println(windowid);
		
	//getWindowHandles	
	WebElement orangehrm=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	orangehrm.click();
	
	Set<String>windowids=driver.getWindowHandles();//returns multiple browser ids 
	//System.out.println(windowids);
Iterator<String>it=windowids.iterator();
String parentwindowid=it.next();
String childwindowid=it.next();
System.out.println(parentwindowid);
System.out.println(childwindowid);

	
		
		

	}

}
