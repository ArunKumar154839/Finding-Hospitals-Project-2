package runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions( 

	features = {".//features"},		

	glue = "stepDefinitionFiles",
	plugin = {"pretty","html:reports/CucumberReport.html", 
//			"rerun:target/rerun.txt",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	dryRun = false,
	monochrome = true,
	publish = true
//	tags = ""
//	tags = "@smoke and @regression"
	)

public class TestRunner {

}
