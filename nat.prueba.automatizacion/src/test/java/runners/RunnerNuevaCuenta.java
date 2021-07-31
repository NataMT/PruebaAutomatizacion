package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(value = Cucumber.class)
@CucumberOptions(features = "features/NuevaCuenta.feature", 
glue = { "stepDefinitions" }, 
tags = "@tagCrear1")
public class RunnerNuevaCuenta {

}
