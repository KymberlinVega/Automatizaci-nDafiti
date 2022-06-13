package co.com.dafiti.stepdefinitions;

import co.com.dafiti.tasks.GoTo;
import co.com.dafiti.tasks.Select;
import com.ibm.icu.impl.LocaleDisplayNamesImpl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CartStepDefinitions
{
     @Before
     public void setTheStage(){
         OnStage.setTheStage(new OnlineCast());
     }

    @Given("That {string} has opened the ecommerce")
    public void givenThatUserHasOpenedTheEcommerce(String username){
        // Codigo de tareas
        theActorCalled(username).wasAbleTo(GoTo.theURL());
    }

    @When("he selects the product from the section")
    public void whenHeSelectsTheProductFromTheSection(DataTable data) {
        // Codigo de tareas
        theActorInTheSpotlight().attemptsTo(Select.theProductWithThe(data));
    }

    @When("he adds the product to the cart")
    public void whenHeAddsTheProductToTheCart() {
        // Codigo de tareas
        theActorInTheSpotlight().attemptsTo(taskAddProduct);
    }

    @Then("he should see the added product in the cart")
    public void thenHeShouldSeeTheAddedProductInTheCart() {
        // Codigo de tareas
        theActorInTheSpotlight().should(seeThat(questionProductWasAdded));
    }
}
