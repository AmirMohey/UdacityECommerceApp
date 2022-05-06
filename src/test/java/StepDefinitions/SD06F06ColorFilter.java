package StepDefinitions;

import Pages.P05SelectCategory;
import Pages.P06F06ColorFilter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class SD06F06ColorFilter {
    Actions actions = new Actions(TestBase.driver);
    P06F06ColorFilter colorFilter = new P06F06ColorFilter();
    String CurrentPageURL;
    String ColorId;
    @Given("User Selected Category and SubCategory")
     public void selectCategoryAndSubCategory(){
        WebElement Category = TestBase.driver.findElement(P06F06ColorFilter.CategoryLocator);
        WebElement SubCategory = TestBase.driver.findElement(P06F06ColorFilter.SubCategoryLocator);
        actions.moveToElement(Category);
        WebElement subCategory = TestBase.driver.findElement(P06F06ColorFilter.SubCategoryLocator);
        actions.moveToElement(subCategory).click();
        actions.build().perform();


    }

    @And("User Filter with Color")
    public void filterWithColor() {
        colorFilter.selectColor();
        CurrentPageURL = TestBase.driver.getCurrentUrl();
        System.out.println("URL is : "+CurrentPageURL );
        ColorId = TestBase.driver.findElement(P06F06ColorFilter.color).getAttribute("data-option-id");
    }

    @Then("Filtered Products are Displayed")
    public void listFilteredProducts()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(CurrentPageURL.contains("specs="+ColorId));
        softAssert.assertAll();
    }
}
