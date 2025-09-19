package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//Normal alert with ok button
		/*
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		if(myalert.getText().equals("I am a JS Alert"))
		{
			System.out.println("test is passed");
		}
		myalert.accept();
		*/
		//2.Confirmation alert ok & cancel button
		/*
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); //close alert using "ok" button
		driver.switchTo().alert().dismiss();   //close alert using "cancel" button
		*/
		//3.prompt alert-Input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
		
		
		
		
		

	}

}
