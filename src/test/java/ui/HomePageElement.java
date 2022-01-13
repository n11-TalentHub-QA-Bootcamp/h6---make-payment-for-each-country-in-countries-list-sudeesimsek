package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElement {
    public static Target PAYMENT_BUTTON = Target.the("PAYMENT BUTTON")
            .located(By.id("com.experitest.ExperiBank:id/makePaymentButton"));
    public static Target LOGOUT_BUTTON = Target.the("LOGOUT_BUTTON")
            .located(By.id("com.experitest.ExperiBank:id/logoutButton"));
}
