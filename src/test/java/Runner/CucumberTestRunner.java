package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepsTestDefinitions"}, //en donde van a estar las implementaciones de cada uno de los pasos de nuestros escenarios.
        plugin = {"json:target/cucumber.json", "pretty","html:target/basic-cucumber-reports.html"},
        tags = "@Smoke1"  // Indicamos que Tags quegamos ejecutar. Pueden ser de Scenarios o de Features.

)
public class CucumberTestRunner {}
