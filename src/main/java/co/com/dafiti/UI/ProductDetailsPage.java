package co.com.dafiti.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailsPage {
    public static final Target SIZE = Target.the("Type size").locatedBy("//div[@class='selectSize mbs loaded']/div[@class='selectContainer']");

    public static final Target SIZE_1 = Target.the("Label size").locatedBy("//li[@class='prd-option-item opt-item-1']");

    public static final Target ADDCART = Target.the("Button AddCart").locatedBy("//button[contains(.,'Agregar al carrito')]");
}
