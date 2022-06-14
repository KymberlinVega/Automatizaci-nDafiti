package co.com.dafiti.UI;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target PRODUCT_NAME = Target.the("Name Product").locatedBy("//div[@id='cart-products']/div[1]//p[.='adidas Performance']");

}
