package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//1.lunch browser(chrome)
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2.open url(https://open.cart.com/)
		
          driver.get("https://demo.opencart.com.gr/");
          /*
          
          //3.validate title should be "your store"
          String actual_title=driver.getTitle();
          if(actual_title.equals("Your Store"))
          {
        	  System.out.println("Test passed");
          }
          else
          {
        	  System.out.println("TestFailed");
          }
          
          //4.close browser
          driver.quit();
          //driver.close();
           
           */
          
          
	}

}
