package header.mainNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class PromotionsTest {
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
    public void currentPromotions() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on Promotions icon
        actionwords.iTapOnPromotionsIcon();
        // And I tap on Current Promotions icon
        actionwords.iTapOnCurrentPromotionsIcon();
        // Then the Current Promotions page loads
        actionwords.theCurrentPromotionsPageLoads();
    }

    @Test
    public void vIPMembers() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on Promotions icon
        actionwords.iTapOnPromotionsIcon();
        // And I tap on VIP Members
        actionwords.iTapOnVIPMembers();
        // Then the VIP Members page loads
        actionwords.theVIPMembersPageLoads();
    }

    @Test
    public void secondChance() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on Promotions icon
        actionwords.iTapOnPromotionsIcon();
        // And I tap on Second Chance icon
        actionwords.iTapOnSecondChanceIcon();
        // Then the Second Chance page loads
        actionwords.theSecondChancePageLoads();
    }
}