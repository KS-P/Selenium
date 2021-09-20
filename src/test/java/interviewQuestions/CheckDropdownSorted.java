package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropdownSorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	WebElement drpElement=	driver.findElement(By.name("category_id"));
Select drpdown=new Select(drpElement);

 List<WebElement> options=drpdown.getOptions();
 
 ArrayList originallist=new ArrayList();
 ArrayList templist=new ArrayList();
 
 for(WebElement option:options)
 {
	originallist.add(option.getText());
	templist.add(option.getText());
	System.out.println("originallist:" +originallist);
	System.out.println("templist before sorting:"  +templist);
	
	Collections.sort(templist); //sorting
	System.out.println("originallist :" +originallist);
	System.out.println("templist after sorting:"  +templist);
	
	if(originallist.equals(templist))
	{
		System.out.println("dropdown is sorted");
	}
	else
	{
		System.out.println("dropdown is not sorted");
	}
 }

	}

}
