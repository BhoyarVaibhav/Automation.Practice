package brouser_urls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_002 {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jiomart.com/");
		
		
		//Enter data
		driver.findElement(By.id("autocomplete-0-input")).sendKeys("jiomart");
		
		//Thread.sleep(2000);
		//clear
		driver.findElement(By.id("autocomplete-0-input")).clear();
		
		// locate link
		WebElement link = driver.findElement(By.xpath("//a[text()='Fashion']"));
		String link_name = link.getText();
		System.out.println("the link name is :-"+link_name);
        System.out.println("The link name is:- "+link.getText());
		link.click();
		
		//capture the attribute value
	     System.out.println("The value of href Attribute is;-"+link.getAttribute("href"));
	     System.out.println("The value of class Attribute is;-"+link.getAttribute("class"));
			
	     //enter the text in the search box
	     WebElement searchbox = 
	    		 driver.findElement(By.cssSelector("input#autocomplete-0-input"));
	     searchbox.sendKeys("Mobile");
	     System.out.println("Entered Text in Search box is:- " +
	     searchbox.getAttribute("value"));
	     
	     //capture x-coordinate
	     System.out.println("The x-coordinate of searchbox is;-"+searchbox.getLocation().x);
	     System.out.println("The y-coordinate of searchbox is;-"+searchbox.getLocation().y);
	     
	     //capture the size of the searchbox
	     System.out.println("the size of the searchbox is;-"+searchbox.getSize());
	     
	     //capture the tagname
	      WebElement gettag = driver.findElement(By.id("nav_link_1524"));
	      System.out.println("the tagname of the web element is-"+gettag.getTagName());
	     
	     //check the web element is visible
	      WebElement logo = driver.findElement(By.cssSelector("img[src^='https://www.jiomart.com/assets/ds2web/images/jiomart-logo.svg?v=24']"));
	     System.out.println("the logo is visible:"+logo.isDisplayed());
	     
	     //check the element is enable
	     System.out.println("the logo is enable:-"+logo.isEnabled());
	     
	}

}
