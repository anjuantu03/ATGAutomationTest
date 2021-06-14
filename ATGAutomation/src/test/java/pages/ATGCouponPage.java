package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	
	public void clickNewCoupon()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_newCoupon);
		}	

		catch (NoSuchElementException e) {
			System.out.println("New Coupon is not available");
		}

	}
	
	
	public void clickNewCouponPopup()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_newCouponPopup);
		}	

		catch (NoSuchElementException e) {
			System.out.println("New Coupon option is not available");
		}

	}
	
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
		}

	}
	
	public void selectV4_2_horses()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4_2_horse1);		
		}	

		catch (NoSuchElementException e) {
			System.out.println("Horses are not available- V4-2");
		}

	}
	
	public void selectV4_3_horses()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4_3_horse1);	
			executor.executeScript("arguments[0].click();", btn_V4_3_horse2);
		}	

		catch (NoSuchElementException e) {
			System.out.println("Horses are not available- V4-3");
		}

	}
	
	public void selectV4_4_horses()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4_4_all);	
		}	

		catch (NoSuchElementException e) {
			System.out.println("Horses are not available- V4-4");
		}

	}

}
