import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDef",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)

public class RunnerClass {
}
