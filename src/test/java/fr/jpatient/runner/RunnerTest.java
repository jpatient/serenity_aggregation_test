package fr.jpatient.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "fr.jpatient.steps", features = "src/test/resources/features", tags = "@Test")
public class RunnerTest {

}
