package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class thrillingPrizesStepDef {
    WebDriver driver;
    @Given("I am on the home screen")
    public void iAmOnTheHomeScreen() {
        System.out.println("Making sure we are at the right site!");
        String homeTitle = driver.getTitle();
        Assert.assertEquals("Home | Massachusetts Lottery", homeTitle);
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



            @And ("it is the mega millions draw time")
            public void itIsTheMegaMillionsDrawTime() {
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

    @And("")
    public void itIsAMegabucksDoublerDrawDay() {
    }
}



