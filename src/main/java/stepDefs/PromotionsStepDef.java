package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PromotionsStepDef {
    WebDriver driver;
    @Given("that I have the MA Website open")
    public void iHaveTheSiteOpen()  {
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
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
    }

