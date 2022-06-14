package co.com.dafiti.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;

import static co.com.dafiti.UI.HomePage.MODULE;

public class SelectModule implements Task {
    private DataTable data;
    public SelectModule(DataTable data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        List<Map<String, String>> values = data.asMaps(String.class, String.class);
        actor.attemptsTo(
                Click.on(MODULE.of(String.valueOf(values.get(0).get("module"))).resolveFor(actor))
        );
    }

    public static SelectModule theProductWithThe(DataTable data){
        return Tasks.instrumented(SelectModule.class, data);
    }

}
