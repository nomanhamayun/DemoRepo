package Utility;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.qa.tests"},
        features={"src/test/resources/features/"},
        format = {"pretty", "html:output"})

public class RunCucumberTest {
}

