package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {
	
	// to handle the hidden pop up
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ID = driver.findElement(By.xpath("// input[@class='_2IX_2- VJZDxU']"));
		ID.sendKeys("Rushikesh123");
		
		WebElement Pass = driver.findElement(By.xpath("// input[@class='_2IX_2- _3mctLh VJZDxU']"));
		Pass.sendKeys("Rushi123@");
		
		WebElement login = driver.findElement(By.xpath("// button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		

		
	}
}
