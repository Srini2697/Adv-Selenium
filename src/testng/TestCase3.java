package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	public void tc3() {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://190.210.184.180/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

	driver.findElement(By.name("pwd")).sendKeys("manager");
}
}

