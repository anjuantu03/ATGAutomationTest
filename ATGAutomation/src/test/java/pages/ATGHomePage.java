package pages;

/**
 * This class contains the WebElements and the required
 * functions in home page
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

public class ATGHomePage {

	WebDriver driver;


	@FindBy(xpath=".//a/span[text()='Häst']")
	WebElement tab_Horse;

	@FindBy(xpath=".//div[@data-test-id='gameType-horse-icon']/div[text()='V4']")
	WebElement btn_V4;
	
	@FindBy(xpath=".//a[@data-test-id='quicklinks-calendar-horsebetting']")
	WebElement btn_gameCalendar;
	
	@FindBy(xpath=".//span[@data-test-id='date-nav-step-container']/a[2]")
	WebElement btn_nextDay;
	
	@FindBy(xpath=".//span[@data-test-id='calendar-menu-gameType-V4']")
	WebElement btn_gameTypeV4;
	
	
	

	public ATGHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//This function is to select Häst in home page.
	public void selectHorse() throws InterruptedException
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", tab_Horse);
			
		}	

		catch (NoSuchElementException e) {
			System.out.println("Häst tab is not available");
			Assert.fail("Häst tab is not available");
		}

	}


	
	//This function is to select V4 from homepage, incase V4 option is not available, it will select V4 from game calendar.
	public void selectV4() throws InterruptedException
	{
		try
		{
		
		if(btn_V4.isDisplayed())
		{
		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4);
		}
		}
		
		catch(Exception e) {
			System.out.println("V4 option is not available in Home page.Proceeding with Calendar option.");
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_gameCalendar);
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(btn_nextDay));
			executor.executeScript("arguments[0].click();", btn_nextDay);
			wait.until(ExpectedConditions.visibilityOf(btn_gameTypeV4));
			executor.executeScript("arguments[0].click();", btn_gameTypeV4);
			Thread.sleep(8000);
		}


	}


}
