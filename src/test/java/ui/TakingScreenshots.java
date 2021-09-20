package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshots {

	public static void main(String[] args) throws IOException {
		Date currentdate=new Date();
				System.out.println(currentdate);
		String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		File screenshotfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotfile, new File(".//screenshots/"+screenshotfilename+".png"));
	}

}
