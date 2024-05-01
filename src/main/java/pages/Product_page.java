package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Product_page {
//----------------------------------------locators--------------------------------------------------
	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addToCart1;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement addToCart2;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cart_btn;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement select_btn;
	
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	WebElement prod1;
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement options_btn;
	
	@FindBy(xpath = "//a[@id='reset_sidebar_link']")
	WebElement reset_btn;
	
	@FindBy(xpath = "//span[@class='title']")
	WebElement productPageHeading;
	
	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	WebElement about_btn;
	
	@FindBy(xpath = "//a[normalize-space()='Facebook']")
	WebElement fb_btn;
	
	@FindBy(xpath = "//a[normalize-space()='Twitter']")
	WebElement twt_btn;
	
	@FindBy(xpath = "//a[normalize-space()='LinkedIn']")
	WebElement lin_btn;
	
	//-----------------------------------methods------------------------------------------------------
	public Product_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void productPageVisible() {
		Assert.assertTrue(productPageHeading.isDisplayed(), "did not navigate to product page");
	}
	public void prod_atc1() {
		addToCart1.click();
	}
	
	public void prod_atc2() {
		addToCart2.click();
	}
	
	public void cart_btn_clk() {
		cart_btn.click();
	}
	
	public void options_btn_clk() {
		options_btn.click();
	}
	
	public void about_btn_clk() {
		about_btn.click();
	}
	
	public void reset_btn_clk() {
		reset_btn.click();
	}
	
	public void select_filter() {
		Select dd = new Select(select_btn);
		dd.selectByVisibleText("Price (low to high)");
	}
	
	public void cart_btn_numb() {
		String cartNumber = cart_btn.getText();
		System.out.println("CartNumber = "+cartNumber);
	}
	
	public void fb_btn_verify() {
		fb_btn.click();
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
	}
	public void twt_btn_verify() {
		twt_btn.click();
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
	}
	public void lin_btn_verify() {
		lin_btn.click();
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
	}
}
