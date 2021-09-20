package interviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for.visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
Select monthdrp=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
monthdrp.selectByVisibleText("Oct");
Select yeardrp=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
yeardrp.selectByVisibleText("2021");
String date="27";
List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
for(WebElement ele:alldates)
{
	String dt=ele.getText();
	if(dt.equals(date))
	{
		ele.click();
		break;
	}
}


	}

}
