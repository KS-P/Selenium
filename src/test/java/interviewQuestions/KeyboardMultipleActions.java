package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardMultipleActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		Actions act=new Actions(driver);
		input1.sendKeys("Copy Paste Action");
		//Cntrl-a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Cntrl-c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//tab
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Text copied");
		
		else
			System.out.println("Text not copied");

	}

}
