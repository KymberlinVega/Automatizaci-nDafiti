package co.com.dafiti.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;

import static co.com.dafiti.UI.ProductDetailsPage.*;

public class AddProduct implements Task {
    private DataTable data;
    public AddProduct(DataTable data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        List<Map<String, String>> values = data.asMaps(String.class, String.class);
        actor.attemptsTo(
                Click.on(SIZE.of(String.valueOf(values.get(0).get("size"))).resolveFor(actor)),
                Click.on(SIZE_1.of(String.valueOf(values.get(0).get("size"))).resolveFor(actor)),
                Click.on(ADDCART.resolveFor(actor))
        );
    }

    public static AddProduct theProductWithThe(DataTable data){
        return Tasks.instrumented(AddProduct.class, data);
    }
}
