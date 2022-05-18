package Selfpracticesele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
				WebDriver driver= new ChromeDriver();

		
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement creatnew = driver.findElement(By.xpath("//p[@class='sign-up-link']"));
		creatnew.click();
		
		//List<WebElement> contrycodes = driver.findElements(By.xpath("//select[@name='shortCountryCode']/option"));
		WebElement contrycodes = driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
	
		Select s=new Select(contrycodes);
		//s.selectByValue("AG");
		//s.selectByIndex(1);
		String v = s.getFirstSelectedOption().getText();
		System.out.println(v);
		
		List<WebElement> b = s.getOptions();
		for (int i=0; i<b.size(); i++) {
			String R = b.get(i).getText();
			System.out.println(i+") "+R);
		}
	
				
		
//		System.out.println(contrycodes.size());
//		for(int i=0; i<contrycodes.size(); i++) {
//			String contries = contrycodes.get(i).getText();
//			String datacode = contrycodes.get(i).getAttribute("data-code");
//
//			System.out.println(i+") "+datacode+"==>"+contries);
		}
	}


