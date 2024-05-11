package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseURL;
import page.Login1;

public class LoginTest extends BaseURL {
	
	Login1 Login;
	@BeforeMethod
	public void setup() {
		initilization();
		Login = new Login1();
	}
	
	
	
	@AfterMethod
	private void closeUrl() {
		driver.close();
	}

}
