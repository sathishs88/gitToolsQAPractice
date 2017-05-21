package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseFunctions.BaseRunner;

public class IphonesPage extends BaseRunner{
	
	@FindBy(how=How.LINK_TEXT, using="Apple iPhone 4S 32GB SIM-Free – White")
	WebElement link_phoneModel;
	
	public IphonesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductDetailPage clickSelectedPhoneModel(){
		link_phoneModel.click();
		return new ProductDetailPage(driver);
	}

}

