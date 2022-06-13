package co.com.dafiti.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/userRegister.feature",
        glue = "co.com.dafiti.stepdefinitions",
        tags = ""
)


public class UserRegisterRunner {
}
