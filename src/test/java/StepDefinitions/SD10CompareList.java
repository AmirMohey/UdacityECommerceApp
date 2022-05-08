package StepDefinitions;

import Pages.P08ShoppingCart;
import Pages.P09Wishlist;
import Pages.P10CompareList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class SD10CompareList {
    @Given("User Add Product Item 1 to Compare List")
    public void addItem1ToWishlist() throws InterruptedException {
        Thread.sleep(2000);
        TestBase.driver.findElement(P10CompareList.CompareListLocator).click();

        Thread.sleep(2000);


        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();

        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();
        String ActualResult =   TestBase.driver.findElement(P08ShoppingCart.SuccessMessage).getText();
        System.out.println("CompareList SuccessMessage 1 is : "+ActualResult);
        String ExpectedResult = "The product has been added to your product comparison";

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(ActualResult , ExpectedResult);
        softAssert.assertAll();
    }
    @Then("User Add Product Item 2 to Compare List")
    public void addItem2ToWishlist() throws InterruptedException {
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P10CompareList.CompareListLocator));
        TestBase.driver.findElement(P10CompareList.CompareListLocator).click();
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P08ShoppingCart.CloseSuccessMessageIcon));
        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P08ShoppingCart.SuccessMessage));
        String ActualResult =   TestBase.driver.findElement(P08ShoppingCart.SuccessMessage).getText();
        System.out.println("CompareList SuccessMessage 2 is : "+ActualResult);
        String ExpectedResult = "The product has been added to your product comparison";
        System.out.println("SuccessMessage is : "+ActualResult);
        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();
        TestBase.softAssert.assertEquals(ActualResult , ExpectedResult);
        TestBase.softAssert.assertAll();
    }

}
