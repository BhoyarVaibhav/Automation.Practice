package brouser_urls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jiomart.com/");
		
		//locate web element 
		driver.findElement(By.id("nav_link_8584"));
		driver.findElement(By.name("gtm_status"));
		driver.findElement(By.className("jio-web cms-home jiomart_home home_overflow_hidden"));
		
		
	}

}
