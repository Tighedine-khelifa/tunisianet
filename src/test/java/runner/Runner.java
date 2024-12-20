package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="stepDef",
        dryRun = false,
        plugin = {"pretty","html:target/cucumber-report.html"},
        tags = "@regression or @sanity"


)
public class Runner {
}
