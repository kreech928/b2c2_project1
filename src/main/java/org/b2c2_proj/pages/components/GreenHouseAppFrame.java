package org.b2c2_proj.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class GreenHouseAppFrame {
    private final By iframeLocator = By.id("grnhse_iframe");
    private final By reactRoot = By.id("grnhse_app");
    private final By selectOfficeContainer = By.className("select-shell");
    private final By jobPostsLocator = By.className("job-posts");

    public By getIframeLocator() {
        return iframeLocator;
    }

    public By getReactRoot() {
        return reactRoot;
    }

    public By getSelectOfficeContainer() {
        return selectOfficeContainer;
    }

    public void switchToGreenHouseFrame(WebDriver driver) {
        WebElement iframe = driver.findElement(iframeLocator);

        driver.switchTo().frame(iframe);
    }

    public void sendInputToOfficeContainer(String input, WebDriver driver) {
        WebElement inputElement = driver.findElement(selectOfficeContainer);
        Actions actions = new Actions(driver);
        actions.
            moveToElement(inputElement).
            click().
            sendKeys(input).
            sendKeys(Keys.ENTER).
            sendKeys(Keys.ESCAPE).
            perform();
    }

    public int getSizeOfJobsPostsList(WebDriver driver) {
        WebElement jobPostsContainer = driver.findElement(jobPostsLocator);
        List<WebElement> list = jobPostsContainer.findElements(By.className("job-post"));
        return list.size();
    }

    public By getJobPostsLocator() {
        return jobPostsLocator;
    }
}
