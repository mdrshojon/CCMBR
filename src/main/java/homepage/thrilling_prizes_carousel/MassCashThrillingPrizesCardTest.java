package homepage.thrilling_prizes_carousel;

import header.mainNavigation.actionwords;
import org.testng.annotations.*;

public class MassCashThrillingPrizesCardTest {

    public header.mainNavigation.actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new actionwords();
    }

    @Test
    public void mCDrawingTodayText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And to day is a Mass Cash draw day
        actionwords.toDayIsAMassCashDrawDay();
        // Then "drawing today, 9:47pm" is displayed on the Mass Cash thrilling prizes card
        actionwords.p1IsDisplayedOnTheMassCashThrillingPrizesCard("drawing today, 9:47pm");
    }

    @Test
    public void mCDrawingClosedText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is the Mass Cash draw time
        actionwords.itIsTheMassCashDrawTime();
        // Then the Mass Cash thrilling prizes card displays "drawing tomorrow, 9:47pm"
        actionwords.theMassCashThrillingPrizesCardDisplaysP1("drawing tomorrow, 9:47pm");
    }

    @Test
    public void mCEstimatedTopPrize() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // Then the Mass Cash thrilling prizes card displays the estimated top prize information
        actionwords.theMassCashThrillingPrizesCardDisplaysTheEstimatedTopPrizeInformation();
    }
}