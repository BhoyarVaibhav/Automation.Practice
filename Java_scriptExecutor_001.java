package brouser_urls;

import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_class;

public class Java_scriptExecutor_001 extends Base_class{

	public static void main(String[] args) throws Exception {
		/*JavascriptExecutor-
		is ia an interface.You can scroll the page with the  help of JavascriptExecutor.
		Steps:
        1.JavascriptExecutor assign to driver with the help of casting*/
        
        
        launch_brouser("Chrome");
        navigate("https://www.railyatri.in/");
        takescreenshot("Railway");
        
        JavascriptExecutor kp =(JavascriptExecutor) driver;
        //kp.executeScript("window.scrollBy(0,1200)");
        kp.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        takescreenshot("After the full scroll bar");
	}

}
