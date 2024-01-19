package starter.actions.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.fluentlenium.core.search.Search;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitElementFinder;

public class LookForInformation {
    public static Performable enterUserName(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchUser.SEARCH_USERBOX)
        );
    }
    public static Performable enterThePass(String pass) {
        return Task.where("{0} searches for '" + pass + "'",
                Enter.theValue(pass)
                        .into(SearchUser.SEARCH_PASSBOX).thenHit(Keys.TAB, Keys.ENTER)
        );
    }

    public static Performable item() {
        return Task.where("{0} searches for", Click.on(SearchUser.SEARCH_ITEM)
                /*Enter.theValue()
                        .into(SearchPass.SEARCH_PASSBOX).thenHit(Keys.TAB, Keys.ENTER)*/
        );
    }
}
