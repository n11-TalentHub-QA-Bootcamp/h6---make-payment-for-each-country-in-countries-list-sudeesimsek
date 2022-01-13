package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import ui.PaymentPageElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Payment implements Task {
    String actorName = "sude";
    Actor actor = Actor.named(actorName);

    private String phone;
    private String name;
    private String amount;
    private String country;

    public Payment(String phone, String name, String amount, String country) {

        this.phone = phone;
        this.name = name;
        this.amount = amount;
        this.country = country;
    }

    @Override
    @Step("{0} payment to the eribank")
    public <T extends Actor> void performAs(T t) {
        actor.attemptsTo(
                Click.on(PaymentPageElement.PHONE_FIELD),
                SendKeys.of(this.phone).into(PaymentPageElement.PHONE_FIELD),
                Click.on(PaymentPageElement.NAME_FIELD),
                SendKeys.of(this.name).into(PaymentPageElement.NAME_FIELD),
                Click.on(PaymentPageElement.AMOUNT),
                Click.on(PaymentPageElement.COUNTRY_FIELD),
                SendKeys.of(this.country).into(PaymentPageElement.COUNTRY_FIELD),
                Click.on(PaymentPageElement.SENDPAYMENT_BUTTON),
                Click.on(PaymentPageElement.YES_BUTTON)
        );
    }

    public static LoginToEriBank pay(String phone, String name,String amount,String country){
        return instrumented(LoginToEriBank.class, phone,name,amount,country);
    }
}
