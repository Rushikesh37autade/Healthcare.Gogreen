package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	// for facebook
	// regular locators 
	//1.id
	//2.name
	//3.class name
	//4.link text
	//5.partial link text
	// tag name
	
	//customized locators
	//1. x-path
	//i.absolute
	//ii.relative 
	
	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// 1.id
		driver.findElement(By.id("id value from website"));
		driver.findElement(By.id("email")); // username
		
		// name
		driver.findElement(By.name("name value from website"));
		driver.findElement(By.name("email")); //username
		
		// class name
		driver.findElement(By.className("class name value from website"));
		driver.findElement(By.className("class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\""));// username
		
		//tagname
		driver.findElement(By.tagName("button"));
		// most of the time button  or single image will be the unique tagname on wevbsite
		
		// link text
		driver.findElement(By.linkText("Forgotten account?")); // forget password
		
		// partial link text
		driver.findElement(By.partialLinkText("account?")); // forget password
		
		// absolute 
		driver.findElement(By.xpath("/html/body/div[2]/a[1]")); // path from parent
		
		// relative
		driver.findElement(By.xpath("//div[2]/a[1]"));
		
	
	}
	
	
	

}
