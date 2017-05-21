package testCases;

import org.testng.annotations.Test;

import baseFunctions.BaseRunner;
import pages.LoginPage;

public class TC002_BuyIPhone extends BaseRunner {
	
	@Test
	public void buyIphoneTestCase(){
		new LoginPage(driver).LoginToApp()
		.clickHomeLink()
		.hoverProductCategoryMenu()
		.selectIphoneCategory();
	}

}
