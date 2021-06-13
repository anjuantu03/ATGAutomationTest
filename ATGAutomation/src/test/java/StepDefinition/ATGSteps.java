package StepDefinition;

import java.io.File;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ATGHomePage;

public class ATGSteps {

	WebDriver driver= null;
	ATGHomePage homepage;

	@Before
	public void browserSetup()
	{
		String projectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("the user in ATG home page")
	public void the_user_in_atg_home_page() {

		driver.get("https://www.atg.se/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

	}

	@When("the user select Horse")
	public void the_user_select_horse() {
		homepage= new ATGHomePage(driver);
		homepage.selectHorse();

	}

	@And("Select V4")
	public void select_v4() {
		homepage.selectV4();

	}

	@And("Make a Coupon")
	public void make_a_coupon() {
		System.out.println("Test");

	}

	@And("^Mark four horses on v4:One$")
	public void mark_four_horses_on_v_One() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@And("^Mark one horse on v4:Two$")
	public void mark_one_horse_on_v_Two() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^Mark two horses on v4:Three$")
	public void mark_two_horses_on_v_Three() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@And("^Mark all horses on v4:Four$")
	public void mark_all_horses_on_v_Four() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	    
	    
	@Then("test is finished")
	public void test_is_finished() {
		System.out.println("Test completed successfully!!");
	}



	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();

	}
	
	 

}
