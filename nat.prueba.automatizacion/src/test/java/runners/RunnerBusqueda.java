package runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(value=Cucumber.class)
@CucumberOptions(features = "features/Busqueda.feature", 
glue= {"steps", "runners"},
plugin = { "pretty","html:target/cucumber-reports/cucumber-pretty", 
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt" },
monochrome = true)

public class RunnerBusqueda {
	

}
