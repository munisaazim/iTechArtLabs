package BDDRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/java/BDD/login.feature",
        glue = {"com.pb.cucumbertest.stepdefinitions"}
)

public class BDDTestRunner {

}