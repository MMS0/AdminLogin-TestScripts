package runner.AdminLogin;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features="AdminLogin TestCase Features/1) Login Module Features",
					glue="stepDefenition.Login_Module",
					dryRun=false,
					strict=true,
					monochrome=true ,
					plugin={"html:Report/htmlReport","json:Report/JsonReport.json","junit:Report/XMLReport.xml"})

public class Login_Module_Runner {

}
