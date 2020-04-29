package br.ce.gyrodrigues;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Contas.feature",
		glue = "Steps",
		tags = {"~@ignore"},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		dryRun = false,
		strict = false
		)
public class RunnerTest {

}
