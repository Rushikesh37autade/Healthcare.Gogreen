package Selfpracticesele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngleTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// rows
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th")).size();

		for (int r=1; r<=rows; r++) {
			for (int c=1; c<=columns; c++) {
				String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(","+value);
			}
			System.out.println();
		}
	}

}
