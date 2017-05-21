package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseFunctions.BaseFunctions;

public class ProfilePage extends BaseFunctions{
	
	@FindBy(how=How.LINK_TEXT, using="ONLINE STORE")
	WebElement link_Home;

	public ProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickHomeLink(){
		link_Home.click();
		return new HomePage(driver);
	}

}
