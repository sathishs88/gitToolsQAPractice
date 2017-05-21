package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseFunctions.BaseRunner;

public class ProductDetailPage extends BaseRunner {
	
	@FindBy(how=How.XPATH, using="//input[@value='Add To Cart']")
	WebElement btn_AddToCart;
	
	@FindBy(how=How.LINK_TEXT, using="Go to Checkout")
	WebElement btn_GoToCheckout;

	public ProductDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public CheckOutPage checkOut(){
		btn_AddToCart.click();
		btn_GoToCheckout.click();
		return new CheckOutPage(driver);
	}
	

}
