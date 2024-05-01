package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart_page {
//----------------------------------------locators------------------------------------------
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement prod1;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	WebElement remove_btn;
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement options_btn;
	
	@FindBy(xpath = "//a[@id='inventory_sidebar_link']")
	WebElement all_items;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logout_btn;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continue_btn;
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout_btn;
	//--------------------------------methods------------------------------------------------
	public Cart_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void prod1IsPresent() {
		Assert.assertTrue(prod1.isDisplayed(),"prod1 is not displayed in cart");
	}
	public void remove_btn_clk() {
		remove_btn.click();
	}
	public void option_btn_clk() {
		options_btn.click();
	}
	public void all_items_clk() {
		all_items.click();
	}
	
	public void logout_btn_clk() {
		logout_btn.click();
	}
	public void continueShopping() {
		continue_btn.click();
	}
	public void checkout_btn_clk() {
		checkout_btn.click();
	}
}
