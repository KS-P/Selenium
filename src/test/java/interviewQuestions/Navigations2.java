package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations2 {

	public static void main(String[] args) {
		//how to navigate back and forward? difference between get() and navigate.to()?
		
		/*both methods are used for opening URL in the browser.
		 * there is no difference
		 * only difference is get() accepts only one string parameter
		 * navigate().to() accepts string parameter and URL instance as parameter.
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.target.com/");
		driver.navigate().to("https://www.target.com/");
		driver.navigate().back(); //snapdeal
		driver.navigate().forward();//target
		
		}

}
