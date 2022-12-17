package testng;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 {

	@Test
	public void tc1() {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://190.210.184.180/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());

}
}
