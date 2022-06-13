package co.com.dafiti.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import java.util.List;
import java.util.Map;

import static co.com.dafiti.UI.HomePage.CATEGORY;
import static co.com.dafiti.UI.HomePage.SUBCATEGORY;
import static co.com.dafiti.UI.Product.PRODUCT;

public class SelectProduct implements Task {

    private DataTable data;
    public SelectProduct(DataTable data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        List<Map<String, String>> values = data.asMaps(String.class, String.class);
        actor.attemptsTo(
                MoveMouse.to(CATEGORY.of(String.valueOf(values.get(0).get("category"))).resolveFor(actor)),
                Click.on(SUBCATEGORY.of(String.valueOf(values.get(0).get("subcategory"))).resolveFor(actor)),
                Click.on(PRODUCT.of(String.valueOf(values.get(0).get("product"))).resolveFor(actor))
        );
    }

    public static SelectProduct theProductWithThe(DataTable data){
        return Tasks.instrumented(SelectProduct.class, data);
    }

}
