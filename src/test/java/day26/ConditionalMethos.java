package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethos {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//1.isDisplayed()
		 //WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("logo is displayed:"+logo.isDisplayed());
		boolean logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
       System.out.println("logo is displayed:"+logo);
       
       //2.isEnable()
     //boolean status  =driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
      // System.out.println("Enable status:"+status);  //true
       
       //3.isSelected()
      WebElement male_id =driver.findElement(By.xpath("//input[@id='gender-male']"));
      WebElement female_id =driver.findElement(By.xpath("//input[@id='gender-female']"));
     // System.out.println("Before selecting....");  
      //System.out.println(female_id.isSelected());  //false
     // System.out.println(male_id.isSelected());  //false
      
      System.out.println("After selecting male....");
      male_id.click();
      
      System.out.println(male_id.isSelected());  //true
       System.out.println(female_id.isSelected());  //false
       
       System.out.println("After selecting female....");
       female_id.click();
       
       System.out.println(male_id.isSelected());  //false
        System.out.println(female_id.isSelected());  //true
        
        boolean newslatter_status=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println("newslatter status is displayed:"+newslatter_status);
       
      
      


	}

}
