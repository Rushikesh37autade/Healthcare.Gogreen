package Selfpracticesele;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartChildpoup {
	public static void main(String[] args) {
		Iterator<String> iterator;
		Set<String> window;
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/televisions/pr?sid=ckf%2Cczl&p%5B%5D=facets.brand%255B%255D%3DMi&otracker=categorytree&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Mi");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 window = driver.getWindowHandles();
		 iterator = window.iterator();
		String FirstID = iterator.next();
		System.out.println(FirstID);
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		// second window id
		window=driver.getWindowHandles();
		iterator=window.iterator();
		iterator.next();
		String secondid = iterator.next();
		System.out.println(secondid);
		
		driver.switchTo().window(secondid);
		driver.findElement(By.xpath("//a[contains(@title,' LED TV/Smart TV Up to 43 Inches , Set Top Box')]")).click();
		System.out.println(driver.getCurrentUrl());
		
		window=driver.getWindowHandles();
		iterator=window.iterator();
		iterator.next();
		iterator.next();
		String thirdid = iterator.next();
		
		System.out.println(thirdid);
		
		driver.switchTo().window(thirdid);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shirts");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	   driver.switchTo().window(FirstID);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Foot wear");
		driver.quit();

		
		
		
	}

}
