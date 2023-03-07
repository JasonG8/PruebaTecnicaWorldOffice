package tasks;


import interactions.Llenar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;




public class Crear implements Task {
    public static Crear elRegistro() {
        return Tasks.instrumented(Crear.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Llenar.elFormulario());
    }
}