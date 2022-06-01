package header.mainNavigation;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class AboutTest {
    WebDriver driver;

    public header.mainNavigation.actionwords actionwords;

    @BeforeTest
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
    public void supportCommunities() {
       //Given ("that I have the MA Website open")
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on About icon
        actionwords.iTapOnAboutIcon();
        // And I tap on Support Communities icon
        actionwords.iTapOnSupportCommunitiesIcon();
        // Then the Support Communities page loads with Fiscal Year and Ne Profit information
        actionwords.theSupportCommunitiesPageLoadsWithFiscalYearAndNeProfitInformation();
    }

    @Test
    public void news() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on About icon
        actionwords.iTapOnAboutIcon();
        // And I tap on News icon
        actionwords.iTapOnNewsIcon();
        // Then the News page loads
        actionwords.theNewsPageLoads();
    }

    @Test
    public void winningStories() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on the About icon
        actionwords.iTapOnTheAboutIcon();
        // And I tap on the Winning Stories icon
        actionwords.iTapOnTheWinningStoriesIcon();
        // Then the Winning Stories page loads
        actionwords.theWinningStoriesPageLoads();
    }

    @Test
    public void theLottery() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on the About icon
        actionwords.iTapOnTheAboutIcon();
        // And I tap on The Lottery icon
        actionwords.iTapOnTheLotteryIcon();
        // Then the The Lottery page loads
        actionwords.theTheLotteryPageLoads();
    }

    @Test
    public void responsibleGaming() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on About icon
        actionwords.iTapOnAboutIcon();
        // Then a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // And I tap on Responsible Gaming
        actionwords.iTapOnResponsibleGaming();
        // Then the Responsible Gaming page loads
        actionwords.theResponsibleGamingPageLoads();
    }

    @Test
    public void forAgents() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on About icon
        actionwords.iTapOnAboutIcon();
        // Then a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // And I tap on For Agents icon
        actionwords.iTapOnForAgentsIcon();
        // Then the For Agents page loads
        actionwords.theForAgentsPageLoads();
    }

    @Test
    public void more() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on About icon
        actionwords.iTapOnAboutIcon();
        // Then a dropdown is displayed
        actionwords.aDropdownIsDisplayed();
        // And I tap on More... icon
        actionwords.iTapOnMoreIcon();
        // Then the About page loads
        actionwords.theAboutPageLoads();
    }
    @AfterTest
    public void end() {
        driver.close();
    }
}