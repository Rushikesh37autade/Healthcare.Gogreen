package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) {
		// how to handle i frames
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/w3css/tryit.asp?filename=tryw3css_tabulators");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// switch focuse by
		//1. id value
		// 2. name
		//3.x path
		//4.index
		
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Tokyo']")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Paris']")).click();
		
	}

}
