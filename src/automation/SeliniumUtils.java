package automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

           //1. ss

public class SeliniumUtils {
		public static void getscreenshot(WebDriver driver) throws IOException {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date d= new Date();
			String filename =d.toString().replace(" ", "_").replace(":", "_")+".png";
			File dest = new File("D:\\\\SElenium screenshots\\\\redbus"+filename);
			FileUtils.copyFile(src, dest);
		}	
		//2. border
		public static void borderbyjs(WebDriver driver,WebElement element) {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		//2. title
		public static String textbyjs(WebDriver driver) {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			String title = js.executeScript("return document.title;").toString();
			return title;
		}
		// click
		public static void clickbyjs(WebDriver driver,WebElement element) {
			JavascriptExecutor js =((JavascriptExecutor)driver);
	    	js.executeScript("arguments[0].click();",element);

		}
		
		//creat alert
		public static void atertbyjs(WebDriver driver,String message) {
			JavascriptExecutor js =((JavascriptExecutor)driver);
     		js.executeScript("alert('" +message+"')");
		}
		// refresh
		public static void refreshbyjs(WebDriver driver) {
			JavascriptExecutor js =((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
		}
		// scroll down/up
		public static void scrollbyjs(WebDriver driver,int x,int y){
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");
		}
		
		   // scroll into view
		public static void scrollintoviewbyjs(WebDriver driver, WebElement element) {
			JavascriptExecutor js =((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			

		}


		
		
		
		
	}


