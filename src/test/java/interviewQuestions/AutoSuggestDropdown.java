package interviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium");
List<WebElement>suggestions=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));

   System.out.println("Suggestions:" +suggestions.size());
   
   
   
  for(WebElement option:suggestions)
  {
	  if(option.getText().equals("selenium"))
	  {
		  option.click();
		  break;
	  }
  }
	
		
			   
	   
		   
   }
}
   

	


