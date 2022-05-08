package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Random;

public class TestBase {

    public static SoftAssert softAssert= new SoftAssert();
    public static  WebDriverWait wait;
    public static WebDriver driver;

    // Create Random Email
    static Random random = new Random();
    static int x = random.nextInt(900) + 100;
    public static String EmailValue= "user"+x+"@gmail.com";



    @Before
    public static void launchBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        wait  = new WebDriverWait(TestBase.driver, Duration.ofSeconds(20));
    }

    @After
    public static void closeBrowser()
    {
        driver.quit();
    }
}
