package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Locators_Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		//maximize the window
		driver.manage().window().maximize();
		//locators-----1.name
		//driver.findElement(By.name("search")).sendKeys("mac");
		
		//2.Id
		//boolean aclogostatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(aclogostatus);
		//3.linkteXt&partiallinktext
		//driver.findElement(By.linkText("Tablets")).click(); //we use everytime linktext only
		//driver.findElement(By.partialLinkText("Tablet")).click(); 
		//partial link text if we have only one link or two links are having separate names
		
		//4.classname
		//List<WebElement> Headerlink =driver.findElements(By.className("list-inline"));
		//System.out.println("total header link:"+Headerlink.size());
		
		//Tagname
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("total number of links:"+links.size());
		
		//images
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("total number of images:"+image.size());
		
		
		
		
		
		
		
		

	}

}
