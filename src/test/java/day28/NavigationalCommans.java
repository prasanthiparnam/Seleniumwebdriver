package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommans {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/"); //accepts URl in string format only
		//driver.navigate().to("https://demo.nopcommerce.com/");
		//URL myobjt=new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myobjt);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		
		
		
		

	}

}
