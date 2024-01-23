package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.navigation.NavigateTo;
import starter.actions.search.LookForInformation;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    @CastMember
    Actor actor;
    @BeforeEach
    void login() {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.enterUserName("standard_user"),
                LookForInformation.enterThePass("secret_sauce"),
                LookForInformation.clickLogin()
        );
    }
    @Test
    @DisplayName("Should be able to shop")
    void shop() throws InterruptedException {
        int ran;
        for(int i = 0; i<3; i++) {
            ran = ((int) (Math.random() * 6 + 1));
            actor.attemptsTo(
                    LookForInformation.item(ran)
            );
        }
        actor.attemptsTo(
                LookForInformation.shoppingCart(),
                LookForInformation.checkout(),
                LookForInformation.firstName("Juan"),
                LookForInformation.lastName("Costas"),
                LookForInformation.zipCode("4000"),
                LookForInformation.buttonContinue(),
                LookForInformation.finish()
        );
        Thread.sleep(5000);
    }
}
