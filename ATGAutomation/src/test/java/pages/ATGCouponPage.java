package pages;

/**
 * This class contains the WebElements and the required
 * functions in V4 page
 * 
 */

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ATGCouponPage {
	
	WebDriver driver;


	@FindBy(xpath=".//button[@data-test-id='new-coupon']")
	WebElement btn_newCoupon;
	
	
	@FindBy(xpath=".//button[text()='Tom kupong']")
	WebElement btn_newCouponPopup;
	

	@FindBy(xpath=".//div/div[text()='V4-1']/parent::div/div[*]/div/span/button[@data-test-id='coupon-button-leg-1-start-1']")
	WebElement btn_V4_1_horse1;
	
	@FindBy(xpath=".//div/div[text()='V4-1']/parent::div/div[*]/div/span/button[@data-test-id='coupon-button-leg-1-start-2']")
	WebElement btn_V4_1_horse2;
	
	
	@FindBy(xpath=".//div/div[text()='V4-1']/parent::div/div[*]/div/span/button[@data-test-id='coupon-button-leg-1-start-3']")
	WebElement btn_V4_1_horse3;
	
	@FindBy(xpath=".//div/div[text()='V4-1']/parent::div/div[*]/div/span/button[@data-test-id='coupon-button-leg-1-start-4']")
	WebElement btn_V4_1_horse4;
	
	
	@FindBy(xpath=".//div/div[text()='V4-2']/parent::div/div[*]/div/span/button[@data-test-id='coupon-button-leg-2-start-1']")
	WebElement btn_V4_2_horse1;
	
	
	@FindBy(xpath=".//div/div[text()='V4-3']/parent::div/div[*]/div/span/button[@data-test-id='coupon-button-leg-3-start-1']")
	WebElement btn_V4_3_horse1;
	
	
	@FindBy(xpath=".//div/div[text()='V4-3']/parent::div/div[*]/div/span/button[@data-test-id='coupon-button-leg-3-start-2']")
	WebElement btn_V4_3_horse2;
	
	@FindBy(xpath=".//button[@data-test-id='leg-4-toggle-all']")
	WebElement btn_V4_4_all;
	
	
	
	
	
	public ATGCouponPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//This function is to make coupon
	public void clickNewCoupon()
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(btn_newCoupon));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_newCoupon);
		}	

		catch (NoSuchElementException e) {
			System.out.println("New Coupon is not available");
			Assert.fail("New Coupon is not available");
		}

	}
	
	//This function is to click new coupon from the pop up
	public void clickNewCouponPopup()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_newCouponPopup);
		}	

		catch (NoSuchElementException e) {
			System.out.println("New Coupon Pop up option is not available");
			Assert.fail("New Coupon pop up option is not available");
		}

	}
	
	
	//This function is to select 4 horses from V4-1
	public void selectV4_1_horses()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4_1_horse1);
			executor.executeScript("arguments[0].click();", btn_V4_1_horse2);
			executor.executeScript("arguments[0].click();", btn_V4_1_horse3);
			executor.executeScript("arguments[0].click();", btn_V4_1_horse4);
		}	

		catch (NoSuchElementException e) {
			System.out.println("Horses are not available- V4-1");
			Assert.fail("Horses are not available- V4-1");
		}

	}
	
	//This function is to select 1 horse from V4-2
	public void selectV4_2_horses()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4_2_horse1);		
		}	

		catch (NoSuchElementException e) {
			System.out.println("Horses are not available- V4-2");
			Assert.fail("Horses are not available- V4-2");
		}

	}
	
	
	//This function is to select 2 horses from V4-3
	public void selectV4_3_horses()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4_3_horse1);	
			executor.executeScript("arguments[0].click();", btn_V4_3_horse2);
		}	

		catch (NoSuchElementException e) {
			System.out.println("Horses are not available- V4-3");
			Assert.fail("Horses are not available- V4-3");
		}

	}
	
	//This function is to select all horse from V4-4
	public void selectV4_4_horses()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4_4_all);	
		}	

		catch (NoSuchElementException e) {
			System.out.println("Horses are not available- V4-4");
			Assert.fail("Horses are not available- V4-4");
		}

	}

}
