package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class allOrNothingStepDef {
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

    }

    @Then("the most recent All or Nothing draw number is displayed")
    public void theMostRecentAllOrNothingDrawNumberIsDisplayed() {
        String aonNumber = driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/div/div[2]/div/div[1]/span")).getText();
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
    public void allOrNothingIsPrepopulated() {

        String aonIsPreselected = driver.findElement(By.xpath("//*[@id='main-content']/div/div[1]/div[1]/select")).getText();
        Assert.assertEquals("All or Nothing", aonIsPreselected);
    }
}


