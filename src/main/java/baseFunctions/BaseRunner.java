package baseFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseRunner extends BaseFunctions{
	
	@BeforeMethod
	public void beforeMethod(){
		invokeApp();
	}
	
	@AfterMethod
	public void afterMethod(){
		//driver.quit();
	}

}
