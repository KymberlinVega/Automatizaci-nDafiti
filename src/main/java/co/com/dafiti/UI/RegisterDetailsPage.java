package co.com.dafiti.UI;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterDetailsPage {

    public static final Target EMAIL = Target.the("Input Email").locatedBy("//input[@id='RegistrationForm_email']");

    public static final Target PASS = Target.the("Input Pass").locatedBy("//input[@id='RegistrationForm_password']");

    public static final Target CONFIRMPASS = Target.the("Input ConfirmPass").locatedBy("//form[@id='form-account-create']//div[4]//input[1]");

    public static final Target NAME = Target.the("Input Name").locatedBy("//input[@id='RegistrationForm_first_name']");

    public static final Target LASTNAME = Target.the("Input LastName").locatedBy("//input[@id='RegistrationForm_last_name']");

    public static final Target DOCUMENT = Target.the("Input Document").locatedBy("//input[@id='RegistrationForm_identification']");

    public static final Target TYPE = Target.the("Type type").locatedBy("//select[@id='RegistrationForm_identification_type']");

    public static final Target TYPE_1 = Target.the("Label type").locatedBy("//option[.='{0}']");

    public static final Target DATE = Target.the("Input Date").locatedBy("//input[@id='RegistrationForm_day']");

    public static final Target MONTH = Target.the("Input Month").locatedBy("//input[@id='RegistrationForm_month']");

    public static final Target YEAR = Target.the("Type year").locatedBy("//select[@id='RegistrationForm_year']");

    public static final Target YEAR_1 = Target.the("Label year").locatedBy("//option[.='{0}']");

    public static final Target SEX = Target.the("Type sex").locatedBy("//select[@id='RegistrationForm_gender']");

    public static final Target SEX_1 = Target.the("Label sex").locatedBy("//option[.='{0}']");

    public static final Target SEND = Target.the("Button send").locatedBy("//input[@id='createAccountButton']");
}
