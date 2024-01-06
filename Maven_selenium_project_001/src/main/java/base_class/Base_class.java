package base_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	
	public static WebDriver driver;
	
	//Dynamic code for launch browser
    public static void launch_brouser(String browser) {
    	if(browser.equalsIgnoreCase("Chrome")) {
    		WebDriver driver = new ChromeDriver();
    		
    	}else if(browser.equalsIgnoreCase("Firefox")) {
    		WebDriver driver = new FirefoxDriver();
    		
    	}else if(browser.equalsIgnoreCase("Edge")) {
    		WebDriver driver = new EdgeDriver();
    		
    	}
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
    }
}
