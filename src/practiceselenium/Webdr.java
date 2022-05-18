package practiceselenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdr {
	public static void main(String[] args) {
		// how to call browser
		// how to search url
		// how to close
		//how to quit
		//how to get current url
		// how get title of  current tab
		// maximize window of tab
		//navigate
		//setsize of tab window
		//set positiontab window
		
		//1. how to call browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe" );
		
		//upcasting to call browser
		WebDriver driver=new ChromeDriver();
		//2. how to search url

		
		driver.get("https://www.flipkart.com/");
		
		//3. how to close
		//driver.close();
		
		//how to quit
		//driver.quit();
		
		//5.how to get current url
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
        System.out.println(url);
        
		//6. how get title of  current tab

		String title=driver.getTitle();
		System.out.println(title);
		
		// maximize window of tab
		driver.manage().window().maximize();
		
		//navigate
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().to("https://search.brave.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();

		//setsize of tab window
		
		Dimension d=new Dimension(300,200);
		driver.manage().window().setSize(d);
		
		//set positiontab window
		
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);
		

		

		

		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
