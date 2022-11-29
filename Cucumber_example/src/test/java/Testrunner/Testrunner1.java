package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
    
    @RunWith(Cucumber.class)
    @CucumberOptions (
            features="src/test/java/featurefile/Feature1.feature",
            glue="stepdef"    ,
            dryRun = false,
            monochrome=true
            )

public class Testrunner1 {

}
