package Selfpracticesele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mg1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.1mg.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> policies = driver.findElements(By.xpath("(//div[@class='style__main-content___2sd49'])[2]/div/ul/li/a"));
		
		for (int i=0; i<policies.size(); i++) {
			String policy = policies.get(i).getAttribute("href");
			String policyname = policies.get(i).getText();
			
			System.out.println(i+") "+policyname+"==>"+policy);
			
			
		}
			
		
	}

	
}
