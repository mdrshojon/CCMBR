package header.mainNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ToolsTest {
    WebDriver driver;

    public header.mainNavigation.actionwords actionwords;
    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String browser, String app) {
        System.out.println("Launching browsers.");
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Launching Chrome!");
            //This is where you would change paths
            System.setProperty("webdriver.chrome.driver", "C:/Users/sssha/Desktop/Drivers/browser drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Launching Firefox!");
            //This is where you would change paths
            System.setProperty("webdriver.gecko.driver", "C:/Users/sssha/Desktop/Drivers/browser drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(app);
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void setUp() {
        actionwords = new actionwords();
    }

    @Test
    public void pastResults() {
        // Given I have the MA website open
        actionwords.iHaveTheMAWebsiteOpen();
        // When I tap on icon Tools
        actionwords.iTapOnIconTools();
        // Then a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // When I tap on Past Results
        actionwords.iTapOnPastResults();
        // And the Past Results page loads
        actionwords.thePastResultsPageLoads();
        // And I select All or Nothing from the Game dropdown
        actionwords.iSelectAllOrNothingFromTheGameDropdown();
        // Then the Game & Results list is displayed
        actionwords.theGameResultsListIsDisplayed();
    }

    @Test
    public void winners() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on the Tools icon
        actionwords.iTapOnTheToolsIcon();
        // And a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // And I tap on Winners icon
        actionwords.iTapOnWinnersIcon();
        // Then the Winners page loads
        actionwords.theWinnersPageLoads();
        // And I select 100x from the Game dropdown
        actionwords.iSelect100xFromTheGameDropdown();
        // And I select 30 days ago date and today's date
        actionwords.iSelect30DaysAgoDateAndTodaysDate();
        // Then Winners list is displayed with Date and Prize information
        actionwords.winnersListIsDisplayedWithDateAndPrizeInformation();
    }

    @Test
    public void prizesRemaining() {
        // Given I have the MA website open
        actionwords.iHaveTheMAWebsiteOpen();
        // When I tap on icon Tools
        actionwords.iTapOnIconTools();
        // And a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // And I tap on Prizes Remaining icon
        actionwords.iTapOnPrizesRemainingIcon();
        // Then the Prizes Remaining page loads
        actionwords.thePrizesRemainingPageLoads();
        // And I select $2 from the Ticket Cost dropdown
        actionwords.iSelect2FromTheTicketCostDropdown();
        // And I select Top from the Prize Type dropdown
        actionwords.iSelectTopFromThePrizeTypeDropdown();
        // And I select $9999 or below from the Prize Amount dropdown
        actionwords.iSelect9999OrBelowFromThePrizeAmountDropdown();
        // Then the Prizes Remaining list is displayed with Game, Prize Amount, Start, Claimed, Remaining and Game Details information
        actionwords.thePrizesRemainingListIsDisplayedWithGamePrizeAmountStartClaimedRemainingAndGameDetailsInformation();
    }

    @Test
    public void locationFinder() {
        // Given I have the MA website open
        actionwords.iHaveTheMAWebsiteOpen();
        // When I select the Tools icon
        actionwords.iSelectTheToolsIcon();
        // And a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // And I tap on Location Finder icon
        actionwords.iTapOnLocationFinderIcon();
        // Then the Location Finder page loads
        actionwords.theLocationFinderPageLoads();
        // Then a know your location pop-up appears
        actionwords.aKnowYourLocationPopupAppears();
        // And I select Allow
        actionwords.iSelectAllow();
        // Then my location is displayed on the map
        actionwords.myLocationIsDisplayedOnTheMap();
        // And I enter my zipcode in the Search by city or ZIP Code
        actionwords.iEnterMyZipcodeInTheSearchByCityOrZIPCode();
    }

    @Test
    public void claimAPrize() {
        // Given I have the MA website open
        actionwords.iHaveTheMAWebsiteOpen();
        // When I tap on icon Tools
        actionwords.iTapOnIconTools();
        // And a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // Then I select the Claim a Prize icon
        actionwords.iSelectTheClaimAPrizeIcon();
        // And the Claim a Prize page loads
        actionwords.theClaimAPrizePageLoads();
        // When I tap on the Learn More button
        actionwords.iTapOnTheLearnMoreButton();
        // Then 2020 Prize Claim page loads
        actionwords.PrizeClaimPageLoads();
    }
}