package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class gamesStepDef {
    WebDriver driver;
    @Given("that I have the MA Website open")
    public void iHaveTheSiteOpen()  {
    String homeTitle = driver.getTitle();
    Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
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
    @Then ("a dropdown is displayed")
    public void aDropdownIsDisplayed() {
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
    void iSelectThePullTabsIcon() {
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
}

