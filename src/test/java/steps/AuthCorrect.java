package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import ui.PaymentPageElement;


public class AuthCorrect {


    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="sude";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("I login with username company and password company")
    public void i_login_with_username_company_and_password_company() {
        actor.attemptsTo(LoginToEriBank.login("company","company"));
    }


    @Then("you should see the payment button")
    public void you_should_see_the_payment_button() {
        //actor.attemptsTo(Ensure.that(PaymentPageElement.PAYMENT_BUTTON).isDisplayed());
    }

}
