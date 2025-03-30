package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class AmazonCart {
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();

	public AmazonCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='nav-cart-count' and text()='1']")
	WebElement cartCount;

	@FindBy(xpath = "//span[contains(text(),'Subtotal (1 item)')]")
	WebElement subtotalText;

	public boolean verifyItemAddedToCart() {
		return cartCount.isDisplayed();
	}

	public boolean verifyCartAmzon() {
		return subtotalText.isDisplayed();
	}
}
