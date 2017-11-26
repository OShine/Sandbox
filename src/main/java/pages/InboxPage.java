package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Logout;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class InboxPage extends Page implements Logout{
    WebDriver driver;

    private static final String TITLE = "(3) Входящие - Почта Mail.Ru";
    private static final By COMPOSE_BUTTON = By.cssSelector("[data-name=\"compose\"]>span");
    private static final By LOGOUT_BUTTON = By.cssSelector("#PH_logoutLink");

    public InboxPage() {
        super(TITLE);
        driver = Driver.getDriver().get();
    }

    public String getComposeButtonText() {
        return driver.findElement(COMPOSE_BUTTON).getText();
    }

    public void clickLogoutButton(){
        driver.findElement(LOGOUT_BUTTON).click();
    }

}