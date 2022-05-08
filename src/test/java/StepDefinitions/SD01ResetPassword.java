package StepDefinitions;

import Pages.P01ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SD01ResetPassword {

    P01ResetPasswordPage resetPassPage = new P01ResetPasswordPage();

    @Given("User Navigated to Reset Password Page")
    public void goToPasswordPage() throws InterruptedException {
        resetPassPage.clickLogIn();
        resetPassPage.clickForgetPassword();
    }
    @And("Password Reset Successfully")
    public void resetPass(){
        resetPassPage.setEmail(TestBase.EmailValue);
        System.out.println("From Reset : "+TestBase.EmailValue);
        resetPassPage.clickRecoveryBtn();
        TestBase.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String ExpectedResult = "Email with instructions has been sent to you.";
        String ActualResult = TestBase.driver.findElement(By.className("content")).getText();
        Assert.assertEquals(ExpectedResult,ActualResult);
        resetPassPage.closeAlertMessage();

    }

}
