package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethod {
	public static void main(String[] args) throws InterruptedException {
		//webelement methods
		//1.sendkeyes()
		//2.click()
		//3.is enable
		//4.is selected
		//5. is displayed
		//6. gettext()
		//7.getattribute()
		//8.multiple elements
		
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		// 1.sendkeys
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//		
//		username.sendKeys("Rushikesh");
		
		//2. click
//		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
//		login.click();
		
		//is enable
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//		if(username.isEnabled()==true) {
//			username.sendKeys("Rushikesh");
//		}else {
//				System.out.println("uername fild is disabled ");
				
		// desable field
//		WebElement creatNewacc = driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
//		creatNewacc.click();
//		
//		Thread.sleep(2000);
//		WebElement selectnoun = driver.findElement(By.xpath("//option[text()='Select your pronoun']"));
//		System.out.println(selectnoun.isEnabled());
//		
//		
//		// is selected
//		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
//		female.click();
//		System.out.println(female.isSelected());
				
		
			// is displayed (fb tag line)
		WebElement fbTag = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
				System.out.println(fbTag.isDisplayed());
				
			// 6.get text(fb tagline)
				String ActualText = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
		
				String expectedText="Sign Up" ;
				if (ActualText.equals(expectedText)) {
					System.out.println(ActualText);
					System.out.println("test is passed");
				}
			
				
				
			//7. get attribute
				String actualattributetitle = driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).getAttribute("title");
				
				System.out.println(actualattributetitle);
				
		    // 8.multiple elements
			// 1.get footer elements link
			// 2. get footer elements text	
				List<WebElement> footerlist = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a"));
				
				for(int i=0; i<footerlist.size(); i++) {
					String footerlink=footerlist.get(i).getAttribute("href");
					String footerText=footerlist.get(i).getText();

					System.out.println(i+")"+footerText+"==>"+footerlink);
				
				}
			}
		}
				
		
	


