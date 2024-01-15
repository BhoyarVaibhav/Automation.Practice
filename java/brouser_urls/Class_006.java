package brouser_urls;

import org.openqa.selenium.By;

import base_class.Base_class;

public class Class_006 extends Base_class{

	public static void main(String[] args) throws Exception {
		launch_brouser("Chrome");
		navigate("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("handwash");
        takescreenshot("after send text");
        
        //click search button
        driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
        takescreenshot("after click on search button");
	}

}
