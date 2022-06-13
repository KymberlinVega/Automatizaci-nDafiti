package co.com.dafiti.stepdefinitions;

import co.com.dafiti.tasks.AddModule;
import co.com.dafiti.tasks.AddRegister;
import co.com.dafiti.tasks.GoTo;
import co.com.dafiti.tasks.SelectProduct;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserRegisterStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("That user has opened the ecommerce")
    public void that_user_has_opened_the_ecommerce(String actorname) {
        // Codigo de tareas
        theActorCalled(actorname).wasAbleTo(GoTo.theURL());
    }

    @When("he selects module")
    public void whenHeSelectsModule(DataTable data) {
        // Codigo de tareas
        theActorInTheSpotlight().attemptsTo(AddModule.theProductWithThe(data));
    }

    @When("he adds log data")
    public void whenHeAddsLogData(DataTable data) {
        // Codigo de tareas
        theActorInTheSpotlight().attemptsTo(AddRegister.theProductWithThe(data));
    }

    @Then("he should see the registered user")
    public void thenHeShouldSeeTheRegisteredUser() {
        // Codigo de tareas
        //theActorInTheSpotlight().should(seeThat(questionUserWasAdded));
    }
}
