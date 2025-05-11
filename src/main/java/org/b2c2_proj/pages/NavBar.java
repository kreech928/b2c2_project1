package org.b2c2_proj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavBar {
    WebDriver driver;

    By navbar = By.className("nav-menu_inner_wrap");

    private List<WebElement> getNavbarItems(){
        return driver.findElements(navbar);
    }

    public void printListOfElements(){
        for(WebElement element : getNavbarItems()){
            System.out.println(element.getText());
        }
    }
}
