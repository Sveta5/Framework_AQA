package com.framework.aqa.core.enums;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Log
public class NullBrowser implements WebDriver {

    private static final String MESSAGE = "You cant work with Browser class";

    @Override
    public void get(String s) {
        log.info(MESSAGE);
    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return Collections.emptyList();
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {
        log.info(MESSAGE);
    }

    @Override
    public void quit() {
        log.info(MESSAGE);
    }

    @Override
    public Set<String> getWindowHandles() {
        return Collections.emptySet();
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}
