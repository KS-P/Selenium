package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// difference between findElement() and findElements()
		
	/*findElement() method returns the first matching element on the current page
	 * if the element is not found then it throws NoSuchElementFoundException.
	 * findElements() method returns multiple elements and it doesn't throw an exception 
	 * if the element is not found,instead it will return zero elements	
	 */
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	
	List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	
System.out.println("Number of elements captured:" +links.size());
		
for(WebElement ele:links) {
System.out.println("Text:" +ele.getText());
}
		

	}

}
