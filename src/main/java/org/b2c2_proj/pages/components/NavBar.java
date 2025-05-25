package org.b2c2_proj.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NavBar {
    WebDriver driver;

    @FindBy(className = "nav-menu_inner_wrap")
    WebElement navbarMenu;
    @FindBy(className = "brand")
    WebElement logo;

    public NavBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private List<WebElement> getNavbarItems() {
        return navbarMenu.findElements(By.className("w-dropdown"));
    }

    private WebElement getContact() {
        return navbarMenu.findElement(By.className("contact_block"));
    }

    private WebElement getSubscribeButton() {
        return navbarMenu.findElement(By.className("subscribe_btn"));
    }

    public void clickNavbar(String navbarText) {
        for (WebElement navbarItem : getNavbarItems()) {
            if (navbarItem.getText().equals(navbarText)) {
                navbarItem.click();
                break;
            }
        }
    }

    public void clickNavbar(int index) {
        getNavbarItems().get(index).click();
    }

    public void clickLogo() {
        logo.click();
    }

    public void clickContact() {
        getContact().click();
    }


    public void clickDropdownItemByIndex(int navboxItemIndex, int dropdownItemIndex) {
        Actions action = new Actions(driver);
        WebElement selectedDropdown = getNavbarItems().get(navboxItemIndex);
        List<WebElement> dropdownItems;

        action.moveToElement(selectedDropdown).perform();
        dropdownItems = selectedDropdown.findElements(By.className("inner-dropdown"));
        dropdownItems.get(dropdownItemIndex).click();
    }

    public void clickCareer() {
        clickDropdownItemByIndex(4, 1);
    }
}
