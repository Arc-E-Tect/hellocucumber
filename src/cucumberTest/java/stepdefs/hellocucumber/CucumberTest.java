package stepdefs.hellocucumber;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumberTest/resources")
public class CucumberTest {
}