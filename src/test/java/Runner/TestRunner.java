package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       // tags = "@Smoke",
        features = "src\\main\\resources\\Features",
        glue = "StepDefinitions"

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
