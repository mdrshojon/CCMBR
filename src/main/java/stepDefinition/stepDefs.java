package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class stepDefs {
    public static WebDriver driver;

    @Given("that I have the MA Website open")
    public void that_i_have_the_ma_website_open() {
        System.setProperty("webdriver.chrome.driver","C:/Users/sssha/Desktop/Drivers/browser drivers/chromedriver.exe");
        //CHANGE TO UR PATH
        WebDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("https://www.masslottery.com/");
        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
        throw new io.cucumber.java.PendingException();
    }
    @Given("I am on the home screen")
    public void i_am_on_the_home_screen() {
        System.setProperty("webdriver.chrome.driver","C:/Users/sssha/Desktop/Drivers/browser drivers/chromedriver.exe");
        //CHANGE TO UR PATH
        WebDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("https://www.masslottery.com/");
        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
        throw new io.cucumber.java.PendingException();
    }
    @When("I click the All or Nothing draw card heading")
    public void iClickTheAllOrNothingDrawCardHeading() {

        driver.findElement(By.xpath("//a[@aria-label='More info for All or Nothing']")).click();
    }

    @Then("the All or Nothing game details screen is displayed")
    public void theAllOrNothingGameDetailsScreenIsDisplayed() {

        String aonDetails = driver.getTitle();
        Assert.assertEquals("All or Nothing | Games | Massachusetts Lottery", aonDetails);


    }

    @When("I click the information icon on the All or Nothing draw card")
    public void iClickTheInformationIconOnTheAllOrNothingDrawCard() {

        driver.findElement(By.xpath("//a[@aria-label='More info for All or Nothing']")).click();

    }

    @When("I view the All or Nothing draw card")
    public void iViewTheAllOrNothingDrawCard() {
        String aonDrawCard = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/a/div/div[1]")).getText();
        System.out.println(aonDrawCard);
    }

    @Then("the most recent All or Nothing draw number is displayed")
    public void theMostRecentAllOrNothingDrawNumberIsDisplayed() {
        String aonNumber = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[1]/span")).getText();
        System.out.println(aonNumber);
    }

    @And("the draw number updates automatically")
    public void theDrawNumberUpdatesAutomatically() {

    }

    @When("I click View Mode on the All or Nothing draw card")
    public void iClickViewModeOnTheAllOrNothingDrawCard() {

        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[2]/a[1]")).click();

    }

    @Then("the All or Nothing view mode screen is displayed")
    public void theAllOrNothingViewModeScreenIsDisplayed() {
        String aonViewModeTitle = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals("All or Nothing View Mode", aonViewModeTitle);


    }

    @When("I click Ticket Mode on the All or Nothing draw card")
    public void iClickTicketModeOnTheAllOrNothingDrawCard() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[2]/a[2]")).click();

    }

    @Then("the All or Nothing ticket form screen is displayed")
    public void theAllOrNothingTicketFormScreenIsDisplayed() {
        String aonTixModeTitle = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals("All or Nothing Ticket Form", aonTixModeTitle);

    }

    @When("I click Past Results on the All or Nothing draw card")
    public void iClickPastResultsOnTheAllOrNothingDrawCard() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[3]/a")).click();


    }

    @Then("the Past Results screen is displayed")
    public void thePastResultsScreenIsDisplayed() {
        String pastResults = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals("Past Results", pastResults);

    }

    @And("All or Nothing is pre-populated")
    public void allOrNothingIsPrePopulated() {

        String aonIsPreselected = driver.findElement(By.xpath("//*[@id='main-content']/div/div[1]/div[1]/select")).getText();
        Assert.assertEquals("All or Nothing", aonIsPreselected);
    }
    @When("I tap on About icon")
    public void iTapOnAboutIcon() {
        driver.findElement(By.cssSelector(
                "#mslc-web > div > div.app-body > div:nth-child(1) > div > div > div.navigation-menu-items > div:nth-child(4)")).click();
    }
    @And("I tap on Support Communities icon")
    public void iTapOnSupportCommunitiesIcon() {
        driver.findElement(By.xpath("//div[@aria-label='About menu'] /a[@href='/about/support-communities']")).click();
    }
    @Then("the Support Communities page loads with Fiscal Year and Ne Profit information")
    public void theSupportCommunitiesPageLoadsWithFiscalYearAndNeProfitInformation() {
        String SupportCommunities = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        System.out.println(SupportCommunities);
    }
    @And ("I tap on News icon")
    public void iTapOnNewsIcon() {
        driver.findElement(By.xpath("//div[@aria-label='About menu']/a[@href='/news']")).click();

    }
    @Then ("the News page loads")
    public void theNewsPageLoads() {
        String newsPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals ("News",newsPage);

    }
    @And ("I tap on the Winning Stories icon")
    public void iTapOnTheWinningStoriesIcon() {
        driver.findElement(By.xpath("//div[@aria-label='About menu']/a[@href='/winning-stories']")).click();
    }
    @Then ("the Winning Stories page loads")
    public void theWinningStoriesPageLoads() {
        String winningStoriesPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals  ("Winning Stories",winningStoriesPage);
    }
    /*
            @And ("I tap on The Lottery icon")
            actionwords.iTapOnTheLotteryIcon();
            @Then the The Lottery page loads
            actionwords.theTheLotteryPageLoads();
        }
        */

    @And ("I tap on Responsible Gaming")
    public void iTapOnResponsibleGaming() {
        driver.findElement(By.xpath("//div[@aria-label='About menu']/a[@href='/responsible-gaming']")).click();
    }
    @Then ("the Responsible Gaming page loads")
    public void theResponsibleGamingPageLoads() {
        String responsibleGamingPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals  ("Responsible Gaming",responsibleGamingPage);

    }


    @And ("I tap on For Agents icon")
    public void iTapOnForAgentsIcon() {

        driver.findElement(By.xpath("//div[@aria-label='About menu']/a[@href='/becoming-an-agent']")).click();

    }
    @Then ("the For Agents page loads")
    public void theForAgentsPageLoads() {
        String becomingAnAgentPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals  ("Becoming an Agent",becomingAnAgentPage);
    }

