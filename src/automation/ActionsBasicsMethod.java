package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class ActionsBasicsMethod {
	public static void main(String[] args) throws InterruptedException {
		// actions class  methods
		// compalsory method for actions class 1.build.... 2. perform
		// 1.hovering
		// 2.drag and drop
		// 3. click(left)
		// 4. right click
		// 5.double click 
		// 6.send keys 
		
		// 1.hovering
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		
//		List<WebElement> headers = driver.findElements(By.xpath("//div[@class='eFQ30H']/a/div/div/img"));
//		for(int i=0; i<headers.size(); i++ ) {
//			WebElement header = headers.get(i);
//			Actions actions=new Actions(driver);
//			actions.moveToElement(header);
//			actions.build().perform();
//			System.out.println(header.getAttribute("alt"));
//			Thread.sleep(1000);
//	}			
		//2. Resize
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement dragbtn = driver.findElement(By.xpath("//div[contains(@class,' ui-icon ui-icon-gripsmall-diagonal-se')]"));
//		Actions actions=new Actions(driver);
//			Thread.sleep(2000);
//			actions.dragAndDropBy(dragbtn, 100, 50);
//			actions.build().perform();
		
		//drag and drop
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		
//		Actions action=new Actions(driver);
//		action.dragAndDrop(dragable, dropable).build().perform();
		
		// only drag
//		driver.get("https://jqueryui.com/draggable/");
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		Actions action= new Actions(driver);
//		action.dragAndDropBy(dragable, 150, 50).build().perform();
		
		//sendkeys
		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement id = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
//		Actions action=new Actions(driver);
//		
//		//action.sendKeys(id, "Rushi").build().perform();
//		//for uppercase
//		action.keyDown(id, Keys.SHIFT).sendKeys("rushi").keyUp(Keys.SHIFT);
//		action.sendKeys(Pass, "Rushi@").build().perform();
//		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		action.click(login).build().perform();
		
		// right click== contextclick, DoubleClick=Doublrclick
//		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement img = driver.findElement(By.xpath("  //img[@src='data-samples/images/popup_pic.gif']"));
//		Actions action=new Actions(driver);
//		action.contextClick(img).build().perform();
		
		
		
		//double click
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
		
		//drag and drop example not working for w3school website
//		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.switchTo().frame("iframeResult");
//		WebElement image = driver.findElement(By.xpath("//img[@id='drag1']"));
//		WebElement dropbox = driver.findElement(By.xpath("//div[@id='div1']"));
//		Thread.sleep(2000);
//		Actions action=new Actions(driver);
//    action.dragAndDrop(image, dropbox).build().perform();
		
		

		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		

	}


