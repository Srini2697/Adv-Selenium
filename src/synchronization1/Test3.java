package synchronization1;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://190.210.184.180/login.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			while(true) {
				try {
					driver.findElement(By.name("username")).sendKeys("abcd");
					break;
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
}
		