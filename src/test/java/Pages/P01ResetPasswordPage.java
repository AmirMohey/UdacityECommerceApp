package Pages;



import StepDefinitions.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class P01ResetPasswordPage {


    By logOut = By.className("ico-logout");
    By logIn = By.className("ico-login");
    By forgetPassword = By.cssSelector("a[href=\"/passwordrecovery\"]");
    By emailFieled = By.id("Email");
    By recoveryBtn = By.name("send-email");
    By alertMessage = By.className("close");


    public void clickLogOut()
    {
        TestBase.driver.findElement(logOut).click();
    }

    public void clickLogIn() throws InterruptedException {
        TestBase.driver.findElement(logIn).click();
    }

    public void clickForgetPassword()
    {
        TestBase.driver.findElement(forgetPassword).click();
    }

    public void setEmail(String email)
    {
        TestBase.driver.findElement(emailFieled).sendKeys(email);
    }
    public void clickRecoveryBtn()
    {
        TestBase.driver.findElement(recoveryBtn).click();
    }

    public void closeAlertMessage()
    {
        TestBase.driver.findElement(alertMessage).click();
    }




}
