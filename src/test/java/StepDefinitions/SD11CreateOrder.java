package StepDefinitions;

import Pages.P08ShoppingCart;
import Pages.P09Wishlist;
import Pages.P11CreateOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SD11CreateOrder {


    @Given("User Go To Shipping Cart Page")
    public void navigateToShippingCart() throws InterruptedException {
//        Thread.sleep(2000);
//        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P11CreateOrder.ShippingCartPageLocator));
//        TestBase.driver.findElement(P11CreateOrder.ShippingCartPageLocator).click();


        Thread.sleep(3000);
        By ShippingCartPageLocator = By.cssSelector("#topcartlink > a > span.cart-label");
        TestBase.driver.findElement(ShippingCartPageLocator).click();
    }
        @And("Update Quantity Count")
        public void updateQuantity(){
            By QuantityValue = By.className("qty-input");
            TestBase.driver.findElement(QuantityValue).clear();
            TestBase.driver.findElement(QuantityValue).sendKeys("3");
            By UpdateCartLocator = By.id("updatecart");
            TestBase.driver.findElement(UpdateCartLocator).click();
            }




    @And("User Click Checkout")
    public void clickCheckout(){

        By AcceptTermsLocator =By.id("termsofservice");
        TestBase.driver.findElement(AcceptTermsLocator).click();
        By CheckOutBTNLocator =By.id("checkout");
        TestBase.driver.findElement(CheckOutBTNLocator).click();
    }

    @And("User Fill Shipping Address Form")
    public void fillAddressForm()
    {

        Select select = new Select(TestBase.driver.findElement(P11CreateOrder.CountryLocator));
        select.selectByVisibleText("Egypt");

        TestBase.driver.findElement(P11CreateOrder.city).clear();
        TestBase.driver.findElement(P11CreateOrder.city).sendKeys("Cairo");


        TestBase.driver.findElement(P11CreateOrder.Address).clear();
        TestBase.driver.findElement(P11CreateOrder.Address).sendKeys("Giza");

        TestBase.driver.findElement(P11CreateOrder.ZIPCode).clear();
        TestBase.driver.findElement(P11CreateOrder.ZIPCode).sendKeys("12345");

        TestBase.driver.findElement(P11CreateOrder.Phone).clear();
        TestBase.driver.findElement(P11CreateOrder.Phone).sendKeys("01121456332");
        By NextStepBTNLocator = By.xpath("//div[contains(@id, 'billing-buttons-container')] /button[contains(@class, 'new-address-next-step-button')]");
        TestBase.driver.findElement(NextStepBTNLocator).click();

    }

    @And("User Select Shipping Method")
    public void selectShippingMethod() throws InterruptedException {
        Thread.sleep(2000);
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P11CreateOrder.ShippingMethodLocator));
        TestBase.driver.findElement(P11CreateOrder.ShippingMethodLocator).click();
    }

    @And("User Select Payment Method")
    public void selectPaymentMethod() throws InterruptedException {
        Thread.sleep(2000);
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P11CreateOrder.PaymentMethodBTNLocator));
        TestBase.driver.findElement(P11CreateOrder.PaymentMethodBTNLocator).click();
    }

    @And("User Select Payment Information")
    public void selectPaymentInformation() throws InterruptedException {
        Thread.sleep(2000);
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P11CreateOrder.PaymentInfoBTNLocator));
        TestBase.driver.findElement(P11CreateOrder.PaymentInfoBTNLocator).click();
    }

    @Then("User Confirm Order")
    public void confirmOrder() throws InterruptedException {
        Thread.sleep(2000);
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P11CreateOrder.ConfirmOrderBTNLocator));
        TestBase.driver.findElement(P11CreateOrder.ConfirmOrderBTNLocator).click();
        TestBase.wait.until(ExpectedConditions.presenceOfElementLocated(P11CreateOrder.SuccessMessageLocator));
        String ActualResult =   TestBase.driver.findElement(P11CreateOrder.SuccessMessageLocator).getText();
        String OrderNumber =   TestBase.driver.findElement(P11CreateOrder.OrderNumberLocator).getText();
        String ExpectedResult =  "Your order has been successfully processed!";
        TestBase.softAssert.assertEquals(ActualResult , ExpectedResult);
        String ActualCurrentURL = TestBase.driver.getCurrentUrl();
        String ExpectedCurrentURL ="https://demo.nopcommerce.com/checkout/completed";

        TestBase.softAssert.assertEquals(ActualCurrentURL , ExpectedCurrentURL);
        TestBase.softAssert.assertTrue(OrderNumber.contains("ORDER NUMBER:"));
        TestBase.softAssert.assertAll();
    }









}
