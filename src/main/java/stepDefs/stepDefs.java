package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class stepDefs {
    WebDriver driver;
    @Given("I am on the home screen")
    public void iAmOnTheHomeScreen() {
        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
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
    @Then ("a dropdown is displayed")
    public void theDropdownIsDisplayed() {
        Boolean toolsDropdownIsDisplayed = driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).isDisplayed();
        System.out.println(toolsDropdownIsDisplayed);
    }
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
/*
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

 */
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
    @Then ("a dropdown is displayed")
    public void dropdownIsDisplayed() {
        Boolean toolsDropdownIsDisplayed = driver.findElement(By.xpath("//div[@//div[@aria-label='Games menu']']")).isDisplayed();
        System.out.println(toolsDropdownIsDisplayed);
        //THIS HAS TO BE DISCUSSED
    }
    /*
     @And ("I select the Games icon")
     void iSelectTheGamesIcon();
         actionwords.iSelectTheGamesIcon();
     */
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

    @And(" I select $2 from the Ticket Cost dropdown")
    public void iSelect2FromTheTicketCostDropdown() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div/div[1]/div[2]/div[1]/div/div/div[1]")).click();
    }

    @And(" I select Top from the Prize Type dropdown")
    public void iSelectTopFromThePrizeTypeDropdown() {

    }

    @And(" I select $9999 or below from the Prize Amount dropdown")
    public void iSelect9999OrBelowFromThePrizeAmountDropdown() {

    }

    @Then(" the Prizes Remaining list is displayed with Game, Prize Amount, Start, Claimed, Remaining and Game Details information")
    public void thePrizesRemainingListIsDisplayedWithGamePrizeAmountStartClaimedRemainingAndGameDetailsInformation() {

    }

    @And(" I tap on Location Finder icon")
    public void iTapOnLocationFinderIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/location-finder']")).click();
    }

    @Then(" the Location Finder page loads")
    public void theLocationFinderPageLoads() {
        String locationFinderTitle = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals("Location Finder", locationFinderTitle);

    }

    @Then(" a know your location pop-up appears")
    public void aKnowYourLocationPopupAppears() {
    }

    @And(" I select Allow")
    public void iSelectAllow() {

    }

    @Then(" my location is displayed on the map")
    public void myLocationIsDisplayedOnTheMap() {

    }

    @And(" I enter my zipcode in the Search by city or ZIP Code")
    public void iEnterMyZipcodeInTheSearchByCityOrZIPCode() {

    }

    @Then(" I select the Claim a Prize icon")
    public void iSelectTheClaimAPrizeIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/claim-a-prize']")).click();

    }

    @And(" the Claim a Prize page loads")
    public void theClaimAPrizePageLoads() {
        String claimAPrize = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/h2")).getText();
        Assert.assertEquals("Claim a Prize", claimAPrize);
    }

    @When(" I tap on the Learn More button")
    public void iTapOnTheLearnMoreButton() {
        driver.findElement(By.xpath("//*[@id='ClaimAPrize-In-PersonClaims']/div[2]/div/p[3]/a")).click();
    }

    @Then(" 2020 Prize Claim page loads")
    public void PrizeClaimPageLoads() {
        String prizeClaimHelp = driver.getTitle();
        Assert.assertEquals(" What documentation do I need to claim a prize of $601 or more? : Mass Lottery Helpdesk ", prizeClaimHelp);
    }
}


