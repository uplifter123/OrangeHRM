package com.orangehrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions( strict =true,
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber3.json",
                "junit:target/xml-report/cucumber3.xml",
        },
        features = "src/test/resources/features",
        glue = "com/orangehrm/step_definitions",
        tags = "@login",
        dryRun = false
)

public class Runner {

}