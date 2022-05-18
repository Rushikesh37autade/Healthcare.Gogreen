package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorswithCss {
	public static void main(String[] args) throws InterruptedException {
		//Css selector 
		//1.tag and id 
		//2.tag and class
		//3.tag and attribute 
		//4.tag class and attribute
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	
		
		Thread.sleep(2000);
		
	
		//1.tag and id 
		// tag#id value
		WebElement user = driver.findElement(By.cssSelector("input#email")); // username fb
		user.sendKeys("Rushikesh");
		
		//2.tag and class
		// tag.class value
		driver.findElement(By.cssSelector("img._97vu img")); // facebook image
		
		//3.tag and attribute 
		// tag[attribute='attribute value']
		driver.findElement(By.cssSelector("input[id='email']")); // fb user id
		
		//4. tag class and attribute
		// tag.class[attribute=attribute value]
		driver.findElement(By.cssSelector("div._9axz[class=\"_9axz\"]")); // log in to facebook text
		
		
		



		
		
	}

}
