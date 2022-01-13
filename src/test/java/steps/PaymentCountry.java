package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import tasks.Payment;
import ui.HomePageElement;
import ui.PaymentPageElement;

public class PaymentCountry {
    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="sude";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("I login with username company and password company and enter valids")
    public void i_login_with_username_company_and_password_company() {
        actor.attemptsTo(LoginToEriBank.login("username","password"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","10","India"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","10","USA"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","10","Iceland"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","10","Greenland"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","10","Switzarland"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","10","Norway"));
    }

    @Then("I should see balance")
    public void you_should_see_the_information_toast() {
        //actor.attemptsTo(Ensure.that(HomePageElement.PAYMENT_BUTTON).isDisplayed());
    }
}
