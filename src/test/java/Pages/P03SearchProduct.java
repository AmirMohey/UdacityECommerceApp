package Pages;

import StepDefinitions.TestBase;
import org.openqa.selenium.By;

public class P03SearchProduct {
    By searchField = By.className("search-box-text");
    By searchBtn = By.className("search-box-button");
    public static By searchResultKeyword = By.className("search-text");
    public static String searchText = "Build your own computer";
    public void setSearchKeyword ()
    {
        TestBase.driver.findElement(searchField).click();
        TestBase.driver.findElement(searchField).sendKeys(searchText);

    }

    public void clickSearchBTN ()
    {
        TestBase.driver.findElement(searchBtn).click();

    }

}
