package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PorductPage {

	WebDriver driver;
	WebDriverWait wait;

	public PorductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath = "//span[contains(text(),'Amazon Basics Freezer Gallon Bags')]")
	WebElement productLink;

	@FindBy(xpath = "//span[contains(text(),'Gallon (90 Count)')]")
	WebElement sizeOption;

	@FindBy(id = "add-to-cart-button")
	WebElement addToCartButton;

	public void selectProduct() {
		wait.until(ExpectedConditions.elementToBeClickable(productLink)).click();
	}

	public boolean verifyProductPageDisplayed() {
		return sizeOption.isDisplayed();
	}

	public void clickAddToCart() {
		addToCartButton.click();
	}
}
