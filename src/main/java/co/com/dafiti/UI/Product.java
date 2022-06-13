package co.com.dafiti.UI;

import net.serenitybdd.screenplay.targets.Target;

public class Product {
    public static final Target PRODUCT = Target.the("Label Product").locatedBy("//ul[@id='productsCatalog']/li[1]");
}
