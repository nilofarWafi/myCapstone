package tek.capstone.framework.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@review",
		features = ("classpath:features"),
		//features =("/tek-capstone-panthers/src/test/resources/features/Home.feature"),
		glue = "tek.capstone.framework",
		dryRun =false,
		plugin = {
				"pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"
		},
		snippets = CAMELCASE,
		monochrome = true
		
		)

public class TestRunner {
}