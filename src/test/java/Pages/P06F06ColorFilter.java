package Pages;

import StepDefinitions.TestBase;
import org.openqa.selenium.By;

public class P06F06ColorFilter {
    public static By CategoryLocator = By.cssSelector("ul.top-menu.notmobile > li:nth-child(3) > a");
    public static By SubCategoryLocator = By.cssSelector("ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(1) > a");

    public static By color = By.id("attribute-option-15");

    public  void selectColor()
    {
        TestBase.driver.findElement(color).click();
    }
}
