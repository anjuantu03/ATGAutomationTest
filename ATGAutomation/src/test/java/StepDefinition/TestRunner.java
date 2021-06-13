package StepDefinition;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/Features/ATG.feature",
glue= {"StepDefinition"},
tags="@Test",
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:Reports/report.html"}, 
monochrome = true
		)


public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("Config/report.xml"));

	}


}
