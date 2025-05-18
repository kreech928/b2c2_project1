package org.b2c2_proj.pages;

import org.b2c2_proj.pages.components.NavBar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage {
    final String url = "https://www.b2c2.com/join-b2c2/careers";

    WebDriver driver;
    NavBar navBar;

    @FindBy(tagName = "h1")
    WebElement title;
    @FindBy(className = "select")
    WebElement selectOfficeContainer;
    @FindBy(className="job-posts--table")
    WebElement jobPostsTable;

    public CareersPage(WebDriver driver) {
        this.driver = driver;
        this.navBar = new NavBar(driver);
    }

    public void selectOffice(String localisation) {
        selectOfficeContainer.click();
        selectOfficeContainer.sendKeys(localisation);
        selectOfficeContainer.sendKeys(Keys.ENTER);
    }

    public WebElement getJobPost(int index) {
        return getJobPosts().get(index);
    }

    public List<WebElement> getJobPosts() {
         WebElement tableContent = jobPostsTable.findElement(By.tagName("tbody"));
         return tableContent.findElements(By.tagName("a"));
    }

    public String getUrl() {
        return url;
    }

    public NavBar getNavBar() {
        return navBar;
    }
}

