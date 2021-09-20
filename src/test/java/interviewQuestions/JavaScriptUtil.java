package interviewQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	//Using JavaScriptExecutor draw border
	public static void drawBoarder(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element);
		}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String title=js.executeScript("return document.title;").toString();
	return title;
		}
	
	public static void clickElementByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static String generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String msg=js.executeScript("alert('" + message + "')").toString();
		return msg;
	}
	
	public static void refreshBrowserByJs(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollPageUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}
public static void zoomPageByJs(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='50%'");
}

public static void changecolor(String color, WebElement element, WebDriver driver)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.backgroundColor='" + color +"'", element);
	try {
		Thread.sleep(20);
	}catch(InterruptedException e)
		 {
	}
	}
	

public static void flash(WebElement element, WebDriver driver) {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=0;i<50;i++) {
		changecolor("#000000", element, driver);
		changecolor(bgcolor, element, driver);
	}
	
}



}
