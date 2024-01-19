package starter.actions.search;

import net.serenitybdd.screenplay.targets.Target;

class SearchUser {
    static Target SEARCH_USERBOX = Target.the("user-name").locatedBy("#user-name");
    static Target SEARCH_PASSBOX = Target.the("password").locatedBy("#password");
    static Target SEARCH_ITEM = Target.the("inventory_item").locatedBy("#item_"+((int) (Math.random()*4+1))+"_title_link");
}
