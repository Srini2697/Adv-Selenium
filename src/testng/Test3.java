package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(groups="customer")
	public void createcustomer() {
		Reporter.log("createcustomer",true);
	}
	
	@Test
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
	}
		
	@Test(groups="project")
	public void createproject() {
		Reporter.log("createproject",true);
	}

	@Test
	public void deleteproject() {
		Reporter.log("deleteproject",true);
	}
}
