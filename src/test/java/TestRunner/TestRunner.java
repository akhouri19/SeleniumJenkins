package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/",glue= {"StepDefination"},
monochrome = true,
plugin={"pretty","html:target/HtmlReports","json:target/JSONReport/report.json","json:target/cuucmber.json"},
		tags="@smoke"
		)
public class TestRunner {

}