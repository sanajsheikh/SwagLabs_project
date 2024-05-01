package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Login_page;
import utilities.Driver_setup;

public class Script_1 {
WebDriver driver;
	
	@Test
	public void login_valid_cred() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.enter_valid_cred();
		lp.login_btn_clk();
	}
	
	@Test
	public void loginInvalidUserValidPwd() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.InvalidUserValidPwd();
		lp.login_btn_clk();
	}
	
	@Test
	public void loginInvalidUserInvalidPwd() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.InvalidUserInvalidPwd();
		lp.login_btn_clk();
	}
	
	@Test
	public void loginBlankUserBlankPwd() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.login_btn_clk();
	}
	
	@Test
	public void loginValidUserInvalidPwd() {
		driver = Driver_setup.testBrowserSetUp();
		Login_page lp = new Login_page(driver);
		lp.validUserInvalidPwd();
		lp.login_btn_clk();		
	}
	
	
}
