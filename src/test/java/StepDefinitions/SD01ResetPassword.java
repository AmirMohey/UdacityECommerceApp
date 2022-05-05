package StepDefinitions;

import Pages.P01ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SD01ResetPassword {


    P01ResetPasswordPage resetPassPage = new P01ResetPasswordPage();



    @Given("User Navigated to Reset Password Page")
    public void goToPasswordPage() throws InterruptedException {

        resetPassPage.clickLogIn();
        resetPassPage.clickForgetPassword();
    }
    @And("Password Reset Successfully")
    public void resetPass() throws InterruptedException {

        resetPassPage.setEmail(TestBase.EmailValue);
        System.out.println("From Reset : "+TestBase.EmailValue);
        resetPassPage.clickRecoveryBtn();
        Thread.sleep(1000);
        String ExpectedResult = "Email with instructions has been sent to you.";
        String ActualResult = TestBase.driver.findElement(By.className("content")).getText();

        Assert.assertEquals("Email with instructions has been sent to you.",ExpectedResult,ActualResult);
        resetPassPage.closeAlertMessage();

    }


}
