package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
		// Basic methods of webdriver
		//1.launch the browser
		//2.Enter url in the browser
		//3.close the current tab 
		//4. quit all tabs
		//5.get url of current tab
		//6.get title of current tab
		//7.navigation from one to another page
		//8.maximize the window of tab
		//9. set the size of window
		//10.set the position of tab window
		
		//1.launch the browser
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Rushi\\Desktop\\Selinium all jars\\chromedriver_win32(99)\\chromedriver.exe\\");
		
	     WebDriver driver=new ChromeDriver();
	     
	     //2.Enter url in the browser
	     
	     driver.get("https://www.irctc.co.in/nget/train-search");
	     
	     
	   //3.close the current tab 
	   //  driver.close();
	     
			//4. quit all tabs

	    // driver.quit();
	     
			//5.get url of current tab
	    String url= driver.getCurrentUrl();
	    System.out.println(url);
	    
		//6.get title of current tab
	    String title=driver.getTitle();
	    System.out.println(title);
	    
		//7.navigation from one to another page(forward,backward,refresh)
//	    driver.navigate().to("https://www.facebook.com/login/");
//	    driver.navigate().to("https://search.brave.com/");
//	    driver.navigate().back();
//	    driver.navigate().forward();
//	    driver.navigate().refresh();
	    
		//8.maximize the window of tab
	    driver.manage().window().maximize();
	    
		//9. set the size of window
	    
	    Dimension d=new Dimension(200,400);
	    driver.manage().window().setSize(d);
	    
	    
		//10.set the position of tab window
	    Point p=new Point(300,200);

	    driver.manage().window().setPosition(p);
 


	    

	     
	}

}
