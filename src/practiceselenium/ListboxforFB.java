package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxforFB {
	public static void main(String[] args) throws InterruptedException {
		// list box and Dropbox
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement creataccon = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		creataccon.click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		WebElement birtday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		// creat object for select 
		Select s= new Select(birtday);
		//add values
		//1.selectbyvalue()
		//2.selectbyindex()
		//3.selectbyvisibletext()
		
		
		
		//1.selectbyvalue()
		//s.selectByValue("14");
		
		//2.selectbyindex()==> index starts with 0 and ends with n-1
		//s.selectByIndex(5);

		//3.selectbyvisibletext()

		//s.selectByVisibleText("15");
		
		//getoptions
		
		List<WebElement> days = s.getOptions();
		System.out.println(days.size());
		for(int i=0; i<days.size(); i++) {
		String D = days.get(i).getText();
			System.out.print(" "+D);
		
		}
		System.out.println("");

		
		//get first selected option
		
		String text = s.getFirstSelectedOption().getText();
		
	    System.out.println(text);
		
		
	}

}
