package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E://Eclipse 2021//SeleniumCucumberProject//Features//OrangeHRM.feature", glue = "stepDefination")

public class TestRunner {

}
