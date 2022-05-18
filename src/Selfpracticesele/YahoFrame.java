package Selfpracticesele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahoFrame {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		
		
	}

}
