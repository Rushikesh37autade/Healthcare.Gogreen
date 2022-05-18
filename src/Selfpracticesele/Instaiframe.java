package Selfpracticesele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instaiframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
				
				
				WebDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

				driver.get("https://elfsight.com/instagram-feed-instashow/iframe/");
				
				
				//change focuse
//				//WebElement Frame = driver.findElement(By.xpath("//iframe[@title='Try iFrame Instagram feed right now!']"));
				driver.switchTo().frame("preview");
				driver.findElement(By.xpath("//div[@class='ea-editor-responsive-button']")).click();
			

}
}