package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"})
public class runnerTest extends AbstractTestNGCucumberTests{

}
