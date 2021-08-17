package com.stepByStep.step_definitions;

import com.stepByStep.pages.LoginPage;
import com.stepByStep.utilities.ConfigurationReader;
import com.stepByStep.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepsDefs {
    public WebDriver driver;
    public LoginPage lp ;

    @Given("User opens URL {string}")
    public void user_opens_URL(String url) {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_as_and_Password_as(String email, String password) {
            //https://www.youtube.com/watch?v=d56lRIAwQEI 30:50


    }

    @When("Click on Login")
    public void click_on_Login() {

    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be_Dashboard_nopCommerce_administration(String url) {

    }

    @When("User click on Log out link")
    public void user_click_on_Log_out_link() {

    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String string) {

    }

    @Then("close browser")
    public void close_browser() {

    }
}
