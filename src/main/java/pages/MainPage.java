package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class MainPage {

    private WebDriver driver;

    private static final By MAILBOX_LOGIN = By.id("mailbox:login");
    private static final By MAILBOX_PASSWORD = By.id("mailbox:password");
    private static final By MAILBOX_AUTH_BUTTON = By.id("mailbox:submit");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

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