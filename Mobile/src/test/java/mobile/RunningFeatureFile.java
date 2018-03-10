package mobile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report", "json:target/test-report.json",
		"junit:target/test-report.xml" }, features = {
				
				// this for Receive Email on Basic Function
				"src/test/BDD/cucumber.feature",
				
	
				
})


public class RunningFeatureFile {

}
