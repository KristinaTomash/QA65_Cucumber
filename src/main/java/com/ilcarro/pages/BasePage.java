package com.ilcarro.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static java.awt.SystemColor.text;

public class BasePage {
    public  static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    public void openURL(){
        driver.get("https://icarro-v1.netlify.app/search?page=0&size=10");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean isElementDisplayed(WebElement element) {

        try {
            element.isDisplayed();
            return true;

        } catch (NoSuchElementException ex) {
            ex.getMessage();
            return false;
        }
    }
        public void click (WebElement element){
            element.click();
        }
        public void type (WebElement element, String text){
            if (text != null) {
                click(element);
                element.clear();
                element.sendKeys(text);
            }
        }

    public void tearDown() {
        driver.quit();
    }
}
