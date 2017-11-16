import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.EmailPage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;


/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class Tests {

    private WebDriver driver;
    private MainPage mainPage;
    private EmailPage emailPage;

    private static final String BASE_URL = "https://mail.ru";
    private static final String USERNAME = "seleniumtests10@mail.ru";
    private static final String PASSWORD = "060788avavav";
    private static final String COMPOSE_BUTTON_TEXT = "Написать письмо";
    private static final String AUTH_BUTTON_TEXT = "Войти";

    @BeforeTest
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void loginTest() {

        mainPage = new MainPage(driver);
        emailPage = new EmailPage(driver);

        mainPage.loginAs(USERNAME, PASSWORD);
        Assert.assertEquals(emailPage.getComposeButtonText(), COMPOSE_BUTTON_TEXT);
    }


    @Test
    public void logoutTest() {

        mainPage = new MainPage(driver);
        emailPage = new EmailPage(driver);

        emailPage.clickLogoutButton();
        Assert.assertEquals(mainPage.getAuthButtonText(), AUTH_BUTTON_TEXT,"Login field is not presented" );

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}