package StepDefinitions;

import Pages.P08ShoppingCart;
import Pages.P09Wishlist;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class SD09Wishlist {
    @Given("User Add Product Item 1 to Wishlist")
    public void addItem1ToWishlist() throws InterruptedException {
        Thread.sleep(2000);
        TestBase.driver.findElement(P09Wishlist.WishListLocator).click();

        Thread.sleep(2000);

        String SuccessMessageText =   TestBase.driver.findElement(P08ShoppingCart.SuccessMessage).getText();
        System.out.println("Wishlist SuccessMessage  is : "+SuccessMessageText);
        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();

        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();
        String ActualResult =   TestBase.driver.findElement(P08ShoppingCart.SuccessMessage).getText();
        System.out.println("Wishlist SuccessMessage 1 is : "+ActualResult);
        String ExpectedResult = "The product has been added to your wishlist";

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(ActualResult , ExpectedResult);
        softAssert.assertAll();
    }
    @Then("User Add Product Item 2 to Wishlist")
    public void addItem2ToWishlist() throws InterruptedException {
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P09Wishlist.WishListLocator));
        TestBase.driver.findElement(P09Wishlist.WishListLocator).click();
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P08ShoppingCart.CloseSuccessMessageIcon));
        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P08ShoppingCart.SuccessMessage));
        String ActualResult =   TestBase.driver.findElement(P08ShoppingCart.SuccessMessage).getText();
        System.out.println("Wishlist SuccessMessage 2 is : "+ActualResult);
        String ExpectedResult = "The product has been added to your wishlist";
        System.out.println("SuccessMessage is : "+ActualResult);
        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();
        TestBase.softAssert.assertEquals(ActualResult , ExpectedResult);
        TestBase.softAssert.assertAll();
    }

}
