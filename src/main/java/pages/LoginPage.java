package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class LoginPage extends Page{

    WebDriver driver;

    private static final String TITLE = "Mail.Ru: почта, поиск в интернете, новости, игры";
    private static final By MAILBOX_LOGIN = By.id("mailbox:login");
    private static final By MAILBOX_PASSWORD = By.id("mailbox:password");
    private static final By MAILBOX_AUTH_BUTTON = By.id("mailbox:submit");

    public LoginPage(){super(TITLE);
        driver = Driver.getDriver().get();}

    private void setLogin(String login) {
        driver.findElement(MAILBOX_LOGIN).sendKeys(login);
    }

    private void setPassword(String password) {
        driver.findElement(MAILBOX_PASSWORD).sendKeys(password);
    }

    public String getAuthButtonText() {
        return driver.findElement(MAILBOX_AUTH_BUTTON).getText();
    }

    private void clickLoginButton() {
        driver.findElement(MAILBOX_AUTH_BUTTON).click();
    }

    public void loginAs(String userName, String password) {
        setLogin(userName);
        setPassword(password);
        clickLoginButton();
    }
}