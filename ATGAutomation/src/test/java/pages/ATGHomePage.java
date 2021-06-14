package pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


	public void selectHorse()
	{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", tab_Horse);
		}	

		catch (NoSuchElementException e) {
			System.out.println("Häst tab is not available");
		}

	}


	public void selectV4() throws InterruptedException
	{
		
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_V4);
		}
		catch(Exception e) {
			System.out.println("V4 option is not available");
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", btn_gameCalendar);
			Thread.sleep(8000);
			executor.executeScript("arguments[0].click();", btn_nextDay);
			Thread.sleep(3000);
			executor.executeScript("arguments[0].click();", btn_gameTypeV4);
			Thread.sleep(8000);
		}


	}


}
