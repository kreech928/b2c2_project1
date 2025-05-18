package org.b2c2_proj.pages;

import org.b2c2_proj.pages.components.NavBar;
import org.openqa.selenium.WebDriver;

public class HomePage {
    final String url = "https://www.b2c2.com/";
    WebDriver driver;
    NavBar navBar;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.navBar = new NavBar(driver);
    }

    public String getUrl() {
        return url;
    }

    public NavBar getNavBar() {
        return navBar;
    }
}
