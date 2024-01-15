package JavascriptExecutor_Ex;

import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_class;

public class Class_001 extends Base_class{

	public static void main(String[] args) throws Exception {
		/*JavascriptExecutor-
		is ia an interface.You can scroll the page with the  help of JavascriptExecutor.
		Steps:
        1.JavascriptExecutor assign to driver with the help of casting*/
        
        
        launch_brouser("Chrome");
        navigate("https://www.railyatri.in/");
        takescreenshot("Railway");
        
        //scroll page
        JavascriptExecutor kp =(JavascriptExecutor) driver;
        //kp.executeScript("window.scrollBy(0,1200)");
        
        //scroll page from top to bottom
        kp.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        takescreenshot("After the full scroll bar");
	}

}