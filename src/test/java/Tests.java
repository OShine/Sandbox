import org.testng.Assert;
import org.testng.annotations.*;
import pages.InboxPage;
import pages.LoginPage;
import driver.Driver;


/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class Tests {

    private LoginPage loginPage;
    private InboxPage inboxPage;

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

        loginPage = new LoginPage();
        inboxPage = new InboxPage();

        loginPage.loginAs(USERNAME, PASSWORD);
        Assert.assertEquals(inboxPage.getComposeButtonText(), COMPOSE_BUTTON_TEXT);
        Assert.assertTrue(inboxPage.isDisplayed());
    }


    @Test
    public void logoutTest() {

        loginPage = new LoginPage();
        inboxPage = new InboxPage();

        inboxPage.clickLogoutButton();
        Assert.assertEquals(loginPage.getAuthButtonText(), AUTH_BUTTON_TEXT,"Login field is not presented" );
        Assert.assertTrue(loginPage.isDisplayed());

    }

    @AfterTest
    public void tearDown() {
        Driver.closeDriver();
    }
}