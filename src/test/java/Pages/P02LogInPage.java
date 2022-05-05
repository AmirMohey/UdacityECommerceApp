package Pages;
import StepDefinitions.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02LogInPage {

    // WebDriverWait wait = new WebDriverWait(driver,20.00);



    By logIn = By.className("ico-login");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By logInBtn = By.className("login-button");
    By logOut = By.className("ico-logout");
    public void clickLogIn() {
        TestBase.driver.findElement(logIn).click();
    }

    public void setEmail(String email)
    {
        TestBase.driver.findElement(Email).sendKeys(email);
    }
    public void setPassword(String password)
    {
        TestBase.driver.findElement(Password).sendKeys(password);
    }
    public void clickLogInBtn()
    {
        TestBase.driver.findElement(logInBtn).click();
    }



}
