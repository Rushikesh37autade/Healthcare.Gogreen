package automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {
	public static void main(String[] args) {
		 Set<String> window;
		 Iterator<String> iterator ;
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// take the id for window first window ==> return type will be string in set(to avoid duplicates
		  window = driver.getWindowHandles();  // window id is stored in set
		  iterator = window.iterator();        // use iterator to read all value
		String firstwindow = iterator.next();  // read a first window id
		System.out.println(firstwindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[@title='Learn more about Facebook Pay']")).click();
		window=driver.getWindowHandles();
		iterator=window.iterator();
		iterator.next();
		String secondwindow = iterator.next();  //to read second window id
		System.out.println(secondwindow);
		
		// change the focus from one window to next window
		
		driver.switchTo().window(secondwindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[text()='Facebook Payments Privacy Policy']")).click();
		
		window=driver.getWindowHandles();
		iterator=window.iterator();
		iterator.next();
		iterator.next();
		String thirdwindid = iterator.next();
		System.out.println(thirdwindid);
		
		// to change focus we use id
		driver.switchTo().window(thirdwindid);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rushi");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("345");
		
		
		System.out.println("+++++++++++++++ re switchung ++++++++++++++++");
		
		driver.switchTo().window(firstwindow);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rushi");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("345");
		driver.quit();
		

		
		
		
		
		
	}

}
