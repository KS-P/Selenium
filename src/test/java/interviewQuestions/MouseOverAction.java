package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement desktopmenu=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
Actions act=new Actions(driver);
act.moveToElement(desktopmenu).moveToElement(mac).click().perform();
	}

}
