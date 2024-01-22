package starter.actions.search;

import net.serenitybdd.screenplay.targets.Target;

class SearchLogin {
    static Target SEARCH_USERBOX = Target.the("user-name").locatedBy("#user-name");
    static Target SEARCH_PASSBOX = Target.the("password").locatedBy("#password");
    static Target SEARCH_LOGINBUTTON = Target.the("login-button").locatedBy("#login-button");
}
