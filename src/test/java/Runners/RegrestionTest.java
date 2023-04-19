package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                tags = "@RegressionTest",
                features = {"src/test/java/cucumber_3/FeatureFiles"},
                glue = {"StepDefinitions"}
        )
public class RegrestionTest extends AbstractTestNGCucumberTests {
}
