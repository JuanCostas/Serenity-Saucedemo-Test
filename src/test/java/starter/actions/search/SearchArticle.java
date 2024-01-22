package starter.actions.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchArticle {
    static Target SEARCH_ITEM = Target.the("inventory_item").locatedBy("#item_"+((int) (Math.random()*4+1))+"_title_link");
}
