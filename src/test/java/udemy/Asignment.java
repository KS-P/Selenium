package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement option2=driver.findElement(By.cssSelector("label[for='benz']"));
	option2.click();
String op2=option2.getText();
System.out.println(op2);
WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
dropdown.click();
Select select=new Select(dropdown);
select.selectByVisibleText(op2);

driver.findElement(By.xpath("//input[@id='name']")).sendKeys(op2);
driver.findElement(By.id("alertbtn")).click();
String text=driver.switchTo().alert().getText();
if(text.contains(op2))
{
	System.out.println("Alert message success");
}
else
{
	

	    System.out.println("Something wrong with execution");
}
	}

}
