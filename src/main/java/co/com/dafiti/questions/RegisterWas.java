package co.com.dafiti.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import static co.com.dafiti.UI.HomePage.LABEL_NAME;

public class RegisterWas implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor){
        actor.attemptsTo(
                Ensure.that(LABEL_NAME).hasTextContent("HOLA, " + actor.recall("NameSelected"))
        );
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
    public static RegisterWas Added(){
        return new RegisterWas();
    }

}
