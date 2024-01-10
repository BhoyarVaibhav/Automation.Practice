package brouser_urls;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base_class.Base_class;

public class Class_004 extends Base_class {

	public static void main(String[] args) throws Exception {
		
		launch_brouser("Chrome");
		navigate("https://www.amazon.in/");
		
		//To get root directory
		String projectpath = System.getProperty("user.dir");
		
		
		//take screenshot 
	     TakesScreenshot ph = (TakesScreenshot) driver;
		 File image = ph.getScreenshotAs(OutputType.FILE);
		 File target = new File(projectpath+"//vaibhav//AmazoneHomepage.png");
	     org.openqa.selenium.io.FileHandler.copy(image, target);
	}

}
