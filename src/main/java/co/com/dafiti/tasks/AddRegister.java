package co.com.dafiti.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.dafiti.UI.RegisterDetailsPage.*;

public class AddRegister implements Task {
    private DataTable data;
    public AddRegister(DataTable data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        List<Map<String, String>> values = data.asMaps(String.class, String.class);
        actor.attemptsTo(
                Enter.theValue(String.valueOf(values.get(0).get("email"))).into(EMAIL.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("pass"))).into(PASS.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("confirmpass"))).into(CONFIRMPASS.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("name"))).into(NAME.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("lastname"))).into(LASTNAME.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("document"))).into(DOCUMENT.resolveFor(actor)),
                Click.on(TYPE.of(String.valueOf(values.get(0).get("type"))).resolveFor(actor)),
                Click.on(TYPE_1.of(String.valueOf(values.get(0).get("type"))).resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("date"))).into(DATE.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("month"))).into(MONTH.resolveFor(actor)),
                Click.on(YEAR.of(String.valueOf(values.get(0).get("year"))).resolveFor(actor)),
                Click.on(YEAR_1.of(String.valueOf(values.get(0).get("year"))).resolveFor(actor)),
                Click.on(SEX.of(String.valueOf(values.get(0).get("sex"))).resolveFor(actor)),
                Click.on(SEX_1.of(String.valueOf(values.get(0).get("sex"))).resolveFor(actor)),
                Click.on(SEND.resolveFor(actor))
        );
    }

    public static AddRegister theProductWithThe(DataTable data){
        return Tasks.instrumented(AddRegister.class, data);
    }
}
