package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseFunctions.BaseFunctions;

public class LoginPage extends BaseFunctions{
	
	@FindBy(how=How.ID, using="user_login")
	@CacheLookup
	WebElement txt_UserName;
	
	@FindBy(how=How.ID, using="user_pass")
	@CacheLookup
	WebElement txt_Password;
	
	@FindBy(how=How.NAME, using="wp-submit")
	@CacheLookup
	WebElement btn_Login;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProfilePage LoginToApp(){
		txt_UserName.sendKeys("test5");
		txt_Password.sendKeys("test5");
		btn_Login.click();
		return new ProfilePage(driver);
	}

}
