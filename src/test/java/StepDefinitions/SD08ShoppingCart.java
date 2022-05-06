package StepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SD08ShoppingCart {


    @Given("User Select Product Item 1")
    public void selectProductItem1() throws InterruptedException {
        By d = By.cssSelector(".product-title a[href=\"/build-your-own-computer\"]");
        TestBase.driver.findElement(d).click();
        By HDD = By.cssSelector("#product_attribute_input_3 > ul > li:nth-child(1) > input");
        By RAM = By.id("product_attribute_2");
        Select select = new Select(TestBase.driver.findElement(RAM));
        select.selectByIndex(1);
        TestBase.driver.findElement(HDD).click();
        By add = By.id("add-to-cart-button-1");
        TestBase.driver.findElement(add).click();

        Thread.sleep(5000);
        By res = By.className("content");
     String mm =   TestBase.driver.findElement(res).getText();
        System.out.println("Message is : "+mm);
    }
}
