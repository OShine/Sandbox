package util;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by DenisShklyannik on 20.11.2017.
 */
public interface Logout {

    By LOGOUT_BUTTON = By.cssSelector("#PH_logoutLink");
    default void Logout() {
        WebDriver driver = Driver.getDriver().get();
        driver.findElement(LOGOUT_BUTTON).click();
    }
}
