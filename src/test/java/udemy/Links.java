package udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());

WebElement footerdriver=driver.findElement(By.id("gf-BIG"));

 System.out.println(footerdriver.findElements(By.tagName("a")).size());
WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
System.out.println(columndriver.findElements(By.tagName("a")).size());
for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
{
	String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
}
Set<String> abc= driver.getWindowHandles();
Iterator<String> it=abc.iterator();

while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
}

	}

}
