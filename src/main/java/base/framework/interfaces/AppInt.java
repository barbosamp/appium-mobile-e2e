package base.framework.interfaces;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public interface AppInt {

    AppiumDriver getDriver() throws MalformedURLException, URISyntaxException;
}
