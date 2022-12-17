package testng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc1 {

	public WebDriver driver;
	
	@BeforeMethod
	public void openapp() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://190.210.184.180/login.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void tc1() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("password");
		String title=driver.getTitle();
		
		Assert.assertEquals(title,title);
		
		Reporter.log(title,true);
		String url=driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	
@AfterMethod
public void closeapp() {
	driver.quit();
}
}
