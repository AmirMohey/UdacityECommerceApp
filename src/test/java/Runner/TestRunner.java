package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        //tags = "@Smoke",
        features = "src\\main\\resources\\Features",
        glue = "StepDefinitions",
        plugin = { "pretty", "html:target/cucumber-reports/index.html" }

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
