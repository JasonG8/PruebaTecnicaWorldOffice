package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {
    public static final Target MENU_USER = Target.the("menu user")
            .located(By.xpath("//a[@id='menuUserLink']"));
    public static final Target CREATE_NEW_ACCOUNT = Target.the("CREATE NEW ACCOUNT")
            .located(By.cssSelector("a.create-new-account.ng-scope"));
    public static final Target QUESTION_REGISTER = Target.the("validate question register")
            .located(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
}
