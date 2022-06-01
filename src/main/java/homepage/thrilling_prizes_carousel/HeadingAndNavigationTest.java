package homepage.thrilling_prizes_carousel;

import org.testng.annotations.*;

public class HeadingAndNavigationTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void thrillingPrizesHeading() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on the THELOTTERY logo at top pf page
        actionwords.iTapOnTheTHELOTTERYLogoAtTopPfPage();
        // Then the MA home page loads and Thrilling Prizes heading is displayed
        actionwords.theMAHomePageLoadsAndThrillingPrizesHeadingIsDisplayed();
    }

    @Test
    public void thrillingPrizesCarouselLeftArrowDefault() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on the THELOTTERY logo at top pf page
        actionwords.iTapOnTheTHELOTTERYLogoAtTopPfPage();
        // Then the MA home page loads and Thrilling prizes left arrow is disabled by default
        actionwords.theMAHomePageLoadsAndThrillingPrizesLeftArrowIsDisabledByDefault();
    }

    @Test
    public void thrillingPrizesRightArrow() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on the THELOTTERY logo at top of page
        actionwords.iTapOnTheTHELOTTERYLogoAtTopOfPage();
        // Then the MA home page loads and Thrilling prizes right arrow is enabled by default
        actionwords.theMAHomePageLoadsAndThrillingPrizesRightArrowIsEnabledByDefault();
    }

    @Test
    public void thrillingPrizesLeftArrowActive() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And I have scrolled the thrilling prizes carousel to the right
        actionwords.iHaveScrolledTheThrillingPrizesCarouselToTheRight();
        // When I tap the left arrow
        actionwords.iTapTheLeftArrow();
        // Then the thrilling prizes carousel scrolls backward
        actionwords.theThrillingPrizesCarouselScrollsBackward();
    }

    @Test
    public void thrillingPrizesRightArrowInactive() {
        // Given I have the MA website open
        actionwords.iHaveTheMAWebsiteOpen();
        // And I slide the Thrilling Prizes slider to the right
        actionwords.iSlideTheThrillingPrizesSliderToTheRight();
        // Then the right arrow is disabled and inactive
        actionwords.theRightArrowIsDisabledAndInactive();
    }
}