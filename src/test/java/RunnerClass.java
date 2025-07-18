import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDef",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)

public class RunnerClass extends AbstractTestNGCucumberTests {
}
