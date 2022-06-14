package co.com.dafiti.UI;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target CATEGORY = Target.the("Label Category").locatedBy("//ul[@class='navUl']//a[contains(.,'{0}')]");
    public static final Target SUBCATEGORY = Target.the("Label Subcategory").locatedBy("//ul[@class='navUl']//a[contains(.,'{0}')]");
    public static final Target MODULE = Target.the("Label module").locatedBy("//a[@id='LoginInfoTag']");

    public static final Target LABEL_NAME = Target.the("Label login").locatedBy("//span[@class='text']");

}
