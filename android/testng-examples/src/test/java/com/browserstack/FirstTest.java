package com.browserstack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.browserstack.AppPercySDK;

import io.appium.java_client.AppiumBy;

public class FirstTest extends AppiumTest {

    @Test
    public void test() throws Exception {
        AppPercySDK.screenshot(driver, "My Screenshot");
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        // Validate length is greater than 100
        Assert.assertTrue(pageSource.length() > 100,
                "Page source length is not greater than 100!");
    }
}
