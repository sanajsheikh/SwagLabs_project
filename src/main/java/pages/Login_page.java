package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	//-----------------------------locators-----------------------------------------------
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login_btn;
	
	
	
	
	//-----------------------------methods-----------------------------------------------
	
	public Login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void enter_valid_cred() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
	}
	
	public void validUserInvalidPwd() {
		username.sendKeys("standard_user");
		password.sendKeys("12345");
	}
	
	public void InvalidUserValidPwd() {
		username.sendKeys("standard_user_1");
		password.sendKeys("secret_sauce");
	}
	
	public void InvalidUserInvalidPwd() {
		username.sendKeys("standard_user_1");
		password.sendKeys("12344");
	}

	public void login_btn_clk() {
		login_btn.click();
	}
}
