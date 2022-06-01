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

public class toolsStepDef {
    WebDriver driver;

    @Given("that I have the MA Website open")
    public void iHaveTheSiteOpen() {
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
    }

    @When("I tap on Tools  icon")
    public void iTapOnToolsIcon() {
        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();
    }

    @When("I select the Tools Icon")
    public void iSelectToolsIcon() {
        driver.findElement(By.xpath("//div[@//div[@aria-label='Tools menu']']")).click();
    }
    @When("I tap on the Tools Icon")

    public void iTapTheToolsIcon() {
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

    @Given("I have the MA website open")
    public void iHaveTheMAWebsiteOpen() {
        {
            String homeTitle = driver.getTitle();
            Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
            System.out.println(homeTitle);
        }
    }



}
