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
        return Task.where("{0} Click on Login button after write user name and password", Click.on(SearchLogin.SEARCH_LOGINBUTTON)
        );
    }
    public static Performable item(int ran) {
        return Task.where("{0} Click on the random article " + ran, Click.on(SearchArticle.myserachitem(ran))
        );
    }
    public static Performable shoppingCart(){
        return Task.where("{0} Click on the button Shopping Cart", Click.on(SearchArticle.SHOPPING_CART)
        );
    }
    public static Performable checkout(){
        return Task.where("{0} Click on the fucking button Checkout", Click.on(SearchArticle.CHECKOUT)
        );
    }
    public static Performable firstName(String name) {
        return Task.where("{0} Entry the first name '" + name + "'",
                Enter.theValue(name)
                        .into(SearchArticle.FIRST_NAME)
        );
    }
    public static Performable lastName(String last) {
        return Task.where("{0} Entry the last name '" + last + "'",
                Enter.theValue(last)
                        .into(SearchArticle.LAST_NAME)
        );
    }
    public static Performable zipCode(String postal) {
        return Task.where("{0} Entry the zip code '" + postal + "'",
                Enter.theValue(postal)
                        .into(SearchArticle.ZIP_CODE)
        );
    }
    public static Performable buttonContinue(){
        return Task.where("{0} Click on the button Continue", Click.on(SearchArticle.CONTINUE)
        );
    }
    public static Performable finish(){
        return Task.where("{0} Click on the button Continue", Click.on(SearchArticle.FINISH)
        );
    }
}
