package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void click_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();

    }
    @And("User enters valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("Test321@gmail.com","Test12345$");

    }
    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();

    }
    @Then("User verifies Success message is displayed")
    public void verify_Success_message(){
        new LoginPage(driver).isMessageTextPresent("Logged in success");

    }
    @And("User enters valid email and wrong password")
    public void enter_valid_email_and_wrong_password(DataTable table){
        new LoginPage(driver).enterWrongData(table);

    }
    @Then("User verifies Error message is displayed")
    public void verify_Error_message_is_displayed(){
        new LoginPage(driver).isMessageTextPresent("Login or Password incorrect");

    }
}
