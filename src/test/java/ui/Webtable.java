package ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse26\"]/li[1]/a")).click();

		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"form-order\"]/table/tbody/tr"));
		System.out.println(rowelements.size());
		int rowsize = rowelements.size();

		List<WebElement> colelements = driver.findElements(By.xpath("//*[@id=\"form-order\"]/table/tbody/tr[1]/td"));
		System.out.println(colelements.size());
		int colsize = colelements.size();

		for (int i = 1; i <= rowsize; i++) {

			for (int j = 1; j <= colsize; j++) {

				System.out.print(
						driver.findElement(By.xpath("//*[@id=\"form-order\"]/table/tbody/tr[" + i + "]/td[" + j + "]"))
								.getText()+ " ");
			}
			System.out.println();

		}

	}

}
