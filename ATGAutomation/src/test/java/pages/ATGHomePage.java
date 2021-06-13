package pages;

import org.openqa.selenium.JavascriptExecutor;
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


	public ATGHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void selectHorse()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", tab_Horse);

	}


	public void selectV4()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btn_V4);

	}


}
