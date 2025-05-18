package org.b2c2_proj.stepDefinitions;

import io.cucumber.java.en.*;
import org.b2c2_proj.pages.ContactPage;
import org.b2c2_proj.utils.WaitHelper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.b2c2_proj.pages.HomePage;
import org.b2c2_proj.utils.WebDriverFactory;


public class defaultSteps {
    WebDriver driver = WebDriverFactory.getDriver();

    HomePage homePage = new HomePage(driver);
    ContactPage contactPage = new ContactPage(driver);

    WaitHelper wait = new WaitHelper(driver, 1);

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        driver.get(homePage.getUrl());
        wait.forPageLoad();
    }


    @When("User goes to the 'contact' page, fill foam and submit")
    public void userGoesToTheContactPage() {
        homePage.getNavBar().clickContact();
        wait.forPageLoad();

        contactPage.fillContactForm();
        contactPage.clickSubmitButton();
    }

    @Then("\"Are you a robot\" pop up shows up")
    public void contactPageContainContactFormAndUserCanFillIt() {
        String result = wait.handleAlertIfPresent();

        Assert.assertEquals("Please confirm you're not a robot.", result);
    }


//    @When("User goes to the career page and filters the offers")
//    public void user_goes_to_the_career_page_and_filters_the_offers() {
//    }
//
//    @Then("User sees more then 5 job offerts in Zielona Gora")
//    public void user_sees_filtered_job_offers() {
//    }
}


