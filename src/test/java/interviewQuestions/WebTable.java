package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
	//Number of rows in a table	
	int rows=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
	System.out.println("Total number of rows in a table:" +rows);
	
	//Number of columns in a table
	int columns=driver.findElements(By.xpath("//table[@id='customers']//tr//th")).size();
	System.out.println("Total number of columns:" +columns);
	
	
	//Specific row/column Data from table
	String value=driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[1]")).getText();
	System.out.println(value);
	
	//Retrieve all data from table
	/*for(int r=2;r<=rows;r++)
	{
		for(int c=1;c<=columns;c++)
			
		{
		String data=driver.findElement(By.xpath("//table[@id='customers']//tr[" +r+ "]/td[" +c+ "]")).getText();
		System.out.print(data+ "   ");
		
		}
		System.out.println();*/
	//Retrieve specific row details	
	//If company is Island Trading retrieve contact and country details
	for(int r=2;r<=rows;r++) {
		
	String company=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[1]")).getText();
	if(company.equals("Island Trading"))
	{
	String contact=	driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[2]")).getText();
	String country=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[3]")).getText();
	System.out.println("contact is:" +contact);
	
	System.out.println("country is:" +country);
	
	
	}
	}
			
			
			
			
			
	}		
			
			
			
	}
	
	
	
	


