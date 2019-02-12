package Utility;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.qa.tests"},
        features={"src/test/resources/features/"},
        format = {"pretty","html:report"},
        tags = {"@SmokeTest, @RegressionTest"} //Execute SmoteTests or RegressionTest
       )

public class RunCucumberTest {
}

