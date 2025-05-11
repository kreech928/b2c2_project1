package org.b2c2_proj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;
    NavBar navBar;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.navBar = new NavBar(driver);
    }

    public NavBar getNavBar() {
        return navBar;
    }
}
