package test.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty" ,"html:build/reports/tests/test/cucumber.html" ,
        "json:build/reports/tests/test/cucumber.json"},features="src/test/resources/features/", glue="test")
public class AcceptanceTestSuite {}
