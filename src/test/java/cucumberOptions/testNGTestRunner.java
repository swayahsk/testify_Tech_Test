package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="StepDefinitions",monochrome=true,tags = "@Function",
plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})
public class testNGTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true )
	public Object[][] scenarios (){
		return super.scenarios();	
		}
	
}
 