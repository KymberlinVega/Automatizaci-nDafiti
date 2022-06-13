package co.com.dafiti.UI;

import net.serenitybdd.screenplay.targets.Target;

public class Product {
    public static final Target PRODUCT = Target.the("Label Porduct").locatedBy("//div[@class='itm-product-main-info']//p[.='{0}}']");
}
