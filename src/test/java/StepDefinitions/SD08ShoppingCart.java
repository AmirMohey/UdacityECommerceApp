package StepDefinitions;

import Pages.P08ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SD08ShoppingCart {


    @Given("User Select Product Item 1")
    public void selectProductItem1() throws InterruptedException {

        TestBase.driver.findElement(P08ShoppingCart.Item1Locator).click();

        Select select = new Select(TestBase.driver.findElement(P08ShoppingCart.RAM));
        select.selectByIndex(1);
        TestBase.driver.findElement(P08ShoppingCart.HDDLocator).click();




    }

    @When("User Add Product Item 1 to Shopping cart")
    public void addItem1ToCart() throws InterruptedException {
        TestBase.driver.findElement(P08ShoppingCart.AddItem1ToCart).click();
        Thread.sleep(2000);
    }
    @And("Back To Home Page")
    public void navigateToHomePage() throws InterruptedException {
        Thread.sleep(4000);
        TestBase.driver.findElement(P08ShoppingCart.HomePage).click();
    }

    @And("User Select Another Category")
    public void selectAnotherCategory() throws InterruptedException {

        TestBase.driver.findElement(P08ShoppingCart.Category2Locator).click();

    }

    @And("User Select Product Item 2")
    public void selectProductItem2() throws InterruptedException {
        TestBase.driver.findElement(P08ShoppingCart.Item2Locator).click();
        Thread.sleep(1000);

    }

    @And("User Add Product Item 2 to Shopping cart")
            public void addItem2ToCart() throws InterruptedException {
        TestBase.driver.findElement(P08ShoppingCart.AddItem2ToCart).click();
        Thread.sleep(3000);

    }
    @Then("Product Item 2 Added Successfully")
            public void addItem2Successfully()
    {

        String ActualResult =   TestBase.driver.findElement(P08ShoppingCart.SuccessMessage).getText();
        String ExpectedResult = "The product has been added to your shopping cart";
        System.out.println("SuccessMessage 2 is : "+ActualResult);
        TestBase.driver.findElement(P08ShoppingCart.CloseSuccessMessageIcon).click();
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(ActualResult , ExpectedResult);
        softAssert.assertAll();
    }
}
