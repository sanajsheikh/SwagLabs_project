package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Cart_page;
import pages.Checkout_page;
import pages.Login_page;
import pages.Product_page;
import utilities.Driver_setup;

public class Script_2 {
WebDriver driver;
	
	@Test
	public void addProductToCart() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.prod_atc1();
		pp.cart_btn_clk();
		
		Cart_page cp = new Cart_page(driver);
		cp.prod1IsPresent();		
	}
	
	@Test
	public void verify_cart() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.prod_atc1();
		pp.select_filter();
		pp.cart_btn_clk();
	
		Cart_page cp = new Cart_page(driver);
		cp.prod1IsPresent();
		cp.remove_btn_clk();
		cp.option_btn_clk();
		cp.all_items_clk();
	}
	
	@Test
	public void logout_btn_func() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.prod_atc1();
		
		Cart_page cp = new Cart_page(driver);
		cp.option_btn_clk();
		cp.logout_btn_clk();
	}
	
	@Test
	public void VerifyCartAfterLogoutLogin() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.prod_atc1();
		pp.cart_btn_clk();

		Cart_page cp = new Cart_page(driver);
		cp.option_btn_clk();
		cp.logout_btn_clk();
		
		lp.enter_valid_cred();
		lp.login_btn_clk();
	}
	
	@Test
	public void ResetAppStateVerify() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.prod_atc1();
		pp.cart_btn_numb();
		pp.options_btn_clk();
		pp.reset_btn_clk();
		pp.cart_btn_numb();
		
	}
	
	@Test
	public void VerifyRemoveContinueBtn() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.prod_atc1();
		pp.cart_btn_clk();
		
		Cart_page cp = new Cart_page(driver);
		cp.prod1IsPresent();
		cp.remove_btn_clk();
		cp.continueShopping();
		pp.productPageVisible();
	}
	
	@Test
	public void AboutLinkVerify() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.options_btn_clk();
		pp.about_btn_clk();
		
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void checkOut() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.prod_atc1();
		pp.cart_btn_clk();
		
		Cart_page cp = new Cart_page(driver);
		cp.prod1IsPresent();
		cp.checkout_btn_clk();
		
		Checkout_page chp = new Checkout_page(driver);
		chp.enterCheckoutDetails();
		chp.success_msg();
	}
	
	
	
}
