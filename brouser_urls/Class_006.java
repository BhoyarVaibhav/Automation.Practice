package brouser_urls;

import org.openqa.selenium.By;

import base_class.Base_class;

public class Class_006 extends Base_class{

	public static void main(String[] args) {
		launch_brouser("Chrome");
		navigate("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

	}

}
