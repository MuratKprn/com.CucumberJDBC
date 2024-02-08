package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class OuterRunner {

        final String tags = "@tag";

        @CucumberOptions(
                plugin = {
                        "html:target/reports/" + tags + "-report.html",
                        "json:target/json-reports/" + tags + "-report.json",
                        "junit:target/xml-report/" + tags + "-report.xml",
                        "rerun:target/failedRerun.txt"
                },
                features = "src/test/Resources",
                glue = {"StepDefinitions"},
                tags = tags,
                dryRun = false
        )

        public class Runner {}

}




