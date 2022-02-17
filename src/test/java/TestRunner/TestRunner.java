package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/",glue= {"StepDefination"}, 
monochrome = true,
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},

		tags="@smoke"
		)
public class TestRunner {

}