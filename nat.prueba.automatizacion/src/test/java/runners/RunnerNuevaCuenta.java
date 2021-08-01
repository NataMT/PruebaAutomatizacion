package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(value = Cucumber.class)
@CucumberOptions(features = "features/NuevaCuenta.feature", glue = {
		"stepDefinitions" }, tags = "@tagCrear1", plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" }, monochrome = true)
public class RunnerNuevaCuenta {

}
