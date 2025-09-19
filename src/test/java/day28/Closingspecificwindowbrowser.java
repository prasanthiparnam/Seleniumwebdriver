package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closingspecificwindowbrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		    Set<String> windowids=driver.getWindowHandles();
		    
		    for(String winid:windowids) {
		    	System.out.println("entered for loop-------------");
		    	String title=driver.switchTo().window(winid).getTitle();
		    	if(title.equals("Human Resources Management Software | OrangeHRM HR Software") || title.equals("some other titele"))
		    	{
		    		System.out.println("title: "+title);
		    		driver.close();
		    	}
		    }
	  

	}

}
