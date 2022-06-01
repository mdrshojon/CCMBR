package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class logoTestStepDef {
    WebDriver driver;
    @Given("that I have the MA Website open")
    public void iHaveTheSiteOpen() {
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
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
}

    /*
    public void logoPosition() {
        @Given I have the site open
        actionwords.iHaveTheSiteOpen();
        @When I view the logo
        actionwords.iViewTheLogo();
        @Then the logo is displayed in the top left corner
        actionwords.theLogoIsDisplayedInTheTopLeftCorner();
    }
}

     */
