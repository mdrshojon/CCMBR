package header;

import header.mainNavigation.actionwords;
import org.testng.annotations.*;

public class LogoTest {

    public header.mainNavigation.actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new actionwords();
    }

    @Test
    public void logoNavigation() {
        // Given I have the site open
        actionwords.iHaveTheSiteOpen();
        // And I am not on the homepage
        actionwords.iAmNotOnTheHomepage();
        // When I tap the logo
        actionwords.iTapTheLogo();
        // Then I am navigated to the home page
        actionwords.iAmNavigatedToTheHomePage();
    }

    @Test
    public void logoPosition() {
        // Given I have the site open
        actionwords.iHaveTheSiteOpen();
        // When I view the logo
        actionwords.iViewTheLogo();
        // Then the logo is displayed in the top left corner
        actionwords.theLogoIsDisplayedInTheTopLeftCorner();
    }
}