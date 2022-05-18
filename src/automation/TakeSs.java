package automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeSs {
	public static void getscreenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		String filename =d.toString().replace(" ", "_").replace(":", "_")+".png";
		File dest = new File("D:\\\\SElenium screenshots\\\\redbus"+filename);
		FileUtils.copyFile(src, dest);

}
}