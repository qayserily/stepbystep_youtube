package com.stepByStep.step_definitions;

import com.stepByStep.pages.GoogleSearchPage;
import com.stepByStep.utilities.BrowserUtils;
import com.stepByStep.utilities.ConfigurationReader;
import com.stepByStep.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class GoogleSearchSteps {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
       Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {

        googleSearchPage.googleSearch("cybertekschool");
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        BrowserUtils.waitForPageToLoad(10);
        googleSearchPage.cybertek.click();

    }


}
