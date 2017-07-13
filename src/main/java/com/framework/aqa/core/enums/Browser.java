package com.framework.aqa.core.enums;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum Browser {
    CHROME {
        @Override
        public WebDriver create() {
            ChromeDriverManager.getInstance().version(DEFAULT_BROSER_VERSION).setup();
            return new ChromeDriver();
        }
    },
    FIREFOX {
        @Override
        public WebDriver create() {
            FirefoxDriverManager.getInstance().setup();
            return new FirefoxDriver();
        }
    },

    IE {
        @Override
        public WebDriver create() {
            InternetExplorerDriverManager.getInstance().arch32().version("7").setup();
            return new InternetExplorerDriver();
        }
    };

    public static final String DEFAULT_BROSER_VERSION = "LATEST";

    public WebDriver create() {
        return new NullBrowser();
    }
}