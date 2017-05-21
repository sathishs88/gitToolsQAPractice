package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseFunctions.BaseRunner;

public class HomePage extends BaseRunner{

	@FindBy(how=How.LINK_TEXT, using="Product Category")
	WebElement menu_ProductCategory; 

	@FindBy(how=How.LINK_TEXT, using="iPhones")
	WebElement subMenu_Iphone;

	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage hoverProductCategoryMenu(){
		Actions builder = new Actions(driver);
		builder.moveToElement(menu_ProductCategory).perform();
		return this;
	}

	public IphonesPage selectIphoneCategory(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(subMenu_Iphone));
		subMenu_Iphone.click();
		return new IphonesPage(driver);
	}

}
