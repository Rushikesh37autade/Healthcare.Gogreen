package Selfpracticesele;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nextweb {
	// launch next clothing website
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.next.co.uk/");
		Thread.sleep(2000);
		WebElement closepop = driver.findElement(By.xpath("//button[@aria-label='Close']"));
	closepop.click();		
		Thread.sleep(5000);
//
//		WebElement search = driver.findElement(By.xpath("//input[@class='SearchBox']"));
//		search.sendKeys("means t shirts");
//		Thread.sleep(2000);
//
//		
//		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
//		
//		searchbutton.click();
//		
//		WebElement blueshirt = driver.findElement(By.xpath("//img[contains(@src,'https://xcdn.next.co.uk/Common/Items/Default/Default/ItemImages/Search/224x336/373442.jpg')]"));
//		Thread.sleep(2000);
//
//		blueshirt.click();
		
		
	
		
	//	Thread.sleep(2000);

//		WebElement size = driver.findElement(By.xpath("//div[@ id='dk_container_Size-373-442'and @tabindex='0']"));
//		size.click();
//		
//		WebElement medium = driver.findElement(By.className("(//*[@id=\"dk_container_Size-373-442\"]/div/ul/li[4]/a"));
//		medium.click();
//		Thread.sleep(2000);
		
//		WebElement selectSize = driver.findElement(By.xpath("//select[@id='Size-428-897']"));
//		
//		Select s=new Select(selectSize);
//		
//		s.selectByValue("04");
//
//		WebElement addtobag = driver.findElement(By.xpath("//a[@class='nxbtn primary btn-addtobag addToBagCTA add-to-bag Enabled']"));
//		addtobag.click();
		
		
		  List<WebElement> headerlinks = driver.findElements(By.xpath("//ul[@data-testid='snail-trail-container']/li/a"));
		  System.out.println(headerlinks.size());
		 for(int i=0; i<headerlinks.size(); i++) {
			String Headerlink=headerlinks.get(i).getAttribute("href");
			String Headertext=headerlinks.get(i).getText();

			System.out.println(i+" "+Headertext+"==>"+Headerlink);
			
		 }
		
	}
}

