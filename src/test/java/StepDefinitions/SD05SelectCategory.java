package StepDefinitions;

import Pages.P05SelectCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SD05SelectCategory {

    Actions actions = new Actions(TestBase.driver);
    public String SubCategoryValue;
    @Given("User Hover Categories")
    public void hoverCategory() {

        WebElement Category = TestBase.driver.findElement(P05SelectCategory.CategoryLocator);
        actions.moveToElement(Category);

    }

    @And("User Select Sub Category")
    public void selectSubCategory()
    {
        WebElement subCategory = TestBase.driver.findElement(P05SelectCategory.SubCategoryLocator);

         SubCategoryValue = subCategory.getText();
        actions.moveToElement(subCategory).click();
        actions.build().perform();


    }


    @Then("User Opened Sub Category Page")
    public void openSubCategory() throws InterruptedException {
       Thread.sleep(1000);
        String categoryURL = TestBase.driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
       softAssert.assertTrue(categoryURL.contains("https://demo.nopcommerce.com/"+SubCategoryValue));
       softAssert.assertAll();
 }
}

