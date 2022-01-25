package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.stream.Collectors;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Streams2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tr/th[1]")).click();
List<WebElement>elementsList=driver.findElements(By.xpath("//tr/td[1]"));

List<String> originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
//sortedlist

List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());
Assert.assertTrue(originalList.equals(sortedList));
List<String> price;

//scan the name column with getText ->Beans->print the price of the Rice

do

{

List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

price = rows.stream().filter(s -> s.getText().contains("Rice"))

.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

price.forEach(a -> System.out.println(a));

if(price.size()<1)

{

driver.findElement(By.cssSelector("[aria-label='Next']")).click();

}

}while(price.size()<1);



}



private static String getPriceVeggie(WebElement s) {

//TODO Auto-generated method stub

String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



return pricevalue;

}









	}


