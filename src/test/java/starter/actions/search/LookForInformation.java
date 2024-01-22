package starter.actions.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.http.conn.util.PublicSuffixList;
import org.openqa.selenium.Keys;

public class LookForInformation {
    public static Performable enterUserName(String searchTerm) {
        return Task.where("{0} searches for user box, then entry the user name '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchLogin.SEARCH_USERBOX)
        );
    }
    public static Performable enterThePass(String pass) {
        return Task.where("{0} searches for pass box, then entry the pass '" + pass + "'",
                Enter.theValue(pass)
                        .into(SearchLogin.SEARCH_PASSBOX)
        );
    }
    public static Performable clickLogin(){
        return Task.where("{0} Click on Login button after write user name and password", Click.on(SearchLogin.SEARCH_LOGINBUTTON));
    }
    public static Performable item() {
        return Task.where("{0} Click on the random article", Click.on(SearchArticle.SEARCH_ITEM)
        );
    }
}
