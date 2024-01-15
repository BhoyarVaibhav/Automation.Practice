package JavascriptExecutor_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_class;

public class Class_002 extends Base_class{

	public static void main(String[] args) throws Exception {
		launch_brouser("Chrome");
        navigate("https://www.railyatri.in/");
        takescreenshot("Railway");

        
        JavascriptExecutor or = (JavascriptExecutor) driver;
        or.executeScript("window.history.go(0)");
        
        //Scroll at the end
        or.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        //click on link about us
        driver.findElement(By.id("a#about_us_footer")).click();
	}

}
