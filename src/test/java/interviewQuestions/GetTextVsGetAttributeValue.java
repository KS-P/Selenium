package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttributeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement email=driver.findElement(By.id("Email"));
		//email.clear();
		//capturing text from inputbox
		
System.out.println("Result from getAttribute() method:" +email.getAttribute("value"));
System.out.println("Result from getText() method:" +email.getText());
		

 WebElement loginbutton=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));

System.out.println(loginbutton.getAttribute("type"));	
System.out.println(loginbutton.getAttribute("class"));
System.out.println(loginbutton.getText());
		
		
String title=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();

	System.out.println(title);	
		
		
	/*getText() method returns innerText of an element
	 * getAttribute() method fetches the text contained by an attribute in html document	 
	 */
		
		
		
		
		
		
		
		
		

	}

}
