package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	
	@DataProvider
    public Object [][] getdata(){

	
	Object[][] obj=new Object[3][2];
	obj[0][0]="admin";
	obj[0][1]="manager";
	
	obj[1][0]="12344456";
	obj[1][1]="43661778";
	
	obj[2] [0]="@@@@$$dhg2345";
	obj[2] [1]="48793##$$@@";
	return  obj;
	} 
	
	@Test(dataProvider = "getData")
	public void tc1(String username ,String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://190.210.184.180/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		Thread.sleep(5000);
		driver.close();
	}
	
}
