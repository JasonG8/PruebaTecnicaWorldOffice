package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuario {

    public static final Target USER_NAME = Target.the("user name")
            .located(By.name("usernameRegisterPage"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.name("emailRegisterPage"));
    public static final Target PASSWORD = Target.the("PASSWORD")
            .located(By.name("passwordRegisterPage"));
    public static final Target CONFIRM_PASSWORD = Target.the("CONFIRM PASSWORD")
            .located(By.name("confirm_passwordRegisterPage"));
    public static final Target FIRST_NAME = Target.the("FIRST NAME")
            .located(By.name("first_nameRegisterPage"));
    public static final Target LAST_NAME = Target.the("LAST_NAME")
            .located(By.name("last_nameRegisterPage"));
    public static final Target PHONE_NUMBER = Target.the("PHONE_NUMBER")
            .located(By.name("phone_numberRegisterPage"));
    public static final Target COUNTRY = Target.the("COUNTRY")
            .located(By.xpath("//select[@name='countryListboxRegisterPage']"));
    public static final Target CITY = Target.the("CITY")
            .located(By.name("cityRegisterPage"));
    public static final Target ADDRESS = Target.the("ADDRESS")
            .located(By.name("addressRegisterPage"));
    public static final Target STATE_PROVINCE_REGION = Target.the("STATE_PROVINCE_REGION")
            .located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target POSTAL_CODE = Target.the("POSTALCODE")
            .located(By.name("postal_codeRegisterPage"));
    public static final Target CHECK_PRIVACY = Target.the("CHECK PRIVACITY")
            .located(By.cssSelector("div:nth-child(1) sec-view.ng-isolate-scope.sec-view:nth-child(5) > div.inputContainer.ng-scope:nth-child(1)"));
    public static final Target BUTTON_REGISTER = Target.the("BUTTON REGISTER")
            .located(By.id("register_btnundefined"));

    private RegistroUsuario() {
    }
}
