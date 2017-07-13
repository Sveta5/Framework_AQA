package com.framework.aqa.core.driver;

import com.framework.aqa.core.enums.Browser;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driverInstance;

    private Driver() {
    }

    public static WebDriver startBrowser(Browser browserName, String url) {
        driverInstance = browserName.create();

        driverInstance.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driverInstance.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driverInstance.manage().window().maximize();
        driverInstance.get(url);

        return driverInstance;
    }

    public static WebDriver getInstance() {
        if (driverInstance == null) {
            driverInstance = Browser.CHROME.create();
            driverInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driverInstance;
    }

    public static void driverClose() {
        if (driverInstance != null) {
            driverInstance.close();
            driverInstance = null;
        }
    }
}