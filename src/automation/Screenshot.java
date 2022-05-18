package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		//cast type
		//fileutils
		// strore in local
		
        System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//type caste
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//destination
		File des = new File("D:\\SElenium screenshots\\sshot.jpg");
		
		//to take store screen shot in local drive
		FileUtils.copyFile(scr, des);
	}

}
