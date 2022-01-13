package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ui.PageElement;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import tasks.Payment;
import ui.HomePageElement;
import ui.LoginPageElements;
import ui.PaymentPageElement;

public class MakeAPaymentToThreeDifferentClient {
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
        actor.attemptsTo(Payment.pay("0532","sude","10","CN"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","20","USA"));
        actor.attemptsTo(Click.on(PaymentPageElement.SENDPAYMENT_BUTTON));
        actor.attemptsTo(Payment.pay("0532","sude","30","JPN"));
    }

    @Then("I should see balance")
    public void you_should_see_the_information_toast() {
        //actor.attemptsTo(Ensure.that(HomePageElement.PAYMENT_BUTTON).isDisplayed());
    }
}
