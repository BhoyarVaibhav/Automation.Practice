package JavascriptExecutor_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_class;

public class Class_003 extends Base_class {

	public static void main(String[] args) throws Throwable {
		
		launch_brouser("Chrome");
        navigate("https://www.flipkart.com/");
        
        driver.findElement(By.name("q")).sendKeys("Oppal");
        driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
        takescreenshot("click after search button...");
        
        //to go back
        JavascriptExecutor ft = (JavascriptExecutor) driver;
        ft.executeScript("window.history.back()");
        takescreenshot("After click ob back button");
        
        //to go forward  
        ft.executeScript("window.history.forward()");
        takescreenshot("After click on forward button");
        
        
        
        
	}

}
