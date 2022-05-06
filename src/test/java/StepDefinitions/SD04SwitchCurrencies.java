package StepDefinitions;

import Pages.P04SwitchCurrencies;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SD04SwitchCurrencies {
    P04SwitchCurrencies switchCurrencies = new P04SwitchCurrencies();
    @Given("User Select Currency Dropdown")
    public void selectCurrencyDropdown() throws InterruptedException {

        Select select = new Select(TestBase.driver.findElement(switchCurrencies.currencyLocator));
        select.selectByVisibleText("Euro");
        SoftAssert softAssert = new SoftAssert();

    }


}
