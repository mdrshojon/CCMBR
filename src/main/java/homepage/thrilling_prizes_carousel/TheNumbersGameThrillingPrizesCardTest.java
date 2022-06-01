package homepage.thrilling_prizes_carousel;

import org.testng.annotations.*;

public class TheNumbersGameThrillingPrizesCardTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void tNGDrawingTodayTextBeforeMidday() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is before 12:45pm
        actionwords.itIsBefore1245pm();
        // Then the TNG thrilling prizes card displays "drawing today, 12:47pm"
        actionwords.theTNGThrillingPrizesCardDisplaysP1("drawing today, 12:47pm");
    }

    @Test
    public void tNGDrawingTodayAfterMiddayBeforeEvening() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is between 12:47pm and 7:47pm
        actionwords.itIsBetween1247pmAnd747pm();
        // Then the TNG thrilling prizes card displays "drawing today, 12:47pm"
        actionwords.theTNGThrillingPrizesCardDisplaysP1("drawing today, 12:47pm");
    }

    @Test
    public void tNGDrawingTomorrow() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And it is after 7:47pm
        actionwords.itIsAfter747pm();
        // Then the TNG thrilling prizes card displays "drawing tomorrow, 12:45pm"
        actionwords.theTNGThrillingPrizesCardDisplaysP1("drawing tomorrow, 12:45pm");
    }

    @Test
    public void tNGDrawnTwiceDailyText() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // Then the TNG thrilling prizes card displays "drawn twice daily"
        actionwords.theTNGThrillingPrizesCardDisplaysP1("drawn twice daily");
    }
}