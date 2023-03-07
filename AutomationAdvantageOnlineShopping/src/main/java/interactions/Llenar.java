package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaInicio.*;
import static userinterfaces.RegistroUsuario.*;
import static utils.constantes.UsuarioAleatorio.generarUsuarioAleatorio;
import static utils.constantes.ConstantManage.*;

public class Llenar implements Interaction {


    public static Llenar elFormulario() {
        return instrumented(Llenar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("user", generarUsuarioAleatorio());
        actor.attemptsTo(
                Click.on(MENU_USER),
                WaitUntil.the(CREATE_NEW_ACCOUNT, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(CREATE_NEW_ACCOUNT),
                WaitUntil.the(USER_NAME, isEnabled()),
                Enter.theValue(actor.recall("user").toString()).into(USER_NAME),
                Enter.theValue(CORREO).into(EMAIL),
                Enter.theValue(CONTRASEÑA).into(PASSWORD),
                Enter.theValue(CONTRASEÑA).into(CONFIRM_PASSWORD),
                Enter.theValue(NOMBRE).into(FIRST_NAME),
                Enter.theValue(APELLIDO).into(LAST_NAME),
                Enter.theValue(NUMERO_TELEFONO).into(PHONE_NUMBER),
                SelectFromOptions.byVisibleText(PAIS).from(COUNTRY),
                Enter.theValue(CIUDAD).into(CITY),
                Enter.theValue(DIRECCION).into(ADDRESS),
                Enter.theValue(REGION).into(STATE_PROVINCE_REGION),
                Enter.theValue(CODIGO_POSTAL).into(POSTAL_CODE),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_REGISTER)
        );
    }
}