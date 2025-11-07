package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Xpath_Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		//Relative Xpath
		//1.Xpath with single attribue
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("tshirt");
		//driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("tshirt");
				
		//2.xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("tshirt");
		//driver.findElement(By.xpath("//*[@placeholder='Search'][@name='search']")).sendKeys("tshirt");

		//3.Xpath with 'and' 'or' operators
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("tshirt");
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @name='abc']")).sendKeys("tshirt");
				
		//4.Xpath with inner text--->text()----->it is used for innertest and links
				
		//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
				
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		//boolean displayedstatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displayedstatus);
		//String displaytext =driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(displaytext);

				
		//5.Xpath with contain()  method
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("tshirt");
				
		//6.Xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("tshirt");
				
		//7.chained xpath
		
		boolean status=driver.findElement(By.xpath("//div[@id='logo']/h1/a")).isDisplayed();
		System.out.println(status);
				
				


				
				

	}

}
