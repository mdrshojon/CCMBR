package header.mainNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class actionwords {
    WebDriver driver = new ChromeDriver();

    public void iHaveTheSiteOpen() {
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);

    }

    public void iTapTheLogo() {
        driver.findElement(By.xpath("//a[@aria-label='Navigate Home']"));

    }

    public void iAmNavigatedToTheHomePage() {
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);

    }

    public void iViewTheLogo() {

    }

    public void theLogoIsDisplayedInTheTopLeftCorner() {
        Boolean logoDisplayed = driver.findElement(By.xpath("//a[@aria-label='Navigate Home']")).isDisplayed();
        System.out.println(logoDisplayed);
    }

    public void iHaveTheMAWebsiteOpen() {
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
    }

    public void iTapOnIconTools() {
        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();

    }

    public void aDropdownIsDisplayed() {
        Boolean toolsDropdownIsDisplayed = driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).isDisplayed();
        System.out.println(toolsDropdownIsDisplayed);
        //THIS HAS TO BE DISCUSSED
        //ALSO TALK ABOUT PAST RESULTS PAGE TITLE CHANGING

    }

    public void iTapOnPastResults() {
        driver.findElement(By.xpath ("//div[@aria-label='Tools menu'] /a[@href='/tools/past-results']")).click();

    }

    public void thePastResultsPageLoads() {
        String pastResultsTitle = driver.getTitle();
        Assert.assertEquals("Past Results | Massachusetts State Lottery", pastResultsTitle);

    }

    public void iSelectAllOrNothingFromTheGameDropdown() {
        driver.findElement(By.cssSelector(".Drop-Down-Selector-selector")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".Drop-Down-Selector-selector"));
            dropdown.findElement(By.xpath("//option[. = 'All or Nothing']")).click();
        }

    }

    public void theGameResultsListIsDisplayed() {
        WebElement aonGameResultsList = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/table/tbody/tr[1]/td[1]"));
        Boolean gameResultAllOrNothing = aonGameResultsList.isDisplayed();
        System.out.println (gameResultAllOrNothing);

    }

    public void thatIHaveTheMAWebsiteOpen() {

        String homeTitle = driver.getTitle();

    }

    public void iTapOnTheToolsIcon() {
        driver.findElement(By.xpath ("//div[@aria-label='Tools menu'] /a[@href='/tools/past-results']")).click();

    }

    public void iDropdownIsDisplayed() {
        Boolean toolsDropdownIsDisplayed = driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).isDisplayed();
        System.out.println(toolsDropdownIsDisplayed);

    }

    public void iTapOnWinnersIcon() {
        driver.findElement(By.xpath ("//div[@aria-label='Tools menu'] /a[@href='/tools/winners']")).click();
    }

    public void theWinnersPageLoads() {
        String winnersTitle = driver.getTitle();
        Assert.assertEquals("Winners | Massachusetts State Lottery", winnersTitle);

    }

    public void iSelect100xFromTheGameDropdown() {
    Select select100xFromDropDown = new Select (driver.findElement(By.xpath("//*[@id='main-content']/div/div[1]/div[1]/div[1]/div[1]/div/div/div/div[1]")));
    select100xFromDropDown.selectByVisibleText("100x");
    }

    public void iSelect30DaysAgoDateAndTodaysDate() {
        WebElement calendar = driver.findElement(By.xpath("//div[@class='date-range-selector-input-container']"));
        calendar.click();
        driver.findElement(By.xpath(""));
        //Select select30DaysAgo = new Select (driver.findElement);

    }

    public void winnersListIsDisplayedWithDateAndPrizeInformation() {
        if( driver.findElement(By.xpath("//*[@id='main-content']/div/table/tbody/tr[1]/td[1]/p")).isDisplayed()){
            System.out.println("Element is Visible");
        }else{
            System.out.println("Element is InVisible");
        }

    }

    public void iTapOnPrizesRemainingIcon() {
        driver.findElement(By.xpath ("//div[@aria-label='Tools menu'] /a[@href='/tools/prizes-remaining']")).click();

    }

    public void thePrizesRemainingPageLoads() {
        String prizesRemainingPage = driver.getTitle();
        Assert.assertEquals("Massachusetts Lottery",prizesRemainingPage);

    }

    public void iSelect2FromTheTicketCostDropdown() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div/div[1]/div[2]/div[1]/div/div/div[1]")).click();
    }

    public void iSelectTopFromThePrizeTypeDropdown() {

    }

    public void iSelect9999OrBelowFromThePrizeAmountDropdown() {

    }

    public void thePrizesRemainingListIsDisplayedWithGamePrizeAmountStartClaimedRemainingAndGameDetailsInformation() {

    }

    public void iSelectTheToolsIcon() {

        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();

    }

    public void iTapOnLocationFinderIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/location-finder']")).click();
    }

    public void theLocationFinderPageLoads() {
        String locationFinderTitle = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals("Location Finder",locationFinderTitle);

    }

    public void aKnowYourLocationPopupAppears() {

    }

    public void iSelectAllow() {

    }

    public void myLocationIsDisplayedOnTheMap() {

    }

    public void iEnterMyZipcodeInTheSearchByCityOrZIPCode() {

    }

    public void iSelectTheClaimAPrizeIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Tools menu'] /a[@href='/tools/claim-a-prize']")).click();

    }

    public void theClaimAPrizePageLoads() {
        String claimAPrize = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/h2")).getText();
        Assert.assertEquals("Claim a Prize",claimAPrize);
    }

    public void iTapOnTheLearnMoreButton() {
    driver.findElement(By.xpath("//*[@id='ClaimAPrize-In-PersonClaims']/div[2]/div/p[3]/a")).click();
    }

    public void PrizeClaimPageLoads() {
        String prizeClaimHelp = driver.getTitle();
        Assert.assertEquals (" What documentation do I need to claim a prize of $601 or more? : Mass Lottery Helpdesk ", prizeClaimHelp);
    }

    public void iSelectTheGamesIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/draw-and-instants']")).click();

    }

    public void theDrawAndInstantsPageLoadsAndAllOfTheGamesDisplayWithNamePriceAndPrizeInfo() {
    String drawsAndInstantPageLoads = driver.getTitle();
    Assert.assertEquals ("Games | Massachusetts Lottery",drawsAndInstantPageLoads);
    }

    public void iTapInTheSearchByGameNameBox() {
        WebElement searchByGameName = driver.findElement(By.xpath("//*[@id='games-lobby-search']"));
        searchByGameName.click();
    }

    public void iEnterInTHENUMBERSGAME() {
        WebElement searchByGameName = driver.findElement(By.xpath("//*[@id='games-lobby-search']"));
        searchByGameName.click();
        searchByGameName.sendKeys("the numbers game");

    }

    public void tHENUMBERSGAMEThumbnailIsDisplayed() {
        if( driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div/div[1]/img")).isDisplayed()){
            System.out.println("Element is Visible");
        }else{
            System.out.println("Element is InVisible");
        }
    }

    public void thePullTabsPageLoads() {
        String pullTabsPageLoads = driver.findElement(By.xpath("//*[@id='PullTabsContentSection']/div[1]")).getText();
        Assert.assertEquals ("Pull Tabs",pullTabsPageLoads);

    }

    public void iTapOnCharitableGamesIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/charitable-games']")).click();

    }

    public void theCharitableGamesPageLoads() {
        String charitableGamesPage = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/h1")).getText();
        Assert.assertEquals ("Charitable Games",charitableGamesPage);
    }

    public void iTapOnSeasonTicketsIcon() {
        driver.findElement(By.xpath("//div[@aria-label='Games menu'] /a[@href='/games/season-tickets']"));

    }

    public void theSeasonsTicketsPageLoads() {
        String stixPage = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/h1")).getText();
        System.out.println(stixPage);


    }

    public void that() {

    }

    public void iTapOnPromotionsIcon() {
    driver.findElement(By.xpath("//*[@id='mslc-web']/div/div[1]/div[1]/div/div/div[2]/div[3]")).click();

    }

    public void iTapOnCurrentPromotionsIcon() {
        driver.findElement(By.xpath ("//div[@aria-label='Promotions menu'] /a[@href='/promotions']")).click();
    }

    public void theCurrentPromotionsPageLoads() {
        String currentPromotionsPage = driver.getTitle();
        Assert.assertEquals  ("Promotions | Massachusetts Lottery",currentPromotionsPage);
    }

    public void iTapOnVIPMembers() {
        driver.findElement(By.xpath("//div[@aria-label='Promotions menu'] /a[@href='/promotions/vip']")).click();
    }

    public void theVIPMembersPageLoads() {
        String vipMembersPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals ("VIP Members", vipMembersPage);

    }

    public void iTapOnSecondChanceIcon() {

        driver.findElement(By.xpath("//div[@aria-label='Promotions menu'] /a[@href='/promotions/second-chance-vip']")).click();
    }

    public void theSecondChancePageLoads() {
        String secondChancePage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals  ("Second Chance", secondChancePage);
    }

    public void iTapOnAboutIcon() {
        driver.findElement(By.cssSelector(
                "#mslc-web > div > div.app-body > div:nth-child(1) > div > div > div.navigation-menu-items > div:nth-child(4)")).click();

    }

    public void iTapOnSupportCommunitiesIcon() {
        driver.findElement(By.xpath("//div[@aria-label='About menu'] /a[@href='/about/support-communities']")).click();
    }

    public void theSupportCommunitiesPageLoadsWithFiscalYearAndNeProfitInformation() {
        String SupportCommunities = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        System.out.println(SupportCommunities);
    }

    public void iTapOnTheWinningStoriesIcon() {
        driver.findElement(By.xpath("//div[@aria-label='About menu']/a[@href='/winning-stories']")).click();
    }

    public void iTapOnNewsIcon() {

        driver.findElement(By.xpath("//div[@aria-label='About menu']/a[@href='/news']")).click();

    }

    public void theNewsPageLoads() {
        String newsPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals ("News",newsPage);

    }

    public void iTapOnTheAboutIcon() {

        driver.findElement(By.xpath("//*[@id='mslc-web']/div/div[1]/div[1]/div/div/div[2]/div[4]")).click();

    }

    public void theWinningStoriesPageLoads() {
        String winningStoriesPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals  ("Winning Stories",winningStoriesPage);

    }

    public void iTapOnTheLotteryIcon() {

    }

    public void theTheLotteryPageLoads() {

    }

    public void iTapOnResponsibleGaming() {
        driver.findElement(By.xpath("//div[@aria-label='About menu']/a[@href='/responsible-gaming']")).click();
    }





    public void theForAgentsPageLoads() {

        String becomingAnAgentPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals  ("Becoming an Agent",becomingAnAgentPage);
    }

    public void iTapOnMoreIcon() {

    }

    public void theAboutPageLoads() {

    }

    public void iTapOnMyRecentTicketsButton() {

    }

    public void myRecentTicketsPageLoads() {

    }

    public void aMessageYouHaveNoRecentTicketsPlayAToGoGameInTicketModeToGetStartedIsDisplayed() {

    }

    public void iTapMyRecentTicketsIcon() {

    }

    public void myRecentTicketsPageLoadsWithTicketInformation() {

    }

    public void iTapOnTheTHELOTTERYLogoAtTopPfPage() {
        driver.findElement(By.xpath("//a[@aria-label='Navigate Home']")).click();
    }

    public void theMAHomePageLoadsAndThrillingPrizesHeadingIsDisplayed() {

        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);

    }

    public void theMAHomePageLoadsAndThrillingPrizesLeftArrowIsDisabledByDefault() {

        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);

    }

    public void theMAHomePageLoadsAndThrillingPrizesRightArrowIsEnabledByDefault() {

        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);

    }

    public void iSlideTheThrillingPrizesSliderToTheRight() {

    }

    public void theRightArrowIsDisabledAndInactive() {

    }



    public void iTapTheMessageBanner() {
    }

    public void iAmNavigatedToTheAppropriateCorrespondingPage() {
        String correspondingPage = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        System.out.println(correspondingPage);
    }

    public void thereIsAMessageBanner() {

        Boolean messageBannerDisplayed = driver.findElement(By.xpath("//*[@id='main-content']/div/div[1]/div/div/div/ul/li[3]/a/div")).isDisplayed();
        System.out.println(messageBannerDisplayed);


    }

    public void iTapTheMessageBannerX() {

    }

    public void theMessageBannerIsNoLongerDisplayed() {

    }

    public void iViewTheCarousel() {
        Boolean messageBannerDisplayed = driver.findElement(By.xpath("//*[@id='main-content']/div/div[1]/div/div/div/ul/li[3]/a/div")).isDisplayed();
        System.out.println(messageBannerDisplayed);

    }

    public void theCarouselRotatesEvery5Seconds() {

    }

    public void theCarouselRotates() {

    }

    public void theCarouselNavigationCircleRotatesWithTheImage() {

    }

    public void iClickACarouselImage() {

    }

    public void iHaveScrolledTheThrillingPrizesCarouselToTheRight() {

        driver.findElement(By.xpath("//*[@id='thrilling-prizes-left-arrow']")).click();
        driver.findElement(By.xpath("//*[@id='thrilling-prizes-left-arrow']")).click();



    }

    public void iTapTheLeftArrow() {
        driver.findElement(By.xpath("//*[@id='thrilling-prizes-left-arrow']"));

    }

    public void theThrillingPrizesCarouselScrollsBackward() {
        Boolean thrillingPrizesCarouselScrollsBackward =
                driver.findElement(By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(thrillingPrizesCarouselScrollsBackward);

    }

    public void itIsNotAMegaMillionsDrawDay() {
        String drawDate = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println(drawDate);
    }

    public void theMegaMillionsThrillingPrizesCarouselDisplaysP1(String p1) {
        Boolean megaMillionsTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(megaMillionsTPC);

    }

    public void itIsAMegaMillionsDrawDay() {

        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);
    }

    public void theMegaMillionsThrillingPrizesCardDisplaysP1(String p1) {
        Boolean megaMillionsTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(megaMillionsTPC);

    }

    public void tomorrowIsAMegaMillionsDrawDay() {

        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);

    }

    public void itIsNotTheMegaMillionsDrawTime() {

        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);

    }

    public void theMegaMillionsEstimatedJackpotIsDisplayedOnTheMegaMillionsThrillingPrizesCard() {
        String megaMillionsJackpot = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println (megaMillionsJackpot);

    }
