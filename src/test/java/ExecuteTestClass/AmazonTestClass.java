package ExecuteTestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageClass.AmazonCart;
import pageClass.AmazonHome;
import pageClass.PorductPage;

public class AmazonTestClass extends BaseClass {
	AmazonHome hp;
	PorductPage pp;
	AmazonCart ac;

	@Test
	public void verifyAmazonBasic() {
		hp = new AmazonHome(driver);
		hp.search();
		Boolean actual = hp.amazonBasicDisplayed();
		Assert.assertTrue(actual);
		System.out.println(actual);
	}

	@Test
	public void clickOnOurBrandCheckBox() {
		hp = new AmazonHome(driver);
		hp.amazonBrandCheckin();
		Boolean actual = hp.amazonBrandisSelected();
		Assert.assertTrue(actual);
		System.out.println(actual);
	}

	@Test
	public void selectOneProduct() {
		hp = new AmazonHome(driver);
		hp.amazonBrandCheckin();
		hp.amazonBrandProduct();
		pp = new PorductPage(driver);
		pp.selectProduct();
		boolean actual = pp.verifyProductPageDisplayed();
		Assert.assertTrue(actual);
		System.out.println(actual);
		pp.clickAddToCart();

	}

	@Test
	public void cartVerification() {
		hp = new AmazonHome(driver);
		pp = new PorductPage(driver);
		ac = new AmazonCart(driver);
		ac.verifyItemAddedToCart();
		boolean actual = ac.verifyCartAmzon();
		Assert.assertTrue(actual);
		System.out.println(actual);
	}

}

