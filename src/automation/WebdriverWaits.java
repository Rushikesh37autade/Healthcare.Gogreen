package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.jiomart.com/");
		// 1. implicit wait
		// 2. explicit waits
		// 3. fluent waits
		
		// 1. implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement signup = driver.findElement(By.xpath("//a[text()=' Sign in / Sign up ']"));
		signup.click();
		
		driver.findElement(By.xpath("//input[@id='loginfirst_mobileno']")).sendKeys("9569987731");

		WebElement mobno = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		
		// 2.explicit wait
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(mobno)).click();
		
		
		
		//3. fluent
		//to control time of interval or cycle time to find the element on webpage . generally not used in industry
		
		
	}

}
