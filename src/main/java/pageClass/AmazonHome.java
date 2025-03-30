package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class AmazonHome {
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();

	public AmazonHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement serachbox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	@FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
	WebElement amazonBasic;
	@FindBy(xpath = "//span[starts-with(text(),'Amazon Brands')]")
	WebElement amazonBrands;
	@FindBy(xpath= "//span[contains(text(),'Freezer Gallon Bags, 90 Count (Previously Solimo)')]")
	WebElement amazonBrandProductFreezerBag;
	

	public void search() {
		gl.clickonelement(serachbox);
		serachbox.sendKeys("amazon basics");
		gl.clickonelement(searchButton);
	}

	public Boolean amazonBasicDisplayed() {
		return gl.isDisplayed(amazonBasic);
	}
	public void amazonBrandCheckin() {
		 gl.clickonelement(amazonBrands);
	}
	public Boolean amazonBrandisSelected() {
	 return gl.isSelected(amazonBrands);
	}
	public void amazonBrandProduct() {
		 gl.clickonelement(amazonBrandProductFreezerBag);
		 
		 
	}
	
	
}
