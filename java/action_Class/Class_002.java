package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import base_class.Base_class;

public class Class_002 extends Base_class {

	public static void main(String[] args) throws Throwable {
		launch_brouser("Chrome");
        navigate("https://www.amazon.in/");
        takescreenshot("amazon Homepage");
        
        Actions ac1 = new Actions(driver);
        ac1.moveToElement(driver.findElement(By.id("nav-cart-icon nav-sprite"))).contextClick().build().perform();
        takescreenshot("After click on cart");
	}

}
