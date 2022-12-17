package synchronization1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
		try {
		driver.get("https://www.flipkart.com/");
		System.out.println("page is loaded");
		}
		catch(Exception e) {
			System.out.println("fail: page is not loaded ");
		}
		driver.close();
	}
}
 