package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src/test/resources/features",
glue = {"Stepdefinitions"}

)

public class testRunner2 extends AbstractTestNGCucumberTests {
@Override
@DataProvider(parallel = true)
public Object[][] scenarios(){
return super.scenarios();
}
}

