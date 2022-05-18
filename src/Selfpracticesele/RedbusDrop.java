package Selfpracticesele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedbusDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
		WebElement mobilecode = driver.findElement(By.xpath("//select[@id='upphoneCode']"));
		
	Select s= new Select(mobilecode);
	String text = s.getFirstSelectedOption().getText();
	System.out.println(text);

		s.selectByValue("355");
		List<WebElement> codes = s.getOptions();
		System.out.println(codes.size());
		for(int i=0; i<codes.size(); i++) {
			String contrycode = codes.get(i).getText();
			System.out.println(i+"==>"+contrycode);

		}
		
	
	}

	
}
