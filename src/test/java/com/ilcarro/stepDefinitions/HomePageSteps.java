package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome browser")
    public void launches_Chrome_browser(){
        new HomePage(driver).launchBrowser();

    }
    @When("User opens iLCarro HomePage")
    public void open_iLCarro_HomePage(){
        new HomePage(driver).openURL();

    }
    @Then("User verifies HomePage title")
    public void verify_HomePage_title(){
        new HomePage(driver).isHomePageTitleDisplayed();

    }
    @And("User quites browser")
    public void quite_browser(){
        new HomePage(driver).tearDown();

    }

}
