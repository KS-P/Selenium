package interviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(e);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String year="2021";
		String month="October";
		String date="27";
		while(true)
		{		
	String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
String arg[]=monthyear.split(" ");
String mon=arg[0];
String yr=arg[1];

if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
{
break;
}
else
{
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
}
		}
		//Date selection
		
	List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	Thread.sleep(3000);
	for(WebElement ele:alldates) {
		String dt=ele.getText();
		
		if(dt.equalsIgnoreCase(date))
			ele.click();
		break;
	}
		
		
		
		
	}

}
