package homepage.draw_results_cards;

import org.testng.annotations.*;

public class KenoTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void kenoResultsCardHeading() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I tap the Keno draw results card heading
        actionwords.iTapTheKenoDrawResultsCardHeading();
        // Then the Keno game details screen is displayed
        actionwords.theKenoGameDetailsScreenIsDisplayed();
    }

    @Test
    public void kenoDrawCardInfoIcon() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And Whe I click the information icon on the Keno draw results card
        actionwords.wheIClickTheInformationIconOnTheKenoDrawResultsCard();
        // Then the Keno game details screen is displayed
        actionwords.theKenoGameDetailsScreenIsDisplayed();
    }

    @Test
    public void kenoDrawCardMostRecentDrawing() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // Then the most recent Keno draw number is displayed
        actionwords.theMostRecentKenoDrawNumberIsDisplayed();
        // And the Keno draw number updates automatically
        actionwords.theKenoDrawNumberUpdatesAutomatically();
    }

    @Test
    public void kenoDrawCardViewModeButton() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I tap View Mode on the Keno draw results card
        actionwords.iTapViewModeOnTheKenoDrawResultsCard();
        // Then the Keno View Mode screen is displayed
        actionwords.theKenoViewModeScreenIsDisplayed();
    }

    @Test
    public void kenoDrawCardTicketModeButton() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I tap Ticket Mode on the Keno draw card
        actionwords.iTapTicketModeOnTheKenoDrawCard();
        // Then the Keno Ticket Form screen is displayed
        actionwords.theKenoTicketFormScreenIsDisplayed();
    }

    @Test
    public void kenoDrawCardPastResultsButton() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click Past Results on the Keno draw card
        actionwords.iClickPastResultsOnTheKenoDrawCard();
        // Then the Past Results screen is displayed
        actionwords.thePastResultsScreenIsDisplayed();
        // And Keno is pre-selected
        actionwords.kenoIsPreselected();
    }
}