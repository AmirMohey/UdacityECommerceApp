package StepDefinitions;

import Pages.P02LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SD02LogIn {


    P02LogInPage logInPage = new P02LogInPage();

    @When("User Navigated to Log In Page")
    public void navigateToLogInPage()
    {
        logInPage.clickLogIn();
    }


    @When("User Enter Valid Email and Password")
    public void enterEmailAndPassword()
    {
        logInPage.setEmail(TestBase.EmailValue);
        System.out.println("From Log In : "+TestBase.EmailValue);
        logInPage.setPassword("123456");
    }
    @And("User Clicked Log In Button")
    public void clickLogInBtn()
    {
        logInPage.clickLogInBtn();
    }

    @Then("User Logged In Successfully")
    public void loggedInSuccessfully()
    {

        WebElement logOut = TestBase.driver.findElement(By.className("ico-logout"));
        Assert.assertTrue( logOut.isDisplayed());
    }




}
