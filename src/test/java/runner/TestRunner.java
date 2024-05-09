package runner;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\git\\localrepo\\BDD\\src\\test\\resources\\features\\Login.feature",
				 glue={"stepdefinitions","hooks"},
				 publish=true,
						
				
				 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }}