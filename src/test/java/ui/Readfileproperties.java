package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Readfileproperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\eclipse-workspace\\SeleniumTraining\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("Url");
		Thread.sleep(2000);
		driver.get(url);

	}

}
