package org.b2c2_proj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    public void printListOfElements() {
        for (WebElement element : getNavbarItems()) {
            System.out.println(element.getText());
        }
    }

    public void printListOfElementsOfElement() {
        List<WebElement> tmpList;
        for (WebElement navbarElement : getNavbarItems()) {
            System.out.println(navbarElement.getText());
            tmpList = navbarElement.findElements(By.className("dropdown-toggle"));

            for (WebElement dropdownElement : tmpList) {
                System.out.println(dropdownElement.getText());
            }

        }
    }
}
