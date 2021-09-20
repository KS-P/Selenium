package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//selecting multi dropdowns by applying logic

public class DropDownMulti2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
WebElement day=driver.findElement(By.name("DateOfBirthDay"));
 WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
 WebElement year=driver.findElement(By.name("DateOfBirthYear"));
 
 //calling selectoptionfromdropdown method
 selectoptionfromdropdown(day,"10");
 selectoptionfromdropdown(month,"March");
 selectoptionfromdropdown(year,"1980");
	}
	
	
public static void selectoptionfromdropdown(WebElement ele,String value)
{
	
	Select drp=new Select(ele);
	
List<WebElement>alloptions=drp.getOptions();
	
	
	
	for(WebElement options:alloptions)
	{
		if(options.getText().equals(value))
		{
			options.click();
			break;
		}
		
		
		
		
		
		

	}
}
}

