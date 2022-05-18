package Selfpracticesele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtertMG1 {
	
	public static void main(String[] args) {
		// how to handle alert of mg 1 webpage
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.1mg.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//div[text()='Cancel']")).click();
		
		
		
	}

}
