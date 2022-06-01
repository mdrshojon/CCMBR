package homepage;

import homepage.draw_results_cards.Actionwords;
import org.testng.annotations.*;

public class CarouselTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void carouselRotation() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I view the carousel
        actionwords.iViewTheCarousel();
        // Then the carousel rotates every 5 seconds
        actionwords.theCarouselRotatesEvery5Seconds();
    }

    @Test
    public void carouselNavigationCircles() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I view the carousel
        actionwords.iViewTheCarousel();
        // And the carousel rotates
        actionwords.theCarouselRotates();
        // Then the carousel navigation circle rotates with the image
        actionwords.theCarouselNavigationCircleRotatesWithTheImage();
    }

    @Test
    public void clickCarouselImage() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I click a carousel image
        actionwords.iClickACarouselImage();
        // Then I am navigated to the appropriate corresponding page
        actionwords.iAmNavigatedToTheAppropriateCorrespondingPage();
    }
}