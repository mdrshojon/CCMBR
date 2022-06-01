package homepage.thrilling_prizes_carousel;

import org.testng.annotations.*;

public class PowerballThrillingPrizesCardTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void pBDrawingOnDateInTheFuture() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not a Powerball draw day
        actionwords.itIsNotAPowerballDrawDay();
        // Then the Powerball thrilling prizes card displays "drawing on [day, time]"
        actionwords.thePowerballThrillingPrizesCardDisplaysP1("drawing on [day, time]");
    }

    @Test
    public void pBDrawingTomorrowText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And tomorrow is a Powerball draw day
        actionwords.tomorrowIsAPowerballDrawDay();
        // Then the Powerball thrilling prizes card displays "drawing tomorrow, 11:00pm"
        actionwords.thePowerballThrillingPrizesCardDisplaysP1("drawing tomorrow, 11:00pm");
    }

    @Test
    public void pBDrawingToday() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And today is a Powerball draw day
        actionwords.todayIsAPowerballDrawDay();
        // Then the Powerball thrilling prizes card displays "drawing today, 11:00pm"
        actionwords.thePowerballThrillingPrizesCardDisplaysP1("drawing today, 11:00pm");
    }

    @Test
    public void pBEstimatedJackpot() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not the Powerball draw time
        actionwords.itIsNotThePowerballDrawTime();
        // Then the Powerball estimated cash option is displayed on the Powerball thrilling prizes card
        actionwords.thePowerballEstimatedCashOptionIsDisplayedOnThePowerballThrillingPrizesCard();
    }

    @Test
    public void pBEstimatedJackpotPending() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is the Powerball draw time
        actionwords.itIsThePowerballDrawTime();
        // Then the Powerball estimated jackpot on the Powerball thrilling prizes card is replaced with the pending state
        actionwords.thePowerballEstimatedJackpotOnThePowerballThrillingPrizesCardIsReplacedWithThePendingState();
        // And the Powerball pending state is replaced with the new jackpot when the results come in
        actionwords.thePowerballPendingStateIsReplacedWithTheNewJackpotWhenTheResultsComeIn();
    }

    @Test
    public void pBEstCashOption() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not a Powerball draw time
        actionwords.itIsNotAPowerballDrawTime();
        // Then the Powerball estimated cash option is displayed on the Powerball thrilling prizes card
        actionwords.thePowerballEstimatedCashOptionIsDisplayedOnThePowerballThrillingPrizesCard();
    }

    @Test
    public void pBEstCashOptionPending() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is the Powerball draw time
        actionwords.itIsThePowerballDrawTime();
        // Then the estimated cash option on the Powerball thrilling prizes card is replaced with the pending state
        actionwords.theEstimatedCashOptionOnThePowerballThrillingPrizesCardIsReplacedWithThePendingState();
        // And the pending state on the Powerball thrilling prizes card is replaced with the new estimated cash option when the results come in
        actionwords.thePendingStateOnThePowerballThrillingPrizesCardIsReplacedWithTheNewEstimatedCashOptionWhenTheResultsComeIn();
    }
}