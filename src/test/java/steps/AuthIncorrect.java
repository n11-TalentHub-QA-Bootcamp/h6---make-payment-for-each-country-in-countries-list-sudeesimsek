package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import ui.LoginPageElements;

public class AuthIncorrect {

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
        actor.attemptsTo(LoginToEriBank.login("username","password"));
    }

    @Then("you should see the eribank image")
    public void you_should_see_the_eribank_image() {
        //actor.attemptsTo(Ensure.that(LoginPageElements.ERIBANKIMG).isDisplayed());
    }
}
