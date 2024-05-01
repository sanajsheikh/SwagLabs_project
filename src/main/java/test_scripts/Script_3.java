package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Login_page;
import pages.Product_page;
import utilities.Driver_setup;

public class Script_3 {
WebDriver driver;
	
	@Test
	public void facebookIconVerify() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.fb_btn_verify();
	}
	@Test
	public void TwitterIconVerify() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.twt_btn_verify();
	}
	@Test
	public void LinkedInIconVerify() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
		
		Product_page pp = new Product_page(driver);
		pp.lin_btn_verify();
	}
}
