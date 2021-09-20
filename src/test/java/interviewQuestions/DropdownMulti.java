package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
	WebElement country=	driver .findElement(By.id("input-country"));
	Select dropdown=new Select(country);
		
	 // dropdown.selectByIndex(10);
//dropdown.selectByValue("3");
//dropdown.selectByVisibleText("Albania");


	 // selecting option from dropdown  without choosing methods
	
List<WebElement> alloptions=dropdown.getOptions();

for( WebElement option:alloptions)
{
	if(option.getText().equals("Cuba"))  
	{
		option.click();
		break;
	}
}
		
		
		
		
		
	}

}
