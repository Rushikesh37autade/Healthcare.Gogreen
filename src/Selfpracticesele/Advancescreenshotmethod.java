package Selfpracticesele;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancescreenshotmethod {
	public static WebDriver driver;
	public static void screenshot() throws IOException {
		File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		String name = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		

	    File dest = new File("D:\\SElenium screenshots\\redbus"+name);
	    
	    FileUtils.copyFile(srs, dest);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		   
		    driver=new ChromeDriver();
		   driver.get("https://www.redbus.in/");
		   screenshot();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Amravati");
		   driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Pune");
		   screenshot();
		   Thread.sleep(2000);

		   driver.findElement(By.xpath("//button[@class='fl button']")).click();
		  
		   screenshot();
		   
	}

}
