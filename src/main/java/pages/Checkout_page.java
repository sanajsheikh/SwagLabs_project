package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkout_page {
	WebDriver driver;
	//-----------------------------locators------------------------------------
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement fname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement zip_code;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continue_btn;
	
	@FindBy(xpath = "//button[@id='finish']")
	WebElement finish_btn;
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	WebElement success_msg;
	
	
	//------------------------------methods------------------------------------
	public Checkout_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void enterCheckoutDetails() {
		fname.sendKeys("Sana");
		lname.sendKeys("Sheikh");
		zip_code.sendKeys("415605");
		continue_btn.click();
		finish_btn.click();
	}
	
	public void success_msg() {
		Assert.assertTrue(success_msg.isDisplayed(), null);
	}
	
}
