package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
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
    /*@Test
    @DisplayName("This test is the proof of the login exist")
    void Simplelogin() {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.enterUserName("standard_user"),
                LookForInformation.enterThePass("secret_sauce"),
                LookForInformation.clickLogin()
        );
    }*/
    @Test
    @DisplayName("Should be able to shop")
    void shop() throws InterruptedException {
        actor.attemptsTo(
                LookForInformation.item()
        );
        Thread.sleep(5000);
    }
/*
    @Test
    @DisplayName("Should be able to search for green things")
    void searchForGreenThings() {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.enterUserName("green"),
                Ensure.that(TheWebPage.title()).containsIgnoringCase("green")
        );
    }*/
}
