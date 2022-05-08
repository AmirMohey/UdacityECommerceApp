package Pages;

import org.openqa.selenium.By;

public class P08ShoppingCart {

    public static By Item1Locator = By.cssSelector(".product-title a[href=\"/build-your-own-computer\"]");
    public static By HDDLocator = By.cssSelector("#product_attribute_input_3 > ul > li:nth-child(1) > input");
    public static By RAM = By.id("product_attribute_2");
    public static By AddItem1ToCart = By.id("add-to-cart-button-1");
    public static By SuccessMessage = By.className("content");
    public static By CloseSuccessMessageIcon = By.cssSelector("#bar-notification > div > span");
    public static By HomePage = By.cssSelector("div.header-logo > a");
    public static By Category2Locator = By.partialLinkText("Books");
    public static  By Item2Locator=  By.partialLinkText("First Prize Pies");
    public static By AddItem2ToCart = By.className("add-to-cart-button");
}
