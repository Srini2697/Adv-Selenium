package synchronization1;


	import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

	public class Test2  {

		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://190.210.184.180/login.do");
			
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(10));
			wait.pollingEvery(Duration.ofSeconds(5));
			wait.ignoring(NoSuchElementException.class);
			
			driver.findElement(By.name("username")).sendKeys("abcd");
			
			
		}
	}
