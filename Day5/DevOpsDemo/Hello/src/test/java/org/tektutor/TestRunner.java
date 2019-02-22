package org.tektutor;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/java/org/tektutor")
public class TestRunner {

}
