import org.testng.Assert;
import org.testng.annotations.*;
import pages.EmailPage;
import pages.MainPage;
import driver.Driver;


/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class Tests {

    private MainPage mainPage;
    private EmailPage emailPage;

    private static final String USERNAME = "seleniumtests10@mail.ru";
    private static final String PASSWORD = "060788avavav";
    private static final String COMPOSE_BUTTON_TEXT = "Написать письмо";
    private static final String AUTH_BUTTON_TEXT = "Войти";

    @BeforeTest
    public void beforeTest() {
          Driver.openHomePage();
    }

    @Test
    public void loginTest() {

        mainPage = new MainPage();
        emailPage = new EmailPage();

        mainPage.loginAs(USERNAME, PASSWORD);
        Assert.assertEquals(emailPage.getComposeButtonText(), COMPOSE_BUTTON_TEXT);
    }


    @Test
    public void logoutTest() {

        mainPage = new MainPage();
        emailPage = new EmailPage();

        emailPage.clickLogoutButton();
        Assert.assertEquals(mainPage.getAuthButtonText(), AUTH_BUTTON_TEXT,"Login field is not presented" );

    }

    @AfterTest
    public void tearDown() {
        Driver.closeDriver();
    }
}