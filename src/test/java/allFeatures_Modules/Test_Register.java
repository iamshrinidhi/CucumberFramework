package allFeatures_Modules;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		
		features= {"src/test/resources/all_feature_files"},
		glue = {"allFeatures_Modules"},
		
		plugin = {"pretty",
				"html:target/cucumber-htmlreport1.html",
				"json:target/cucumber-report1.json"
		}
		)
public class Test_Register {
	
	

}
