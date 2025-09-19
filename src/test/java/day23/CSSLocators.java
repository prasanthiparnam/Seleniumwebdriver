package day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSLocators {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize(); //maximize the window
      //tag id    syn:tag#id
      //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
    //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");
    
      //2.tag class  syn:tag.classname
     //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("t-shirt");
    //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("t-shirt");
    
      //3.tag attribute  syn:tag[attribute=value]
    //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-shirt");
    //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("t-shirt");
    
    //4.tag class attribute syn:tag.class[atrribute='value']
    //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("t-shirt");
    driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("t-shirt");

	}

}
