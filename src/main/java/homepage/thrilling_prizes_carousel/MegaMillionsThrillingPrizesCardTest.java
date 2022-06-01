package homepage.thrilling_prizes_carousel;

import org.testng.annotations.*;

public class MegaMillionsThrillingPrizesCardTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void mMDrawingOnDateInTheFuture() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not a Mega Millions draw day
        actionwords.itIsNotAMegaMillionsDrawDay();
        // Then the mega millions thrilling prizes carousel displays "drawing on [next draw date]"
        actionwords.theMegaMillionsThrillingPrizesCarouselDisplaysP1("drawing on [next draw date]");
    }

    @Test
    public void mMDrawingToday() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is a Mega Millions draw day
        actionwords.itIsAMegaMillionsDrawDay();
        // Then the mega millions thrilling prizes card displays "drawing today, 11:00 pm"
        actionwords.theMegaMillionsThrillingPrizesCardDisplaysP1("drawing today, 11:00 pm");
    }

    @Test
    public void mMDrawTomorrowText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And tomorrow is a Mega Millions draw day
        actionwords.tomorrowIsAMegaMillionsDrawDay();
        // Then the mega millions thrilling prizes carousel displays "drawing tomorrow, 11:00 pm"
        actionwords.theMegaMillionsThrillingPrizesCarouselDisplaysP1("drawing tomorrow, 11:00 pm");
    }

    @Test
    public void mMEstimatedJackpot() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not the mega millions draw time
        actionwords.itIsNotTheMegaMillionsDrawTime();
        // Then the mega millions estimated jackpot is displayed on the mega millions thrilling prizes card
        actionwords.theMegaMillionsEstimatedJackpotIsDisplayedOnTheMegaMillionsThrillingPrizesCard();
    }

    @Test
    public void mMEstimatedJackpotPending() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is the mega millions draw time
        actionwords.itIsTheMegaMillionsDrawTime();
        // Then the estimated jackpot on the mega millions thrilling prizes card is in the pending state
        actionwords.theEstimatedJackpotOnTheMegaMillionsThrillingPrizesCardIsInThePendingState();
        // And the jackpot is displayed in place of the pending state once it comes in
        actionwords.theJackpotIsDisplayedInPlaceOfThePendingStateOnceItComesIn();
    }

    @Test
    public void mMEstCashOption() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not a Mega Millions draw day
        actionwords.itIsNotAMegaMillionsDrawDay();
        // Then the estimated cash option is displayed on the mega millions thrilling prizes card
        actionwords.theEstimatedCashOptionIsDisplayedOnTheMegaMillionsThrillingPrizesCard();
    }

    @Test
    public void mMEstCashOptionPending() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is the mega millions draw time
        actionwords.itIsTheMegaMillionsDrawTime();
        // Then the estimated cash option is replaced with the pending state on the mega millions thrilling prizes card
        actionwords.theEstimatedCashOptionIsReplacedWithThePendingStateOnTheMegaMillionsThrillingPrizesCard();
        // And the estimated cash option replaced the pending state once the results come in
        actionwords.theEstimatedCashOptionReplacedThePendingStateOnceTheResultsComeIn();
    }
}