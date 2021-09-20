package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitching {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
