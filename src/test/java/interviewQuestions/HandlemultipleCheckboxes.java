package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlemultipleCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//specific check box
		//driver.findElement(By.id("monday")).click();
		//select all checkboxes
	List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]"));
System.out.println("No.of checkboxes:" +checkboxes.size());
/*for(WebElement chbox:checkboxes)
{
	chbox.click();
}*/
//select check boxes by choice
//select Monday,Sunday

/*for(WebElement chbox:checkboxes)
{
	String chboxname=chbox.getAttribute("id");
	if(chboxname.equals("monday")||chboxname.equals("sunday"))
	{
		chbox.click();
	}
}*/
//select last 2 checkBoxes
int totalcheckboxes=checkboxes.size();
/*for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
	//total no.of check boxes-2=starting index
	//7-2=5
{
checkboxes.get(i).click();	
	
}*/

//select first 2 check boxes

for(int i=0; i<totalcheckboxes;i++)
{
	if(i<2)
	{
		checkboxes.get(i).click();
	}
}







	}

}
