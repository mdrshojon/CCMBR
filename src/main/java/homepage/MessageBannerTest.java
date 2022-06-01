package homepage;

import homepage.draw_results_cards.Actionwords;
import org.testng.annotations.*;

public class MessageBannerTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void messageBannerLinks() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // When I tap the message banner
        actionwords.iTapTheMessageBanner();
        // Then I am navigated to the appropriate corresponding page
        actionwords.iAmNavigatedToTheAppropriateCorrespondingPage();
    }

    @Test
    public void messageBannerCloseIcon() {
        // Given I am on the home screen
        actionwords.iAmOnTheHomeScreen();
        // And there is a message banner
        actionwords.thereIsAMessageBanner();
        // When I tap the message banner X
        actionwords.iTapTheMessageBannerX();
        // Then the message banner is no longer displayed
        actionwords.theMessageBannerIsNoLongerDisplayed();
    }
}