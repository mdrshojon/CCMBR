package homepage.draw_results_cards;

import org.testng.annotations.*;

public class TheNumbersGameTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void tNGDrawCardHeading() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I tap the TNG draw card heading
        actionwords.iTapTheTNGDrawCardHeading();
        // Then the TNG game details screen is displayed
        actionwords.theTNGGameDetailsScreenIsDisplayed();
    }

    @Test
    public void tNGDrawCardInformationIcon() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click the information icon on the TNG draw card
        actionwords.iClickTheInformationIconOnTheTNGDrawCard();
        // Then the TNG game details screen is displayed
        actionwords.theTNGGameDetailsScreenIsDisplayed();
    }

    @Test
    public void tNGCalendarLeftArrowDefault() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // Then the left calendar arrow is in an active state
        actionwords.theLeftCalendarArrowIsInAnActiveState();
    }

    @Test
    public void tNGRightArrowDefault() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And I haven't changed the date on the TNG calendar
        actionwords.iHaventChangedTheDateOnTheTNGCalendar();
        // Then the right calendar arrow on the TNG draw card is gray and inactive
        actionwords.theRightCalendarArrowOnTheTNGDrawCardIsGrayAndInactive();
    }

    @Test
    public void tNGRightArrowActive() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And I have changed the TNG calendar to a previous date
        actionwords.iHaveChangedTheTNGCalendarToAPreviousDate();
        // Then the right calendar arrow on the TNG draw card is in an active state
        actionwords.theRightCalendarArrowOnTheTNGDrawCardIsInAnActiveState();
    }

    @Test
    public void tNGDateDefault() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And I have not changed the TNG calendar date
        actionwords.iHaveNotChangedTheTNGCalendarDate();
        // Then the TNG calendar displays the date of the most recent draw
        actionwords.theTNGCalendarDisplaysTheDateOfTheMostRecentDraw();
    }

    @Test
    public void tNGPastDate() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And I select a previous draw date on the TNG draw card
        actionwords.iSelectAPreviousDrawDateOnTheTNGDrawCard();
        // Then the TNG calendar displays the selected date
        actionwords.theTNGCalendarDisplaysTheSelectedDate();
        // And the TNG results for that date are displayed
        actionwords.theTNGResultsForThatDateAreDisplayed();
    }

    @Test
    public void tNGCalendarIcon() {
    }

    @Test
    public void tNGCalendarSelectPastDate() {
    }

    @Test
    public void tNGCalendarSelectFutureDate() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I open the calendar on the TNG draw card
        actionwords.iOpenTheCalendarOnTheTNGDrawCard();
        // Then I am unable to select a future date
        actionwords.iAmUnableToSelectAFutureDate();
    }

    @Test
    public void tNGDrawCardMiddayDrawing() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is after 12:47pm
        actionwords.itIsAfter1247pm();
        // Then the TNG midday drawing results are displayed for the current date
        actionwords.theTNGMiddayDrawingResultsAreDisplayedForTheCurrentDate();
    }

    @Test
    public void tNGDrawCardMiddayDrawingPending() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is 12:47pm
        actionwords.itIs1247pm();
        // Then the TNG draw card midday displays a pending state
        actionwords.theTNGDrawCardMiddayDisplaysAPendingState();
        // And it auto updates to display the TNG midday results when they come in
        actionwords.itAutoUpdatesToDisplayTheTNGMiddayResultsWhenTheyComeIn();
        // And the evening section displays "drawing closes at 7:45 pm"
        actionwords.theEveningSectionDisplaysP1("drawing closes at 7:45 pm");
    }

    @Test
    public void tNGDrawCardMiddayDrawVideoLink() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click on the TNG draw video link
        actionwords.iClickOnTheTNGDrawVideoLink();
        // Then the TNG draw video for that date is displayed
        actionwords.theTNGDrawVideoForThatDateIsDisplayed();
    }

    @Test
    public void tNGDrawCardMiddayPrizePayout() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click the TNG Midday prize payout link
        actionwords.iClickTheTNGMiddayPrizePayoutLink();
        // Then the midday prize payout information for that date is displayed in an overlay
        actionwords.theMiddayPrizePayoutInformationForThatDateIsDisplayedInAnOverlay();
    }

    @Test
    public void tNGDrawCardMiddayVideoLinkPending() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is 12:47pm
        actionwords.itIs1247pm();
        // Then the midday draw video link is not displayed while the pending state is displayed
        actionwords.theMiddayDrawVideoLinkIsNotDisplayedWhileThePendingStateIsDisplayed();
        // And the draw video link auto populates once the video is available
        actionwords.theDrawVideoLinkAutoPopulatesOnceTheVideoIsAvailable();
    }

    @Test
    public void tNGDrawCardMiddayPrizePayoutPending() {
    }

    @Test
    public void tNGDrawCardEveningDrawing() {
    }

    @Test
    public void tNGDrawCardEveningDrawingPending() {
    }

    @Test
    public void tNGDrawCardEveningDrawingAfterMiddayBeforeEvening() {
    }
}