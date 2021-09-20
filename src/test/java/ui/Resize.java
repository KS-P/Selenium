package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/resizable/");
driver.manage().window().maximize();
WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
driver.switchTo().frame(frame);
Thread.sleep(2000);
WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
Thread.sleep(2000);
Actions action=new Actions(driver);
Thread.sleep(2000);
action.dragAndDropBy(element, 60, 50).perform();



	}
	
	

}
