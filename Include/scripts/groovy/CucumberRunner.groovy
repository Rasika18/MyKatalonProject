
import internal.GlobalVariable;

import org.junit.runner.RunWith;
import org.junit.runnner.Runwith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "include/features",
		glue = "",
		plugin = {
					"pretty",
					"html:BDDReports/HTML",
					"json:BDDReports/JSON/reports.json"
		)

public class CucumberRunner {
	
	
}