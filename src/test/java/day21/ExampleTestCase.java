package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ExampleTestCase {

	public static void main(String[] args) {
		//1.lunch browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();

		//2.open url(https://demo.nopcommerce.com/)
		driver.get("https://demo.nopcommerce.com/");
		
		//3.validate title should be"nopCommerce demo store"
		String ac_titile=driver.getTitle();
		if(ac_titile.equals("nopCommerce demo store"))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//4.close browser
		driver.quit();
	}

}
