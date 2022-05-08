package StepDefinitions;

import Pages.P00RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

public class SD00Registration {

    P00RegistrationPage registrationPage = new P00RegistrationPage();

    @When("User Clicked Register")
    public void clickRegister() throws InterruptedException {
        registrationPage.clickRegister();

    }

    @And("User Fill Registration Form")
    public void fillRegistrationForm()
    {
        registrationPage.selectGender();
        registrationPage.setFirstName("Amir");
        registrationPage.setLastName("Mo");
        registrationPage.setEmail(TestBase.EmailValue);
        System.out.println("From Registration : "+TestBase.EmailValue);
        registrationPage.setCompany("Udacity");
        registrationPage.enableNewsletter();
        registrationPage.setPassword("123456");
        registrationPage.setConfirmPassword("123456");
    }

    @Then("User Registered Successfully")
    public void confirmRegistrationSuccessfully()
    {
        registrationPage.confirmRegistration();
        String ExpectedResult = "Your registration completed";
        By SuccessRegistration = By.className("result");
        String ActualResult1= TestBase.driver.findElement(SuccessRegistration).getText();
        Assert.assertEquals(ExpectedResult,ActualResult1);
       // registrationPage.clickLogOut();
    }



}
