package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CommonSteps extends SeleniumUtility{
    @Given("Open browser and navigate")
    public void openBrowserAndNavigate(){
        openBrowser();
    }

    @Then("Validate application title should be {string}")
    public void ValidatePageTitle(String expectedAppTitle){
//
       String actualPageTitle= getDriver().getTitle();
       Assert.assertEquals("Application Title Validation", expectedAppTitle, actualPageTitle );
    }

    @Then("Close browser")
    public void closeBrowser(){
        driverQuit();

    }
}
