package starter.actions.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchArticle {
    public static Target myserachitem(int ran) {
        return (Target.the("inventory_item").locatedBy(".inventory_list .inventory_item:nth-child(" + ran + ") button"));
    }
    static Target SHOPPING_CART = Target.the("shopping_cart_link").locatedBy(".shopping_cart_link");
    static Target CHECKOUT = Target.the("checkout").locatedBy("#checkout");
    static Target FIRST_NAME = Target.the("first-name").locatedBy("#first-name");
    static Target LAST_NAME = Target.the("last-name").locatedBy("#last-name");
    static Target ZIP_CODE = Target.the("postalCode").locatedBy("#postal-code");
    static Target CONTINUE = Target.the("continue").locatedBy("#continue");
    static Target FINISH = Target.the("finish").locatedBy("#finish");
}
