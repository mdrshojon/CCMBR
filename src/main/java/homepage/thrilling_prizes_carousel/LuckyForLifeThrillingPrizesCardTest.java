package homepage.thrilling_prizes_carousel;

import org.testng.annotations.*;

public class LuckyForLifeThrillingPrizesCardTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void l4LDrawingTodayText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is a Lucky for Life draw day
        actionwords.itIsALuckyForLifeDrawDay();
        // Then the Lucky for Life thrilling prizes card displays "drawing today, 10:00pm"
        actionwords.theLuckyForLifeThrillingPrizesCardDisplaysP1("drawing today, 10:00pm");
    }

    @Test
    public void l4LDrawingTomorrowText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And tomorrow is a Lucky for Life draw day
        actionwords.tomorrowIsALuckyForLifeDrawDay();
        // Then the Lucky for Life thrilling prizes card displays "drawing tomorrow, 10:00pm"
        actionwords.theLuckyForLifeThrillingPrizesCardDisplaysP1("drawing tomorrow, 10:00pm");
    }

    @Test
    public void l4LDrawingInTheFutureText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is not a Lucky for Life draw day
        actionwords.itIsNotALuckyForLifeDrawDay();
        // Then the Lucky for Life thrilling prizes card displays "drawing on [next draw day], 10:00pm"
        actionwords.theLuckyForLifeThrillingPrizesCardDisplaysP1("drawing on [next draw day], 10:00pm");
    }

    @Test
    public void l4LEstTopPrize() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // Then the Lucky for Life thrilling prizes card displays the estimated top prize information
        actionwords.theLuckyForLifeThrillingPrizesCardDisplaysTheEstimatedTopPrizeInformation();
    }
}