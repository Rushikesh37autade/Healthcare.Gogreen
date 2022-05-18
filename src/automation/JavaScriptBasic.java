package automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptBasic {
	public static void main(String[] args) throws InterruptedException, IOException {
		//1. border to webelement
		//2.title
		//3. click element
		//4.create alert
		//5. refresh page
		//scroll up/down/intoview
		
		//1. border to webelement
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		
//		driver.switchTo().frame("iframeResult");
//		
//		WebElement TimeBtn = driver.findElement(By.xpath("//button[@type='button']"));
//		JavascriptExecutor js= ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border='3px solid red'", TimeBtn);
//		SeliniumUtils.borderbyjs(driver, TimeBtn);
//		SeliniumUtils.getscreenshot(driver);
		
		
		//2.title
//		JavascriptExecutor js= ((JavascriptExecutor)driver);
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		System.out.println(SeliniumUtils.textbyjs(driver));
//		SeliniumUtils.getscreenshot(driver);
		
		//3. click element
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();",TimeBtn);
//		SeliniumUtils.clickbyjs(driver, TimeBtn);
//		SeliniumUtils.getscreenshot(driver);
		
		
		//4.create alert
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();",TimeBtn);
//		js.executeScript("alert('"+" sucessfully clicked"+"')");
//		SeliniumUtils.atertbyjs(driver, "sucessfully clicked");
		
		
		//refresh
		driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)");
//		js.executeScript("alert('"+"refreshed sucessfully"+"')");
//		SeliniumUtils.refreshbyjs(driver);
//		SeliniumUtils.atertbyjs(driver, "refreshed sucessfully");
		
	// handle alert
//		Alert al = driver.switchTo().alert();
//		al.accept();
//		
		//scroll down
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,1000)");
//	SeliniumUtils.scrollbyjs(driver, 0, 2000);
		
		//scroll up
//				JavascriptExecutor js =((JavascriptExecutor)driver);
//				js.executeScript("scroll(0,2000)");
//				Thread.sleep(2000);
//		
//				js.executeScript("scroll(0,200)");
//	SeliniumUtils.scrollbyjs(driver, 0, 2000);

//
//				Thread.sleep(2000);
				driver.manage().window().maximize();

	   // scroll into view
			WebElement starthere = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
//				js.executeScript("arguments[0].scrollIntoView(true);", starthere);
//				js.executeScript("arguments[0].click();", starthere);
	SeliniumUtils.scrollintoviewbyjs(driver, starthere);
	SeliniumUtils.clickbyjs(driver, starthere);
		

		
		
		
		
	}

}
