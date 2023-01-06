


package awesomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber/cucumber.html",
                "rerun:target/failedrerun.txt",
        },
        glue = { "awesomecucumber" },
        monochrome =true,
        publish = true,
        features = { "src/test/resources/awesomecucumber" }

)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}



