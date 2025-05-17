package base.framework.common;


import base.framework.interfaces.AppInt;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;

public class BaseTest {
    public static AppiumDriver driver;
    public static Wait wait;

    public void inicializarDriver(AppInt app) throws MalformedURLException, URISyntaxException {
        driver = app.getDriver();
        wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public void quitDriver() {
        if (driver != null)
            driver.quit();
    }
}
