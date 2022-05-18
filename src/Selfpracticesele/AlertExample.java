package Selfpracticesele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		// handle alert
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
	
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = al.getText();
		System.out.println(text);
		al.accept();
		
	}

}
