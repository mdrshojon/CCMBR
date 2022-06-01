package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class aboutStepDef {
    WebDriver driver;

    @Given("that I have the MA Website open")
    public void iHaveTheSiteOpen()  {
            String homeTitle = driver.getTitle();
            Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
        }
    @When("I tap on About icon")
    public void iTapOnAboutIcon() {
        driver.findElement(By.cssSelector(
                "#mslc-web > div > div.app-body > div:nth-child(1) > div > div > div.navigation-menu-items > div:nth-child(4)")).click();
    }
    @When("I tap on the About icon")
    public void iTapOnTheAboutIcon() {
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
    public void aDropdownIsDisplayed() {
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



}
