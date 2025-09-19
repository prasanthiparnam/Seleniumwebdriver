package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//1.get()---->open the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//2.getTittle()------>return titile of the page
		System.out.println(driver.getTitle());
		//3.getCurrenturl()-----.returns the url of the page
		System.out.println(driver.getCurrentUrl());
		//4.getpagesource()---->returns source code of the page
		//System.out.println(driver.getPageSource());
		//5.getWindowhandle()---->returns ID of the single browser window
		String windowid=driver.getWindowHandle();
		System.out.println("windowid:"+windowid);  //46B1533D67D8FEA35B6F871B1057A3DA
		//6.getwindowhandles()---->returns ID's of the multiple windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();  //this will open new browser window
		Set<String> windowids=driver.getWindowHandles();
		System.out.println("windowID's:"+windowids);
		
		

	}

}
