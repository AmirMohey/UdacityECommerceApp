package StepDefinitions;

import Pages.P07SelectTags;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class SD07SelectTags {
    public String TagValue;
    public String TagResult;

    @Given("User Select Tags")
    public void selectTags() throws InterruptedException {

        TestBase.driver.findElement(P07SelectTags.TagLocator).click();
        TagValue = TestBase.driver.findElement(P07SelectTags.TagLocator).getText();
        Thread.sleep(1000);
        By res = By.cssSelector("div.page-title > h1");
        TagResult = TestBase.driver.findElement(res).getText();
    }

    @And("tagged Products are Displayed")
    public void displayTaggedProducts()
    {
        String Expected = "Products tagged with '" +TagValue+ "'";
        String Actual = TagResult ;
        System.out.println("Expected : "+Expected  +"\n" +"Actual   : "+Actual);
        TestBase.softAssert.assertTrue(TagResult.contains(TagValue));
        TestBase.softAssert.assertEquals(Expected , Actual);
        TestBase.softAssert.assertAll();
    }

}