/*
    public void itIsTheMegaMillionsDrawTime() {
        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);
    }
*/
    public void theEstimatedJackpotOnTheMegaMillionsThrillingPrizesCardIsInThePendingState() {
        String megaDrawTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[1]/a/div/p")).getText();
        System.out.println (megaDrawTPC);
    }

    public void theJackpotIsDisplayedInPlaceOfThePendingStateOnceItComesIn() {
        String megaMillionsJackpot = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println (megaMillionsJackpot);

    }

    public void theEstimatedCashOptionIsDisplayedOnTheMegaMillionsThrillingPrizesCard() {
        String estCashOption = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println(estCashOption);

    }

    public void theEstimatedCashOptionIsReplacedWithThePendingStateOnTheMegaMillionsThrillingPrizesCard() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    public void theEstimatedCashOptionReplacedThePendingStateOnceTheResultsComeIn()     {

        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[1]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    public void itIsNotAPowerballDrawDay() {
        String powerballDrawTPC = driver.findElement (By.xpath
        ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);

    }

    public void thePowerballThrillingPrizesCardDisplaysP1(String p1) {

        Boolean powerballTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(powerballTPC);

    }

    public void tomorrowIsAPowerballDrawDay() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);


    }

    public void todayIsAPowerballDrawDay() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);


    }

    public void itIsNotThePowerballDrawTime() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);


    }

    public void thePowerballEstimatedCashOptionIsDisplayedOnThePowerballThrillingPrizesCard() {

        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    public void itIsThePowerballDrawTime() {

        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);

    }

    public void thePowerballEstimatedJackpotOnThePowerballThrillingPrizesCardIsReplacedWithThePendingState() {

        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    public void thePowerballPendingStateIsReplacedWithTheNewJackpotWhenTheResultsComeIn() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    public void itIsNotAPowerballDrawTime() {
        String powerballDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/p")).getText();
        System.out.println (powerballDrawTPC);
    }

    public void theEstimatedCashOptionOnThePowerballThrillingPrizesCardIsReplacedWithThePendingState() {

        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    public void thePendingStateOnThePowerballThrillingPrizesCardIsReplacedWithTheNewEstimatedCashOptionWhenTheResultsComeIn() {

        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    public void itIsNotAMegabucksDoublerDrawDay() {

        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);

    }

    public void theMegabucksDoublerThrillingPrizesCardDisplaysP1(String p1) {
        Boolean mbucksDoublerTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(mbucksDoublerTPC);

    }

    public void itIsAMegabucksDoublerDrawDay() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

    public void tomorrowIsAMegabucksDoublerDrawDay() {

        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);


    }

    public void theMegaMillionsThrillingPrizesCarouselCardDisplaysP1(String p1) {
        Boolean mbucksDoublerTPC = driver.findElement (By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[2]/div[1]/a/div/h4")).isDisplayed();
        System.out.println(mbucksDoublerTPC);
    }

    public void itIsNotTheMegabucksDoublerDrawTime() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

    public void theMegabucksDoublerEstimatedJackpotIsDisplayedOnTheMegaMillionsThrillingPrizesCard() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);

    }

    public void iAmOnTheHomeScreen() {

        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);

    }
