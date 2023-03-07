package stepdefinitions;

import exceptions.ExcepcionRegistroUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.Usuario;
import tasks.Crear;
import utils.drivers.MyChromeDriver;

import static exceptions.Excepcion.NO_CREO_USUARIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.constantes.ConstantManage.ACTOR;
import static utils.constantes.ConstantManage.URL;

public class AdvantageOnlineShoppingDefinition {

    @Before
    public void SetUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario necesita ingresar a la pagina advantage shopping para registrarse")
    public void elUsuarioNecesitaIngresarALaPaginaAdvantageShoppingParaRegistrarse() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
    }

    @Cuando("el ingresa la informacion necesaria para crear el registro")
    public void elIngresaLaInformacionNecesariaParaCrearElRegistro() {
        theActorInTheSpotlight().attemptsTo(Crear.elRegistro());
    }

    @Entonces("el verifica que se ha resgistrado en el sistema")
    public void elVerificaQueSeHaResgistradoEnElSistema() {
        theActorInTheSpotlight().should(seeThat(Usuario.seRegistro(), Matchers.comparesEqualTo(theActorInTheSpotlight().recall("user")))
                .orComplainWith(ExcepcionRegistroUsuario.class, NO_CREO_USUARIO.getMensaje()));
    }
}