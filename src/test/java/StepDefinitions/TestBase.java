package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class TestBase {

    static Random random = new Random();
    static int x = random.nextInt(900) + 100;
    public static String EmailValue= "aaa"+x+"@gmail.com";

    public static WebDriver driver;
    @Before

    public static void launchBrowser()
    {
        System.out.println("From Test Base : "+EmailValue);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After

    public static void closeBrowser()
    {
        driver.quit();

    }
}
