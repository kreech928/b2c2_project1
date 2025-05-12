package org.b2c2_proj.stepDefinitions;

import io.cucumber.java.en.*;
import org.b2c2_proj.utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.b2c2_proj.pages.HomePage;
import org.b2c2_proj.utils.WebDriverFactory;

import java.util.Objects;


public class HomePageStep {
    public static final String HOME_PAGE_URL = "https://www.b2c2.com/";

    WebDriver driver = WebDriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    WaitHelper wait = new WaitHelper(driver, 1);

    @Given("User is on the home page")
    public void user_opens_home_page() {
        driver.get(HOME_PAGE_URL);
        wait.forPageLoad();
        System.out.println(">>>HOMEPAGE OPENED.");
    }

    @When("User goes to the 'contact' page")
    public void user_clicks_contact_in_navbar() {
        homePage.getNavBar().clickContact();
        wait.forPageLoad();

    }

    @Then("Contact page contain contact form")
    public void check_content_of_contact_page() {
        assert Objects.equals(driver.getCurrentUrl(), HOME_PAGE_URL);
        WebDriverFactory.quit();
    }
}
