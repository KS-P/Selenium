package interviewQuestions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Draw boarder and take screen shot
		
		
	/*	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

		JavaScriptUtil.drawBoarder(logo,driver);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trgt=new File(".\\screenshots\\logo.png");
		FileUtils.copyFile(src, trgt);*/
	//Title of the Page	
	/*String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println("Title:" +title);*/
		
		
		//clickelementBy JavaScript
	/*	WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavaScriptUtil.clickElementByJs(register, driver);*/
		
		//Alert message
		
		/*JavaScriptUtil.generateAlert(driver, "Alert by JS");*/
		
		//RefreshBrowser
		/*JavaScriptUtil.refreshBrowserByJs(driver);*/
	
	//	JavaScriptUtil.scrollPageDown(driver);
		//JavaScriptUtil.scrollPageUp(driver);
		//JavaScriptUtil.zoomPageByJs(driver);
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.flash(logo, driver);
	}

}
