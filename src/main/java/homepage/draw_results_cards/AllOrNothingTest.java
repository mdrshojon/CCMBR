package homepage.draw_results_cards;

import org.testng.annotations.*;

public class AllOrNothingTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void aoNResultsCardHeading() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click the All or Nothing draw card heading
        actionwords.iClickTheAllOrNothingDrawCardHeading();
        // Then the All or Nothing game details screen is displayed
        actionwords.theAllOrNothingGameDetailsScreenIsDisplayed();
    }

    @Test
    public void aoNDrawCardInfoIcon() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click the information icon on the All or Nothing draw card
        actionwords.iClickTheInformationIconOnTheAllOrNothingDrawCard();
        // Then the All or Nothing game details screen is displayed
        actionwords.theAllOrNothingGameDetailsScreenIsDisplayed();
    }

    @Test
    public void aoNDrawCardMostRecentDrawing() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I view the All or Nothing draw card
        actionwords.iViewTheAllOrNothingDrawCard();
        // Then the most recent All or Nothing draw number is displayed
        actionwords.theMostRecentAllOrNothingDrawNumberIsDisplayed();
        // And the draw number updates automatically
        actionwords.theDrawNumberUpdatesAutomatically();
    }

    @Test
    public void aoNDrawCardViewModeButton() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click View Mode on the All or Nothing draw card
        actionwords.iClickViewModeOnTheAllOrNothingDrawCard();
        // Then the All or Nothing view mode screen is displayed
        actionwords.theAllOrNothingViewModeScreenIsDisplayed();
    }

    @Test
    public void aoNDrawCardTicketModeButton() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click Ticket Mode on the All or Nothing draw card
        actionwords.iClickTicketModeOnTheAllOrNothingDrawCard();
        // Then the All or Nothing ticket form screen is displayed
        actionwords.theAllOrNothingTicketFormScreenIsDisplayed();
    }

    @Test
    public void aoNDrawCardPastResultsButton() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click Past Results on the All or Nothing draw card
        actionwords.iClickPastResultsOnTheAllOrNothingDrawCard();
        // Then the Past Results screen is displayed
        actionwords.thePastResultsScreenIsDisplayed();
        // And All or Nothing is pre-populated
        actionwords.allOrNothingIsPrepopulated();
    }
}