package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPageElement {


    public static Target NAME_FIELD = Target.the("NAME FIELD")
            .located(By.id("com.experitest.ExperiBank:id/nameTextField"));
    public static Target PHONE_FIELD = Target.the("PHONE FIELD")
            .located(By.id("com.experitest.ExperiBank:id/phoneTextField"));
    public static Target AMOUNT = Target.the("AMOUNT")
            .located(By.id("com.experitest.ExperiBank:id/amount"));
    public static Target COUNTRY_FIELD = Target.the("COUNTRY FIELD")
            .located(By.id("com.experitest.ExperiBank:id/countryTextField"));
    public static Target SENDPAYMENT_BUTTON = Target.the("SENDPAYMENT_BUTTON")
            .located(By.id("com.experitest.ExperiBank:id/sendPaymentButton"));
    public static Target YES_BUTTON = Target.the("SENDPAYMENT_BUTTON")
            .located(By.id("android:id/button1"));
}
