package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Logout;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class InboxPage extends Page implements Logout{
    private WebDriver driver;

    private static final String TITLE = "Входящие - Почта Mail.Ru";
    private static final By COMPOSE_BUTTON = By.cssSelector("[data-name=\"compose\"]>span");

    public InboxPage() {
        super(TITLE);
        driver = Driver.getDriver().get();
    }

    public String getComposeButtonText() {
        return driver.findElement(COMPOSE_BUTTON).getText();
    }

}