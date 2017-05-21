package testCases;

import org.testng.annotations.Test;

import baseFunctions.BaseRunner;
import pages.LoginPage;

public class TC001_Login extends BaseRunner{
	
	@Test
	public void loginTestCase(){
		new LoginPage(driver).LoginToApp();
		
	}

}
