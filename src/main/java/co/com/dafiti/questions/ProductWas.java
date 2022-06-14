package co.com.dafiti.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.dafiti.UI.CartPage.PRODUCT_NAME;

public class ProductWas implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor){
        actor.attemptsTo(
                Ensure.that(PRODUCT_NAME).hasText(actor.recall("ProductSelected"))
        );
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
    public static ProductWas Added(){
        return new ProductWas();
    }

}
