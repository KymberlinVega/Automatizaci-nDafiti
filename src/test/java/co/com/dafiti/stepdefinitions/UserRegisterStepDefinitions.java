package co.com.dafiti.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserRegisterStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("he selects module")
    public void whenHeSelectsModule() {
        // Codigo de tareas
       // theActorInTheSpotlight().attemptsTo(taskSelectsModule);
    }

    @When("he adds log data")
    public void whenHeAddsLogData() {
        // Codigo de tareas
        //theActorInTheSpotlight().attemptsTo(taskAddData);
    }

    @Then("he should see the registered user")
    public void thenHeShouldSeeTheRegisteredUser() {
        // Codigo de tareas
        //theActorInTheSpotlight().should(seeThat(questionUserWasAdded));
    }
}
