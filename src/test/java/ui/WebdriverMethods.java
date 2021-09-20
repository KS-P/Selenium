package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input")).click();
		
		List<WebElement> webelements = (List<WebElement>) driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = driver.getWindowHandle();
		System .out.println(windowhandle);
		driver.quit();
		
	}
	

}
