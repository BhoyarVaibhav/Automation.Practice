package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class.Base_class;

public class Class_001 extends Base_class {

	public static void main(String[] args) throws Throwable {

		launch_brouser("Chrome");
        navigate("https://www.amazon.in/");
        takescreenshot("amazon Homepage");
        
        
        //Action Class
        Actions ac = new Actions(driver);
        WebElement link = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        ac.moveToElement(link).build().perform();
        takescreenshot("move to mobile link");
        
        //move towards Amazon minitv
        ac.moveToElement(driver.findElement(By.xpath("//a[text()='Amazon miniTV']"))).build().perform();    
        takescreenshot("After move to amazone minitv");
	}

}
