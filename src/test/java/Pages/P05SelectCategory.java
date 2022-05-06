package Pages;

import StepDefinitions.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class P05SelectCategory {

   public static By CategoryLocator = By.cssSelector("ul.top-menu.notmobile > li:nth-child(1) > a");
   public static By SubCategoryLocator = By.cssSelector("ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(1) > a");

}
