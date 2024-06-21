package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
				
				glue= {"StepDefinations","Hooks"},
				plugin = {"pretty","html:target/htmlreport.html"}

		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
