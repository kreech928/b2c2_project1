package org.b2c2_proj.pages;

import org.b2c2_proj.pages.components.GreenHouseAppFrame;
import org.b2c2_proj.pages.components.NavBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage {
    final String url = "https://www.b2c2.com/join-b2c2/careers";

    WebDriver driver;
    NavBar navBar;
    GreenHouseAppFrame dynamicCareerSection;

    @FindBy(tagName = "h1")
    WebElement title;

    public CareersPage(WebDriver driver) {
        this.navBar = new NavBar(driver);
        this.dynamicCareerSection = new GreenHouseAppFrame();

        PageFactory.initElements(driver, this);
    }

    public GreenHouseAppFrame getCareerSection() {
        return dynamicCareerSection;
    }
    public void sendLocationFilter(String location, WebDriver driver) {
        getCareerSection().sendInputToOfficeContainer(location, driver);
    }

    public int getCountOfJobPosts(WebDriver driver) {
        return getCareerSection().getSizeOfJobsPostsList(driver);
    }

    public String getUrl() {
        return url;
    }

    public NavBar getNavBar() {
        return navBar;
    }
}

