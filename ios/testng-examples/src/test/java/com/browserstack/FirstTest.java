package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FirstTest extends AppiumTest {

  @Test
  public void test() throws Exception {
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        Assert.assertTrue(pageSource.length() > 100,
                "Page source length is not greater than 100!");
  }
}
