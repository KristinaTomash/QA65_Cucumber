package com.ilcarro.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
        @FindBy(xpath = "//input[@name='username']")
    WebElement emailField;

        @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    public LoginPage enterData(String email, String password) {
        type(emailField,email);
        type(passwordField,password);
        return this;

    }
        @FindBy(css = "button[type='submit']")
        WebElement yallaButton;
    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(css= "//p[.='Login or Password incorrect']")// after bug reports check
    WebElement UnsuccessMessage;

    public LoginPage isMessageTextPresent(String message) {
        assert UnsuccessMessage.getText().contains(message);
        return this;
    }

    public LoginPage enterWrongData(DataTable table) {
        List<Map<String,String>> dataTable = table.asMaps();

        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        enterData(email, password);
        return this;
    }
}
