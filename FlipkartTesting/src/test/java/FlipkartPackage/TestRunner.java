package FlipkartPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features = {"src/test/resources/featureFiles/"},
       glue = {"FlipkartAutomation"},
      plugin = {"html:target/cucumber-html-report"},
       monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests{

}

