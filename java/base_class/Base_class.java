package base_class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_class {
	
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	
	//Dynamic code for launch browser
    public static void launch_brouser(String browser) {
    	if(browser.equalsIgnoreCase("Chrome")) {
    		 driver = new ChromeDriver();
    		
    	}else if(browser.equalsIgnoreCase("Firefox")) {
    		 driver = new FirefoxDriver();
    		
    	}else if(browser.equalsIgnoreCase("Edge")) {
    		 driver = new EdgeDriver();
    		
    	}
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		}
        //Dynamic code for navigate url
  		public static void navigate(String url) {
  			driver.get(url);
  			driver.getTitle();
      }
  		//Dynamic code for screenshot
  		public static void takescreenshot(String screenshotname) throws Exception {
  		TakesScreenshot ph = (TakesScreenshot) driver;
  		File src = ph.getScreenshotAs(OutputType.FILE);
  		File trg = new File(projectpath+"\\vaibhav\\"+screenshotname+".png");
  		FileHandler.copy(src, trg);
  		
  		}
}
