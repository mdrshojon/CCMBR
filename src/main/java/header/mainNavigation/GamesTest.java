package header.mainNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GamesTest {
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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void setUp() {
        actionwords = new actionwords();
    }

    @Test
    public void drawAndInstants() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I select the Games icon
        actionwords.iSelectTheGamesIcon();
        // Then the Draw and Instants page loads and all of the games display with name, price and prize info
        actionwords.theDrawAndInstantsPageLoadsAndAllOfTheGamesDisplayWithNamePriceAndPrizeInfo();
        // When I tap in the Search by game name box
        actionwords.iTapInTheSearchByGameNameBox();
        // And I enter in THE NUMBERS GAME
        actionwords.iEnterInTHENUMBERSGAME();
        // Then THE NUMBERS GAME thumbnail is displayed
        actionwords.tHENUMBERSGAMEThumbnailIsDisplayed();
    }

    @Test
    public void pullTabs() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I select the Games icon
        actionwords.iSelectTheGamesIcon();
        // Then a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // And I select the Games icon
        actionwords.iSelectTheGamesIcon();
        // Then the Pull Tabs page loads
        actionwords.thePullTabsPageLoads();
    }

    @Test
    public void charitableGames() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I select the Games icon
        actionwords.iSelectTheGamesIcon();
        // And I tap on Charitable Games icon
        actionwords.iTapOnCharitableGamesIcon();
        // Then the Charitable Games page loads
        actionwords.theCharitableGamesPageLoads();
    }

    @Test
    public void seasonTickets() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I select the Games icon
        actionwords.iSelectTheGamesIcon();
        // And I tap on Season Tickets icon
        actionwords.iTapOnSeasonTicketsIcon();
        // Then the Seasons Tickets page loads
        actionwords.theSeasonsTicketsPageLoads();
    }
}