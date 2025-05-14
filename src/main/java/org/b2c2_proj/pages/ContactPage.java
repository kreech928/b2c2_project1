package org.b2c2_proj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ContactPage {
    final String url = "https://www.b2c2.com/contact-us";

    WebDriver driver;

    @FindBy(className = "logo")
    WebElement logo;
    @FindBy(tagName = "h1")
    WebElement title;
    @FindBy(id = "Name")
    WebElement nameInput;
    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "w-dropdown-toggle-6")
    WebElement descriptionOfOrganizationDropdown;
    @FindBy(id = "w-dropdown-list-6")
    WebElement listOfItemsForDescriptionOfOrganizationDropdown;
    @FindBy(id = "Company")
    WebElement companyNameInput;
    @FindBy(id = "Position-at-company-2")
    WebElement positionAtCompanyInput;
    @FindBy(id = "w-dropdown-toggle-7")
    WebElement currentMonthTradingVolumeDropdown;
    @FindBy(id = "w-dropdown-list-7")
    WebElement listOfItemsForCurrentMonthTradingVolumeDropdown;
    @FindBy(id = "Message")
    WebElement optionalMessageTextarea;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogo() {
        logo.click();
    }

    public void fillContactForm() {

        nameInput.sendKeys("John Doe");
        emailInput.sendKeys("lg@test.test");
        companyNameInput.sendKeys("B2C2");
        positionAtCompanyInput.sendKeys("QA Engineer");
        optionalMessageTextarea.sendKeys("Hello World!");
        descriptionOfOrganizationDropdown.click();
        listOfItemsForDescriptionOfOrganizationDropdown.findElements(By.tagName("a")).get(1).click();
        currentMonthTradingVolumeDropdown.click();
        listOfItemsForCurrentMonthTradingVolumeDropdown.findElements(By.tagName("a")).get(2).click();
    }

    public String getUrl() {
        return url;
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getDescriptionOfOrganizationDropdown() {
        return descriptionOfOrganizationDropdown;
    }

    public List<WebElement> getListOfItemsForDescriptionOfOrganizationDropdown() {
        descriptionOfOrganizationDropdown.click();
        return listOfItemsForDescriptionOfOrganizationDropdown.findElements(By.tagName("a"));
    }

    public WebElement getCompanyNameInput() {
        return companyNameInput;
    }

    public WebElement getPositionAtCompanyInput() {
        return positionAtCompanyInput;
    }

    public WebElement getCurrentMonthTradingVolumeDropdown() {
        return currentMonthTradingVolumeDropdown;
    }

    public List<WebElement> getListOfItemsForCurrentMonthTradingVolumeDropdown() {
        currentMonthTradingVolumeDropdown.click();
        return listOfItemsForCurrentMonthTradingVolumeDropdown.findElements(By.tagName("a"));
    }

    public WebElement getOptionalMessageTextarea() {
        return optionalMessageTextarea;
    }
}
