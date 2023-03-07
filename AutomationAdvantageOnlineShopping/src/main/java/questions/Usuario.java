package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.PaginaInicio.QUESTION_REGISTER;

public class Usuario implements Question <String> {
    public static Usuario seRegistro() {
        return new Usuario();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(QUESTION_REGISTER,isVisible()).forNoMoreThan(60).seconds());
        return Text.of(QUESTION_REGISTER).answeredBy(actor);
    }
}