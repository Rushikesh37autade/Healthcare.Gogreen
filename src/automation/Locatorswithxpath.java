package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorswithxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//basic xpath
		//==>//tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]"));
		
		// tag name and text
		//==>//tagname[text()='text value']
		driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		
		
		// tag name with partial text (start-with)
		//==>//tagname[starts-with(@attribute,'attribute value')]
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email address or phone number')]"));
		
		// tag name and contains
		//==>//tagname[contains(@attribute,'attribute value')]
		driver.findElement(By.xpath("//input[contains(@aria-label,'address or phon')]"));
		
		// tagname with logical operators(and ,or)
		// and
		//==>//tagname[@attribute1='attribute value and @attribute2='attribute2 value' ]
		driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
		
		
		
		// or
		//==>//tagname[@attribute1='attribute value or @attribute2='attribute2 value' ]
		driver.findElement(By.xpath("//input[@type='text' or @name='email']"));
		
		// find element on index basis
		//==>
		driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		
		
		
	}

}
