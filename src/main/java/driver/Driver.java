package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static final String BASE_URL = "https://mail.ru";
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static void openHomePage() {
        getDriver().get().navigate().to(BASE_URL);
    }

    public static ThreadLocal<WebDriver> getDriver(){
        if (driver.get() == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
            WebDriver d = new ChromeDriver();
            d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            d.manage().window().maximize();

            driver.set(d);
        }

        return driver;
    }

    public static void closeDriver() {
        driver.get().close();
        driver.set(null);
    }

}
