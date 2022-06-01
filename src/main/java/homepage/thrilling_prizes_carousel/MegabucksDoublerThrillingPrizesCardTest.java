package homepage.thrilling_prizes_carousel;

import org.testng.annotations.*;

public class MegabucksDoublerThrillingPrizesCardTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void mBDDrawingOnDateInTheFuture() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not a Megabucks Doubler draw day
        actionwords.itIsNotAMegabucksDoublerDrawDay();
        // Then the Megabucks Doubler thrilling prizes card displays "drawing on [next draw date, time]"
        actionwords.theMegabucksDoublerThrillingPrizesCardDisplaysP1("drawing on [next draw date, time]");
    }

    @Test
    public void mBDDrawingToday() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And It is a Megabucks Doubler draw day
        actionwords.itIsAMegabucksDoublerDrawDay();
        // Then the Megabucks Doubler thrilling prizes card displays "drawing today, 11:00pm"
        actionwords.theMegabucksDoublerThrillingPrizesCardDisplaysP1("drawing today, 11:00pm");
    }

    @Test
    public void mBDDrawingTomorrowText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And tomorrow is a Megabucks Doubler draw day
        actionwords.tomorrowIsAMegabucksDoublerDrawDay();
        // Then the mega millions thrilling prizes carousel card displays "drawing today, 11:30pm"
        actionwords.theMegaMillionsThrillingPrizesCarouselCardDisplaysP1("drawing today, 11:30pm");
    }

    @Test
    public void mBDEstimatedJackpot() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not the Megabucks Doubler draw time
        actionwords.itIsNotTheMegabucksDoublerDrawTime();
        // Then the Megabucks Doubler estimated jackpot is displayed on the mega millions thrilling prizes card
        actionwords.theMegabucksDoublerEstimatedJackpotIsDisplayedOnTheMegaMillionsThrillingPrizesCard();
    }

    @Test
    public void mBDEstimatedJackpotPending() {
        // Given i am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is the Mega Millions draw time
        actionwords.itIsTheMegaMillionsDrawTime();
        // Then the mega millions thrilling prizes card displays the pending state
        actionwords.theMegaMillionsThrillingPrizesCardDisplaysThePendingState();
        // And the mega million thrilling prizes card displays the new estimated jackpot when it comes in
        actionwords.theMegaMillionThrillingPrizesCardDisplaysTheNewEstimatedJackpotWhenItComesIn();
    }

    @Test
    public void mBDEstCashOption() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not the Megabucks Doubler draw time
        actionwords.itIsNotTheMegabucksDoublerDrawTime();
        // Then the megabucks doubler thrilling prizes card displays the estimated cash option
        actionwords.theMegabucksDoublerThrillingPriesCardDisplaysTheEstimatedCashOption();
    }

    @Test
    public void mBDEstCashOptionPending() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is the Megabucks Doubler draw time
        actionwords.itIsTheMegabucksDoublerDrawTime();
        // Then the Megabucks Doubler thrilling prizes card displays the pending state
        actionwords.theMegabucksDoublerThrillingPrizesCardDisplaysThePendingState();
        // And the Megabucks Doubler estimated cash option is displayed when the results come in
        actionwords.theMegabucksDoublerEstimatedCashOptionIsDisplayedWhenTheResultsComeIn();
    }
}