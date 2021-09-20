package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keydown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[4]/pre/span"));
		Actions action=new Actions(driver);
	action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	WebElement target = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre/span"));
		action.keyDown(target, Keys.CONTROL).sendKeys("v").build().perform();
	}
}