/*
    public void itIsTheMegaMillionsDrawTime() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

 */

    public void theMegaMillionsThrillingPrizesCardDisplaysThePendingState() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    public void theMegaMillionThrillingPrizesCardDisplaysTheNewEstimatedJackpotWhenItComesIn() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    public void theMegabucksDoublerThrillingPriesCardDisplaysTheEstimatedCashOption() {
        String estCashOptionResults = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[2]/p[2]")).getText();
        System.out.println(estCashOptionResults);
    }

    public void itIsTheMegabucksDoublerDrawTime() {
        String megaBucksDrawTPC = driver.findElement (By.xpath
                ("//*[@id='main-content']/div/div[2]/div/div[2]/div[4]/div[1]/a/div/p")).getText();
        System.out.println (megaBucksDrawTPC);
    }

    public void theMegabucksDoublerThrillingPrizesCardDisplaysThePendingState() {
        String mbucksDoubler = driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[3]/div[1]/a/div/p")).getText();
        System.out.println(mbucksDoubler);

    }

    public void theMegabucksDoublerEstimatedCashOptionIsDisplayedWhenTheResultsComeIn() {

        String massCashJackpot =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[4]/div[1]/div[2]/p[2]")).getText();
        System.out.println(massCashJackpot);

    }

    public void toDayIsAMassCashDrawDay() {
        String massCashDraw =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[4]/div[1]/a/div/p")).getText();
        System.out.println(massCashDraw);
    }

    public void p1IsDisplayedOnTheMassCashThrillingPrizesCard(String p1) {
        String massCashDraw =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[4]/div[1]/a/div/p")).getText();
        System.out.println(massCashDraw);
    }

    public void itIsTheMassCashDrawTime() {
        String massCashDraw =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[4]/div[1]/a/div/p")).getText();
        System.out.println(massCashDraw);
    }

    public void theMassCashThrillingPrizesCardDisplaysP1(String p1) {
        String massCashJackpot =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[4]/div[1]/div[2]/p[2]")).getText();
        System.out.println(massCashJackpot);
    }

    public void theMassCashThrillingPrizesCardDisplaysTheEstimatedTopPrizeInformation() {
        String massCashJackpot =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[4]/div[1]/div[2]/p[2]")).getText();
        System.out.println(massCashJackpot);
    }

    public void itIsALuckyForLifeDrawDay() {
        String l4lDraw =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[5]/div[1]/a/div/p")).getText();
        System.out.println(l4lDraw);
    }

    public void theLuckyForLifeThrillingPrizesCardDisplaysP1(String p1) {

        String l4lJackpot = driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[5]/div[1]/div[2]/p[2]")).getText();
        System.out.println(l4lJackpot);
    }

    public void tomorrowIsALuckyForLifeDrawDay() {

        String l4lDraw =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[5]/div[1]/a/div/p")).getText();
        System.out.println(l4lDraw);
    }

    public void itIsNotALuckyForLifeDrawDay() {

        String l4lDraw =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[2]/div[5]/div[1]/a/div/p")).getText();
        System.out.println(l4lDraw);
    }

    public void theLuckyForLifeThrillingPrizesCardDisplaysTheEstimatedTopPrizeInformation() {
        String l4lJackpot = driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[5]/div[1]/div[2]/p[2]")).getText();
        System.out.println(l4lJackpot);
    }
    public void itIsBefore1245pm() {

    }

    public void theTNGThrillingPrizesCardDisplaysP1(String p1) {

        String tngJackpot =driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/div[6]/div[1]/div[2]/p[2]")).getText();
        System.out.println(tngJackpot);

    }

    public void itIsBetween1247pmAnd747pm() {

    }

    public void itIsAfter747pm() {

    }

    public void iTapTheKenoDrawResultsCardHeading() {
        driver.findElement(By.xpath("//a[@aria-label='More info for Keno']")).click();
    }

    public void theKenoGameDetailsScreenIsDisplayed() {
        String kenoDetails = driver.getTitle();
        Assert.assertEquals ("Keno | Games | Massachusetts Lottery",kenoDetails);

    }

    public void wheIClickTheInformationIconOnTheKenoDrawResultsCard() {
        driver.findElement(By.xpath("//a[@aria-label='More info for Keno']")).click();
    }

    public void theMostRecentKenoDrawNumberIsDisplayed() {
        String kenoRecent = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[1]")).getText();
        System.out.println(kenoRecent);
    }

    public void theKenoDrawNumberUpdatesAutomatically() {

    }

    public void iTapViewModeOnTheKenoDrawResultsCard() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[2]/a[1]")).click();

    }

    public void theKenoViewModeScreenIsDisplayed() {
        String kenoViewModeTitle = driver.findElement (By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals ("Keno View Mode", kenoViewModeTitle);


    }

    public void iTapTicketModeOnTheKenoDrawCard() {

        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[2]/a[2]")).click();

    }

    public void theKenoTicketFormScreenIsDisplayed() {
        String kenoTixModeTitle = driver.findElement (By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals ("Keno Ticket Form", kenoTixModeTitle);

    }

    public void iClickPastResultsOnTheKenoDrawCard() {
    driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[1]/div/div[3]/a")).click();

    }

    public void thePastResultsScreenIsDisplayed() {
        String pastResults = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        Assert.assertEquals ("Past Results",pastResults);

    }

    public void kenoIsPreselected() {
        String kenoIsPreselected = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[1]/div[1]/select")).getText();
        Assert.assertEquals ("Keno",kenoIsPreselected);
    }

    public void iClickTheAllOrNothingDrawCardHeading() {

        driver.findElement(By.xpath("//a[@aria-label='More info for All or Nothing']")).click();
    }

    public void theAllOrNothingGameDetailsScreenIsDisplayed() {

        String aonDetails = driver.getTitle();
        Assert.assertEquals ("All or Nothing | Games | Massachusetts Lottery",aonDetails);


    }

    public void iClickTheInformationIconOnTheAllOrNothingDrawCard() {

        driver.findElement(By.xpath("//a[@aria-label='More info for All or Nothing']")).click();

    }

    public void iViewTheAllOrNothingDrawCard() {
        String aonDrawCard = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/a/div/div[1]")).getText();

    }

    public void theMostRecentAllOrNothingDrawNumberIsDisplayed() {
        String aonNumber = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[1]/span")).getText();
    }

    public void theDrawNumberUpdatesAutomatically() {

    }

    public void iClickViewModeOnTheAllOrNothingDrawCard() {

        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[2]/a[1]")).click();

    }

    public void theAllOrNothingViewModeScreenIsDisplayed() {
        String aonViewModeTitle = driver.findElement (By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals ("All or Nothing View Mode", aonViewModeTitle);


    }

    public void iClickTicketModeOnTheAllOrNothingDrawCard() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[2]/a[2]")).click();

    }

    public void theAllOrNothingTicketFormScreenIsDisplayed() {
        String aonTixModeTitle = driver.findElement (By.xpath("//*[@id='main-content']/div[1]/div[1]/div")).getText();
        Assert.assertEquals ("All or Nothing Ticket Form", aonTixModeTitle);

    }

    public void iClickPastResultsOnTheAllOrNothingDrawCard() {
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[3]/a")).click();


    }

    public void allOrNothingIsPrepopulated() {

        String aonIsPreselected = driver.findElement (By.xpath ("//*[@id='main-content']/div/div[1]/div[1]/select")).getText();
        Assert.assertEquals ("All or Nothing",aonIsPreselected);
    }

    public void iTapTheTNGDrawCardHeading() {
        driver.findElement(By.xpath("//a[@aria-label='More info for The Numbers Game']")).click();
    }

    public void theTNGGameDetailsScreenIsDisplayed() {

        String aonDetails = driver.getTitle();
        Assert.assertEquals ("The Numbers Game | Games | Massachusetts Lottery",aonDetails);

    }

    public void iClickTheInformationIconOnTheTNGDrawCard() {
        driver.findElement(By.xpath("//a[@aria-label='More info for The Numbers Game']")).click();
    }

    public void theLeftCalendarArrowIsInAnActiveState() {

        WebElement leftArrow = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[3]/div/div[1]/button[1]"));
                Boolean leftArrowActive = leftArrow.isDisplayed();
        System.out.println (leftArrowActive);

    }

    public void iHaventChangedTheDateOnTheTNGCalendar() {

    }

    public void theRightCalendarArrowOnTheTNGDrawCardIsGrayAndInactive() {

    }

    public void iHaveChangedTheTNGCalendarToAPreviousDate() {

    }

    public void theRightCalendarArrowOnTheTNGDrawCardIsInAnActiveState() {

    }

    public void iHaveNotChangedTheTNGCalendarDate() {

    }

    public void theTNGCalendarDisplaysTheDateOfTheMostRecentDraw() {

    }

    public void iSelectAPreviousDrawDateOnTheTNGDrawCard() {

    }

    public void theTNGCalendarDisplaysTheSelectedDate() {

    }

    public void theTNGResultsForThatDateAreDisplayed() {

    }

    public void iOpenTheCalendarOnTheTNGDrawCard() {

    }

    public void iAmUnableToSelectAFutureDate() {

    }

    public void itIsAfter1247pm() {

    }

    public void theTNGMiddayDrawingResultsAreDisplayedForTheCurrentDate() {

    }

    public void itIs1247pm() {

    }

    public void theTNGDrawCardMiddayDisplaysAPendingState() {

    }

    public void itAutoUpdatesToDisplayTheTNGMiddayResultsWhenTheyComeIn() {

    }

    public void theEveningSectionDisplaysP1(String p1) {

    }

    public void iClickOnTheTNGDrawVideoLink() {

    }

    public void theTNGDrawVideoForThatDateIsDisplayed() {

    }

    public void iClickTheTNGMiddayPrizePayoutLink() {

    }

    public void theMiddayPrizePayoutInformationForThatDateIsDisplayedInAnOverlay() {

    }

    public void theMiddayDrawVideoLinkIsNotDisplayedWhileThePendingStateIsDisplayed() {

    }

    public void theDrawVideoLinkAutoPopulatesOnceTheVideoIsAvailable() {

    }

    public void iAmNotOnTheHomepage() {

    }

    public void iTapOnTheTHELOTTERYLogoAtTopOfPage() {

    }

    public void theResponsibleGamingPageLoads() {
        String respGaming = driver.findElement(By.xpath("//*[@id='main-content']/h2")).getText();
        System.out.println(respGaming);
    }

    public void iTapOnForAgentsIcon() {
        driver.findElement(By.xpath("//*[@id='mslc-web']/div/div[1]/div[1]/div/div/div[2]/div[4]/div[2]/a[4]")).click();
    }
}