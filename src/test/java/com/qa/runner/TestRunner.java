package com.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.qa.tests/stepDefinitions"},
        features={"src/test/resources/features/"},
        format = {"pretty","html:report"},
        tags = {"@SmokeTest, @RegressionTest"}, //Execute tests tagged as SmoteTests or RegressionTest only.
        dryRun=false
)

public class TestRunner {
}

