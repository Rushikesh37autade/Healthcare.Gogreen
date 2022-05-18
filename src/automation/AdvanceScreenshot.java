package automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class AdvanceScreenshot {
	
	public static WebDriver driver;
	
	public static void getscreenshot() throws IOException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String name = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		File des = new File("D:\\SElenium screenshots\\sshot"+name);
		
		FileUtils.copyFile(scr, des);

  
	}
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
			
			
			 driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			getscreenshot();
	}

}

