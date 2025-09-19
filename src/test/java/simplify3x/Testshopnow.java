package simplify3x;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testshopnow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("div.item a[aria-label=\"Men's Outerwear Shop Now\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    String script =
	        "return document.querySelector('shop-app')" +
	        ".shadowRoot.querySelector('shop-home')" +
	        ".shadowRoot.querySelector('div.item a[aria-label=\"Men\\'s Outerwear Shop Now\"]')";
	    Object element = js.executeScript(script);
	    if (element != null) {
	        ((org.openqa.selenium.WebElement) element).click();
	    }

	}

}
