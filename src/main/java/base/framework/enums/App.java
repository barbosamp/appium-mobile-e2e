package base.framework.enums;

import base.framework.interfaces.AppInt;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public enum App implements AppInt {

    ANDROID("ANDROID") {
        @Override
        public AndroidDriver  getDriver() throws MalformedURLException, URISyntaxException {

            String path = System.getProperty("user.dir");
            String apkFolder = path + "/src/test/java/app/etech.apk";
            UiAutomator2Options options = new UiAutomator2Options()
            .setPlatformName("Android")
            .setDeviceName("Xiaomi")
            .setAppPackage("br.com.filme.app")
            .setAutomationName("UiAutomator2")
            .setApp(apkFolder)
            .setAutoGrantPermissions(true)
            .setUdid("emulator-5554");
            return new AndroidDriver(new URI("http://localhost:4723").toURL(), options);
        }
    }

    ;
    App(String android) {
    }
}
