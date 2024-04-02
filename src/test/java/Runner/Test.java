package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features",
glue = "StepDefinitions",
tags="@tag",
//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//plugin={"html:target/cucumber.html"},
dryRun=true)

//plugin={"html:target/cucumber.html"})
//plugin={"pretty","json:target/cucumberReports.json"},
//plugin={"pretty","junit:target/cucumberReports.xml"})


public class Test extends AbstractTestNGCucumberTests {
	
}
