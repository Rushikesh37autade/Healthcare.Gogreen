package Selfpracticesele;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screnshootred {
	public static void main(String[] args) throws IOException {
   System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
   
   WebDriver driver=new ChromeDriver();
   
   driver.get("https://www.redbus.in/");
   
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   // type caste
   // screenshot taken
   File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   
    File dest = new File("D:\\SElenium screenshots\\redbus.jpg");
    
    FileUtils.copyFile(srs, dest);
   
   
   
   
	}

}
