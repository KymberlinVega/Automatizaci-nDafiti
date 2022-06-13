package co.com.dafiti.stepdefinitions;

import co.com.dafiti.tasks.AddProduct;
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
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CartStepDefinitions
{
     @Before
     public void setTheStage(){
         OnStage.setTheStage(new OnlineCast());
     }

    @Given("That {string} has opened the ecommerce")
    public void givenThatUserHasOpenedTheEcommerce(String actorname){
        // Codigo de tareas
        theActorCalled(actorname).wasAbleTo(GoTo.theURL());
    }

    @When("he selects the product from the section")
    public void whenHeSelectsTheProductFromTheSection(DataTable data) {
        // Codigo de tareas
        theActorInTheSpotlight().attemptsTo(SelectProduct.theProductWithThe(data));
    }

    @When("he adds the product to the cart")
    public void whenHeAddsTheProductToTheCart(DataTable data) {
        // Codigo de tareas
        theActorInTheSpotlight().attemptsTo(AddProduct.theProductWithThe(data));
    }

    @Then("he should see the added product in the cart")
    public void thenHeShouldSeeTheAddedProductInTheCart() {
        // Codigo de tareas
        //theActorInTheSpotlight().should(seeThat(questionProductWasAdded));
    }
}
