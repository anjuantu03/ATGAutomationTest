# ATG Automation

This project is Cucumber java implementation for automating user navigation of ATG web application.
# Pre requisites

1. Java and Maven should be installed and paths should be set in environment variable

2. Jenkins should be configured if the test needs to be scheduled to run in specific time or with the help of CRON job.

# Building and Running

Maven is used to build this project.

Execution starts from TestRunner.java file.

$ mvn clean test 


# Project Structure

1)ATGAutomation -> src -> test -> resources -> Features ->This folder contains one feature file

		1.ATG.feature	: This contains the scenario that needs to be tested 

2)ATGAutomation -> src -> test -> java -> pages ->This package contains below java classes with WebElements locators and related functions

      1.ATGCouponPage.java	: This contains the WebElements and related functions of Coupon selection page.
      2.ATGHomePage.java	: This contains the WebElements and related functions of home page.

3)ATGAutomation -> src -> test -> java -> StepDefinitions ->This package contains below java classes 

      1.ATGSteps.java	: This contains the Step definitions of the feature file
      2.TestRunner.java	: This is the Runner class which contains the required details to execute the test

4)   ATGAutomation -> Reports -> report.html -> This contains the report of the tests. 