@When ("I select the Games icon")
public void iSelectTheGamesIcon () {
    driver.findElement(By.xpath("//*[@id='mslc-web']/div/div[1]/div[1]/div/div/div[2]/div[1]")).click();
}
    @And("I tap on Draws and Instants")
    public void iTapOnDrawsAndInstants() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/draw-and-instants']")).click();
    }
    @Then("the Draw and Instants page loads and all of the games display with name, price and prize info")
    public void theDrawAndInstantsPageLoadsAndAllOfTheGamesDisplayWithNamePriceAndPrizeInfo() {
        String drawsAndInstantPageLoads = driver.getTitle();
        Assert.assertEquals ("Games | Massachusetts Lottery",drawsAndInstantPageLoads);
    }
    @When ("I tap in the Search by game name box")
    public void iTapInTheSearchByGameNameBox() {
        WebElement searchByGameName = driver.findElement(By.xpath("//*[@id='games-lobby-search']"));
        searchByGameName.click();
    }
    @And("I enter in THE NUMBERS GAME")
    public void iEnterInTHENUMBERSGAME() {
        WebElement searchByGameName = driver.findElement(By.xpath("//*[@id='games-lobby-search']"));
        searchByGameName.click();
        searchByGameName.sendKeys("the numbers game");
    }
    @Then ("THE NUMBERS GAME thumbnail is displayed")
    public void tHENUMBERSGAMEThumbnailIsDisplayed() {
        if( driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div/div[1]/img")).isDisplayed()){
            System.out.println("Element is Visible");
        }else{
            System.out.println("Element is InVisible");
        }
    }


    @And ("I select the Pull Tabs icon")
    public void iSelectThePullTabsIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/pull-tabs']")).click();
    }
    @Then ("the Pull Tabs page loads")
    public void thePullTabsPageLoads() {
        String pullTabsPageLoads = driver.findElement(By.xpath("//*[@id='PullTabsContentSection']/div[1]")).getText();
        Assert.assertEquals ("Pull Tabs",pullTabsPageLoads);

    }
    @And ("I tap on Charitable Games icon")
    public void iTapOnCharitableGamesIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/charitable-games']")).click();
    }
    @Then ("the Charitable Games page loads")
    public void theCharitableGamesPageLoads() {
        String charitableGamesPage = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/h1")).getText();
        Assert.assertEquals ("Charitable Games",charitableGamesPage);
    }

    @And ("I tap on Season Tickets icon")
    public void iTapOnSeasonTicketsIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/season-tickets']"));
    }
    @Then ("the Seasons Tickets page loads")
    public void theSeasonsTicketsPageLoads() {
        String stixPage = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/h1")).getText();
        System.out.println(stixPage);
    }
    @When("I tap on Tools icon")
    public void iTapOnToolsIcon() {
        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();
    }

    @Then("a dropdown is displayed")
    public void aDropdownIsDisplayed() {
        Boolean toolsDropdownIsDisplayed = driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).isDisplayed();
        System.out.println(toolsDropdownIsDisplayed);
    }

    @When("I tap on Past Results")
    public void iTapOnPastResults() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/past-results']")).click();
    }

    @And("the Past Results page loads")
    public void thePastResultsPageLoads() {
        String pastResultsTitle = driver.getTitle();
        Assert.assertEquals("Past Results | Massachusetts State Lottery", pastResultsTitle);
    }

    @And("I select All or Nothing from the Game dropdown")
    public void iSelectAllOrNothingFromTheGameDropdown() {
        driver.findElement(By.cssSelector(".Drop-Down-Selector-selector")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".Drop-Down-Selector-selector"));
            dropdown.findElement(By.xpath("//option[. = 'All or Nothing']")).click();
        }

    }

    @Then("the Game & Results list is displayed")
    public void theGameResultsListIsDisplayed() {
        WebElement aonGameResultsList = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/table/tbody/tr[1]/td[1]"));
        Boolean gameResultAllOrNothing = aonGameResultsList.isDisplayed();
        System.out.println(gameResultAllOrNothing);

    }

    @And("I tap on Winners icon")
    public void iTapOnWinnersIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/winners']")).click();
    }

    @Then("the Winners page loads")
    public void theWinnersPageLoads() {
        String winnersTitle = driver.getTitle();
        Assert.assertEquals("Winners | Massachusetts State Lottery", winnersTitle);
    }

    @And("I select 100x from the Game dropdown")
    public void iSelect100xFromTheGameDropdown() {
        Select select100xFromDropDown = new Select(driver.findElement(By.xpath("//*[@id='main-content']/div/div[1]/div[1]/div[1]/div[1]/div/div/div/div[1]")));
        select100xFromDropDown.selectByVisibleText("100x");
    }

    @And("I select 30 days ago date and today's date")
    public void iSelect30DaysAgoDateAndTodaysDate() {
        WebElement calendar = driver.findElement(By.xpath("//div[@class='date-range-selector-input-container']"));
        calendar.click();
        driver.findElement(By.xpath(""));
        //Select select30DaysAgo = new Select (driver.findElement);

    }

    @Then("Winners list is displayed with Date and Prize information")
    public void winnersListIsDisplayedWithDateAndPrizeInformation() {
        if (driver.findElement(By.xpath("//*[@id='main-content']/div/table/tbody/tr[1]/td[1]/p")).isDisplayed()) {
            System.out.println("Element is Visible");
        } else {
            System.out.println("Element is InVisible");
        }

    }

    @And("I tap on Prizes Remaining icon")
    public void iTapOnPrizesRemainingIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/prizes-remaining']")).click();

    }

    @Then("the Prizes Remaining page loads")
    public void thePrizesRemainingPageLoads() {
        String prizesRemainingPage = driver.getTitle();
        Assert.assertEquals("Massachusetts Lottery", prizesRemainingPage);

    }

    @And("I select $2 from the Ticket Cost dropdown")
    public void iSelect2FromTheTicketCostDropdown() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div/div[1]/div[2]/div[1]/div/div/div[1]")).click();
    }

    @And("I select Top from the Prize Type dropdown")
    public void iSelectTopFromThePrizeTypeDropdown() {

    }

    @And("I select $9999 or below from the Prize Amount dropdown")
    public void iSelect9999OrBelowFromThePrizeAmountDropdown() {

    }

    @Then("the Prizes Remaining list is displayed with Game, Prize Amount, Start, Claimed, Remaining and Game Details information")
    public void thePrizesRemainingListIsDisplayedWithGamePrizeAmountStartClaimedRemainingAndGameDetailsInformation() {
        String prizesRemainingPage = driver.getTitle();
        Assert.assertEquals("Massachusetts Lottery", prizesRemainingPage);


    }

    @And("I tap on Location Finder icon")
    public void iTapOnLocationFinderIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/location-finder']")).click();
    }

    @Then("the Location Finder page loads")
    public void theLocationFinderPageLoads() {
        String locationFinderTitle = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals("Location Finder", locationFinderTitle);

    }

    @Then("a know your location pop-up appears")
    public void aKnowYourLocationPopupAppears() {
        
    }

    @And("I select Allow")
    public void iSelectAllow() {

    }

    @Then("my location is displayed on the map")
    public void myLocationIsDisplayedOnTheMap() {

    }

    @And("I enter my zipcode in the Search by city or ZIP Code")
    public void iEnterMyZipcodeInTheSearchByCityOrZIPCode() {

    }

    @Then("I select the Claim a Prize icon")
    public void iSelectTheClaimAPrizeIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/claim-a-prize']")).click();

    }

    @And("the Claim a Prize page loads")
    public void theClaimAPrizePageLoads() {
        String claimAPrize = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/h2")).getText();
        Assert.assertEquals("Claim a Prize", claimAPrize);
    }

    @When("I tap on the Learn More button")
    public void iTapOnTheLearnMoreButton() {
        driver.findElement(By.xpath("//*[@id='ClaimAPrize-In-PersonClaims']/div[2]/div/p[3]/a")).click();
    }

    @Then("2020 Prize Claim page loads")
    public void PrizeClaimPageLoads() {
        String prizeClaimHelp = driver.getTitle();
        Assert.assertEquals("What documentation do I need to claim a prize of $601 or more? : Mass Lottery Helpdesk ", prizeClaimHelp);
    }

    @And("to day is a Mass Cash draw day")
    public void toDayIsAMassCashDrawDay() {
        String massCashDraw =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[4]/div[1]/a/div/p")).getText();
        System.out.println(massCashDraw);
    }

    @When("I tap the Keno draw results card heading")
    public void iTapTheKenoDrawResultsCardHeading() {
        driver.findElement(By.xpath("//a[@aria-label='More info for Keno']")).click();
    }

    @Then("the Keno game details screen is displayed")
    public void theKenoGameDetailsScreenIsDisplayed() {
        String kenoDetails = driver.getTitle();
        Assert.assertEquals ("Keno | Games | Massachusetts Lottery",kenoDetails);

    }

    @And("Whe I click the information icon on the Keno draw results card")
    public void wheIClickTheInformationIconOnTheKenoDrawResultsCard() {
        driver.findElement(By.xpath("//a[@aria-label='More info for Keno']")).click();
    }

    @Then("the most recent Keno draw number is displayed")
    public void theMostRecentKenoDrawNumberIsDisplayed() {
        String kenoRecent = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[1]")).getText();
        System.out.println(kenoRecent);
    }

    @And("the Keno draw number updates automatically")
    public void theKenoDrawNumberUpdatesAutomatically() {
        String kenoDraw = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[1]/span")).getText();
        System.out.println(kenoDraw);
        
    }

    @Then("the Keno View Mode screen is displayed")
    public void theKenoViewModeScreenIsDisplayed() {
        String kenoViewModeTitle = driver.findElement (By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals ("Keno View Mode", kenoViewModeTitle);


    }

    @When("I tap View Mode on the Keno draw results card")
    public void iTapViewModeOnTheKenoDrawResultsCard() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[2]/a[1]")).click();

    }

    @When("I tap Ticket Mode on the Keno draw card")
    public void iTapTicketModeOnTheKenoDrawCard() {

        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[2]/a[2]")).click();

    }

    @Then("the Keno Ticket Form screen is displayed")
    public void theKenoTicketFormScreenIsDisplayed() {
        String kenoTixModeTitle = driver.findElement (By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals ("Keno Ticket Form", kenoTixModeTitle);

    }

    @When("I click Past Results on the Keno draw card")
    public void iClickPastResultsOnTheKenoDrawCard() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[3]/a")).click();
    }

    @And("Keno is pre-selected")
    public void kenoIsPreSelected() {
        String kenoIsPreselected = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[1]/div[1]/select")).getText();
        Assert.assertEquals ("Keno",kenoIsPreselected);
    }

    @And("tomorrow is a Megabucks Doubler draw day")
    public void tomorrowIsAMegabucksDoublerDrawDay() {

        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);


    }

    @And("It is a Megabucks Doubler draw day")
    public void itIsAMegabucksDoublerDrawDay() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

    @Then("the mega millions thrilling prizes carousel card displays {string}")
    public void theMegaMillionsThrillingPrizesCarouselCardDisplays(String arg0) {
        Boolean mbucksDoublerTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(mbucksDoublerTPC);

    }

    @And("it is not the Megabucks Doubler draw time")
    public void itIsNotTheMegabucksDoublerDrawTime() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

    @Then("the Megabucks Doubler estimated jackpot is displayed on the mega millions thrilling prizes card")
    public void theMegabucksDoublerEstimatedJackpotIsDisplayedOnTheMegaMillionsThrillingPrizesCard() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    @Given("i am on the home screen")
    public void iAmOnHomeScreen() {
        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);

    }

    @And("it is the Mega Millions draw time")
    public void itIsTheMegaMillionsDrawTime() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

    @Then("the mega millions thrilling prizes card displays the pending state")
    public void theMegaMillionsThrillingPrizesCardDisplaysThePendingState() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    @And("the mega million thrilling prizes card displays the new estimated jackpot when it comes in")
    public void theMegaMillionThrillingPrizesCardDisplaysTheNewEstimatedJackpotWhenItComesIn() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    @Then("the megabucks doubler thrilling prizes card displays the estimated cash option")
    public void theMegabucksDoublerThrillingPrizesCardDisplaysTheEstimatedCashOption() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    @And("it is the Megabucks Doubler draw time")
    public void itIsTheMegabucksDoublerDrawTime() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[4]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

    @Then("the Megabucks Doubler thrilling prizes card displays the pending state")

    public void theMegabucksDoublerThrillingPrizesCardDisplaysThePendingState() {
        String mbucksDoubler = driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println(mbucksDoubler);

    }

    @And("the Megabucks Doubler estimated cash option is displayed when the results come in")
    public void theMegabucksDoublerEstimatedCashOptionIsDisplayedWhenTheResultsComeIn() {

        String massCashJackpot =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[4]/div[1]/div[2]/p[2]")).getText();
        System.out.println(massCashJackpot);

    }
    @And("it is before {int}:{int}pm")
    public void itIsBeforePm(int arg0, int arg1) {
    }

    @And("it is not a Powerball draw day")
    public void itIsNotAPowerballDrawDay() {
        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);
    }

    @Then("the Powerball thrilling prizes card displays {string}")
    public void thePowerballThrillingPrizesCardDisplaysP1(String p1) {

        Boolean powerballTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(powerballTPC);

    }

    @And("tomorrow is a Powerball draw day")
    public void tomorrowIsAPowerballDrawDay() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);


    }
    @And("today is a Powerball draw day")
    public void todayIsAPowerballDrawDay() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);


    }

    @And("it is not the Powerball draw time")
    public void itIsNotThePowerballDrawTime() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);


    }

    @Then("the Powerball estimated cash option is displayed on the Powerball thrilling prizes card")
    public void thePowerballEstimatedCashOptionIsDisplayedOnThePowerballThrillingPrizesCard() {

        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    @And("it is the Powerball draw time")
    public void itIsThePowerballDrawTime() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);

    }

    @And("it is not a Powerball draw time")
    public void itIsNotAPowerballDrawTime() {
        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);
    }

    @Then("the Powerball estimated jackpot on the Powerball thrilling prizes card is replaced with the pending state")
    public void thePowerballEstimatedJackpotOnThePowerballThrillingPrizesCardIsReplacedWithThePendingState() {

        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    @And("it is between {int}:{int}pm and {int}:{int}pm")
    public void itIsBetweenPmAndPm(int arg0, int arg1, int arg2, int arg3) {
        
    }

    @Then("the TNG thrilling prizes card displays {string}")
    public void theTNGThrillingPrizesCardDisplaysP1(String p1) {

        String tngJackpot =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[6]/div[1]/div[2]/p[2]")).getText();
        System.out.println(tngJackpot);

    }

    @And("it is after {int}:{int}pm")
    public void itIsAfterPm(int arg0, int arg1) {
        
    }

    @When("I tap the TNG draw card heading")
    public void iTapTheTNGDrawCardHeading() {
        driver.findElement(By.xpath("//a[@aria-label='More info for The Numbers Game']")).click();
    }

    @Then("the TNG game details screen is displayed")
    public void theTNGGameDetailsScreenIsDisplayed() {

        String aonDetails = driver.getTitle();
        Assert.assertEquals ("The Numbers Game | Games | Massachusetts Lottery",aonDetails);

    }

    @When("I click the information icon on the TNG draw card")
    public void iClickTheInformationIconOnTheTNGDrawCard() {
        driver.findElement(By.xpath("//a[@aria-label='More info for The Numbers Game']")).click();
    }

    @Then("the left calendar arrow is in an active state")
    public void theLeftCalendarArrowIsInAnActiveState() {

        WebElement leftArrow = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[3]/div/div[1]/button[1]"));
        Boolean leftArrowActive = leftArrow.isDisplayed();
        System.out.println (leftArrowActive);

    }

    @And("I haven't changed the date on the TNG calendar")
    public void iHavenTChangedTheDateOnTheTNGCalendar() {
        
    }

    @Then("the right calendar arrow on the TNG draw card is gray and inactive")
    public void theRightCalendarArrowOnTheTNGDrawCardIsGrayAndInactive() {
    }

    @And("I have changed the TNG calendar to a previous date")
    public void iHaveChangedTheTNGCalendarToAPreviousDate() {
        
    }

    @Then("the right calendar arrow on the TNG draw card is in an active state")
    public void theRightCalendarArrowOnTheTNGDrawCardIsInAnActiveState() {
        
    }

    @And("I have not changed the TNG calendar date")
    public void iHaveNotChangedTheTNGCalendarDate() {
        
    }

    @Then("the TNG calendar displays the date of the most recent draw")
    public void theTNGCalendarDisplaysTheDateOfTheMostRecentDraw() {
        
    }

    @And("I select a previous draw date on the TNG draw card")
    public void iSelectAPreviousDrawDateOnTheTNGDrawCard() {
        
        
    }

    @Then("the TNG calendar displays the selected date")
    public void theTNGCalendarDisplaysTheSelectedDate() {
        
    }

    @And("the TNG results for that date are displayed")
    public void theTNGResultsForThatDateAreDisplayed() {
        
    }

    @Then("the TNG midday drawing results are displayed for the current date")
    public void theTNGMiddayDrawingResultsAreDisplayedForTheCurrentDate() {
        
    }

    @Then("I am unable to select a future date")
    public void iAmUnableToSelectAFutureDate() {
        
    }

    @When("I open the calendar on the TNG draw card")
    public void iOpenTheCalendarOnTheTNGDrawCard() {
        
    }

    @And("it is {int}:{int}pm")
    public void itIsPm(int arg0, int arg1) {
        
    }

    @Then("the TNG draw card midday displays a pending state")
    public void theTNGDrawCardMiddayDisplaysAPendingState() {
        
    }

    @And("it auto updates to display the TNG midday results when they come in")
    public void itAutoUpdatesToDisplayTheTNGMiddayResultsWhenTheyComeIn() {
    }

    @And("the evening section displays {string}")
    public void theEveningSectionDisplays(String arg0) {
        
    }

    @Then("the midday draw video link is not displayed while the pending state is displayed")
    public void theMiddayDrawVideoLinkIsNotDisplayedWhileThePendingStateIsDisplayed() {
        
    }

    @When("I click on the TNG draw video link")
    public void iClickOnTheTNGDrawVideoLink() {
        
    }

    @Then("the TNG draw video for that date is displayed")
    public void theTNGDrawVideoForThatDateIsDisplayed() {
        
    }

    @When("I click the TNG Midday prize payout link")
    public void iClickTheTNGMiddayPrizePayoutLink() {
        
    }

    @Then("the midday prize payout information for that date is displayed in an overlay")
    public void theMiddayPrizePayoutInformationForThatDateIsDisplayedInAnOverlay() {
        
    }

    @And("the draw video link auto populates once the video is available")
    public void theDrawVideoLinkAutoPopulatesOnceTheVideoIsAvailable() {
        
    }

    @And("the Powerball pending state is replaced with the new jackpot when the results come in")
    public void thePowerballPendingStateIsReplacedWithTheNewJackpotWhenTheResultsComeIn() {
        
    }

    @Then("the estimated cash option on the Powerball thrilling prizes card is replaced with the pending state")
    public void theEstimatedCashOptionOnThePowerballThrillingPrizesCardIsReplacedWithThePendingState() {

    }

    @And("the pending state on the Powerball thrilling prizes card is replaced with the new estimated cash option when the results come in")
    public void thePendingStateOnThePowerballThrillingPrizesCardIsReplacedWithTheNewEstimatedCashOptionWhenTheResultsComeIn() {

    }

    @When("I tap on the About icon")
    public void iTapOnTheAboutIcon() {
        driver.findElement(By.cssSelector(
                "#mslc-web > div > div.app-body > div:nth-child(1) > div > div > div.navigation-menu-items > div:nth-child(4)")).click();
    }



    @And("I am not on the homepage")
    public void iAmNotOnTheHomepage() {
        driver.findElement(By.xpath("//a[@aria-label='More info for Keno']")).click();
        String NotHome = driver.getTitle();
        System.out.println(NotHome);
    }

    @When("I tap the logo")
    public void iTapTheLogo() {
        driver.findElement(By.xpath("//*[@id='logo/white-fill/no-secondary']")).click();
    }

    @Then("I am navigated to the home page")
    public void iAmNavigatedToTheHomePage() {
        String home = driver.getTitle();
        System.out.println(home);
    }
    @When("I tap on Promotions icon")
    public void iTapOnPromotionsIcon() {
        driver.findElement(By.xpath("//*[@id='mslc-web']/div/div[1]/div[1]/div/div/div[2]/div[3]")).click();
    }
    @And("I tap on Current Promotions icon")
    public void iTapOnCurrentPromotionsIcon() {
        driver.findElement(By.xpath ("//div[@aria-label='Promotions menu'] /a[@href='/promotions']")).click();
    }
    @Then("the Current Promotions page loads")
    public void theCurrentPromotionsPageLoads() {
        String currentPromotionsPage = driver.getTitle();
        Assert.assertEquals  ("Promotions | Massachusetts Lottery",currentPromotionsPage);
    }

    @And ("I tap on VIP Members")
    public void iTapOnVIPMembers() {
        driver.findElement(By.xpath("//div[@aria-label='Promotions menu'] /a[@href='/promotions/vip']")).click();
    }
    @Then ("the VIP Members page loads")
    public void theVIPMembersPageLoads() {
        String vipMembersPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals ("VIP Members", vipMembersPage);

    }

    @And ("I tap on Second Chance icon")
    public void iTapOnSecondChanceIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Promotions menu'] /a[@href='/promotions/second-chance-vip']")).click();
    }
    @Then ("the Second Chance page loads")
    public void theSecondChancePageLoads() {
        String secondChancePage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals  ("Second Chance", secondChancePage);
    }
    @And("it is not a Mega Millions draw day")
    public void itIsNotAMegaMillionsDrawDay() {
        String drawDate = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println(drawDate);
    }
    @Then("the mega millions thrilling prizes carousel displays 'drawing on [next draw date]'")
    public void theMegaMillionsThrillingPrizesCarouselDisplaysP1() {
        Boolean megaMillionsTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(megaMillionsTPC);
    }
    @And ("it is a Mega Millions draw day")
    public void itIsAMegaMillionsDrawDay() {

        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);
    }
    @Then ("the mega millions thrilling prizes card displays 'drawing today, 11:00 pm'")
    public void theMegaMillionsThrillingPrizesCardDisplaysP2() {
        Boolean megaMillionsTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(megaMillionsTPC);
    }


    @And ("tomorrow is a Mega Millions draw day")
    public void tomorrowIsAMegaMillionsDrawDay() {
        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);
    }

    @Then ("the mega millions thrilling prizes carousel displays 'drawing tomorrow, 11:00 pm'")
    public void theMegaMillionsThrillingPrizesCardDisplaysP3() {
        Boolean megaMillionsTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(megaMillionsTPC);

    }


    @And ("it is not the mega millions draw time")
    public void itIsNotTheMegaMillionsDrawTime() {

        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);

    }
    @Then ("the mega millions estimated jackpot is displayed on the mega millions thrilling prizes card")
    public void theMegaMillionsEstimatedJackpotIsDisplayedOnTheMegaMillionsThrillingPrizesCard() {
        String megaMillionsJackpot = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println (megaMillionsJackpot);

    }



    @And ("it is mega millions draw time")
    public void itIsMegaMillionsDrawTime() {
        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);}

    @Then ("the estimated jackpot on the mega millions thrilling prizes card is in the pending state")
    public void theEstimatedJackpotOnTheMegaMillionsThrillingPrizesCardIsInThePendingState() {
        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);
    }
    @And ("the jackpot is displayed in place of the pending state once it comes in")
    public void theJackpotIsDisplayedInPlaceOfThePendingStateOnceItComesIn() {
        String megaMillionsJackpot = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println (megaMillionsJackpot);
    }



    @Then ("the estimated cash option is displayed on the mega millions thrilling prizes card")
    public void theEstimatedCashOptionIsDisplayedOnTheMegaMillionsThrillingPrizesCard() {
        String estCashOption = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println(estCashOption);

    }


    @Then ("the estimated cash option is replaced with the pending state on the mega millions thrilling prizes card")
    public void theEstimatedCashOptionIsReplacedWithThePendingStateOnTheMegaMillionsThrillingPrizesCard() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }
    @And ("the estimated cash option replaced the pending state once the results come in")  public void theEstimatedCashOptionReplacedThePendingStateOnceTheResultsComeIn()     {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    @Then("the mega millions thrilling prizes carousel displays {string}")
    public void theMegaMillionsThrillingPrizesCarouselDisplays(String arg0) {
        Boolean mbucksDoublerTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(mbucksDoublerTPC);
    }

    @Then("the mega millions thrilling prizes card displays {string}")
    public void theMegaMillionsThrillingPrizesCardDisplays(String arg0) {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    @And("it is a Lucky for Life draw day")
    public void itIsALuckyForLifeDrawDay() {

    }

    @Then("the Lucky for Life thrilling prizes card displays {string}")
    public void theLuckyForLifeThrillingPrizesCardDisplays(String arg0) {

    }

    @And("tomorrow is a Lucky for Life draw day")
    public void tomorrowIsALuckyForLifeDrawDay() {

    }

    @And("it is not a Lucky for Life draw day")
    public void itIsNotALuckyForLifeDrawDay() {

    }

    @Then("the Lucky for Life thrilling prizes card displays the estimated top prize information")
    public void theLuckyForLifeThrillingPrizesCardDisplaysTheEstimatedTopPrizeInformation() {

    }

    @Then("{string} is displayed on the Mass Cash thrilling prizes card")
    public void isDisplayedOnTheMassCashThrillingPrizesCard(String arg0) {

    }

    @And("it is the Mass Cash draw time")
    public void itIsTheMassCashDrawTime() {

    }

    @Then("the Mass Cash thrilling prizes card displays {string}")
    public void theMassCashThrillingPrizesCardDisplays(String arg0) {

    }

    @Then("the Mass Cash thrilling prizes card displays the estimated top prize information")
    public void theMassCashThrillingPrizesCardDisplaysTheEstimatedTopPrizeInformation() {

    }

    @And("it is not a Megabucks Doubler draw day")
    public void itIsNotAMegabucksDoublerDrawDay() {

    }

    @Then("the Megabucks Doubler thrilling prizes card displays {string}")
    public void theMegabucksDoublerThrillingPrizesCardDisplays(String arg0) {

    }

    @When("I select the Tools Icon")
    public void iSelectToolsIcon() {
        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();
    }
    @When("I tap on the Tools Icon")

    public void iTapTheToolsIcon() {
        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();
    }

    @Given("I have the MA website open")
    public void iHaveTheMAWebsiteOpen() {
        {
            String homeTitle = driver.getTitle();
            Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
            System.out.println(homeTitle);
        }
    }

    @When("I tap on Games Icon")
    public void i_tap_on_games_icon() {
        driver.findElement(By.xpath("//*[@id='mslc-web']/div/div[1]/div[1]/div/div/div[2]/div[1]")).click();
        throw new io.cucumber.java.PendingException();
    }
    @When("the Draws and Instants Page loads")
    public void the_draws_and_instants_page_loads() {

        String title = driver.getTitle();
        Assert.assertEquals("Games | Massachusetts Lottery", title);
        System.out.println(title);
        throw new io.cucumber.java.PendingException();
    }
    @When("I tap on Tools  icon")
    public void i_tap_on_tools_icon() {
        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();
        throw new io.cucumber.java.PendingException();
    }
    @Given("it is the mega millions draw time")
    public void it_is_the_mega_millions_draw_time() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
        throw new io.cucumber.java.PendingException();
    }


    @Then("the Lucky for Life thrilling prizes card displays the estimated top prize information game details screen is displayed")
    public void theLuckyForLifeThrillingPrizesCardDisplaysTheEstimatedTopPrizeInformationGameDetailsScreenIsDisplayed() {
        String title = driver.getTitle();
        Assert.assertEquals("Lucky For Life | Games | Massachusetts Lottery",title);
        System.out.println(title);
        throw new io.cucumber.java.PendingException();

    }

    @When("I tap the Lucky for Life draw results card heading")
    public void iTapTheLuckyForLifeDrawResultsCardHeading() {
        driver.findElement(By.xpath("//a[@aria-label='More info for Lucky for Life']")).click();
    }

    @And("I tap on My Recent Tickets")
    public void iTapOnMyRecentTickets() {
        driver.findElement(By.xpath("//*[@id='recent-tickets-nav-link']")).click();
    }

    @Then("My Recent Tickets Update Dialogue Box Pops Up")
    public void myRecentTicketsUpdateDialogueBoxPopsUp() {
        String mrtUpdate = driver.findElement(By.xpath("/html/body/reach-portal/div[3]/div/div/div/div/div/h3")).getText();
        Assert.assertEquals("My Recent Tickets Update",mrtUpdate);
    }

    @And("I Tap on the Draws and Instants")
    public void iTapOnTheDrawsAndInstants() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/draw-and-instants']")).click();
    }
}



