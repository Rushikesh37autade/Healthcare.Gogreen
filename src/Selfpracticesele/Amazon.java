package Selfpracticesele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
//		List<WebElement> contries = driver.findElements(By.xpath("(//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine'])[2]/ul/li/a"));
//		
//    for (int i=0;  i<contries.size(); i++) {
//    	System.out.println("total contrise are"+contries.size());
//    	String contrey = contries.get(i).getText();
//    	String contreylink = contries.get(i).getAttribute("href");
//
//    	System.out.println(i+" "+contrey+"==>"+contreylink);
		
		List<WebElement> headerlinks = driver.findElements(By.xpath("//div[@id='nav-xshop-container']/div/a"));
		
		for(int i=0; i<headerlinks.size(); i++) {
			String headertext = headerlinks.get(i).getText();
	
			String header = headerlinks.get(i).getAttribute("href");
			
			System.out.println(i+") "+headertext+"==>"+header);
		}
		
		
		
		
		
		
    }
	}





