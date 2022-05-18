package Selfpracticesele;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.AdvanceScreenshot;

public class Sotifyscreenshot {
	 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		
		   driver= new ChromeDriver();
		
		driver.get("https://www.spotify.com/in-en/signup");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		//to store in local disc
//		File des = new File("D:\\SElenium screenshots\\sotify.jpg");
//		FileUtils.copyFile(srs, des);
		Sc.getscreenshot(driver);
	}

}
