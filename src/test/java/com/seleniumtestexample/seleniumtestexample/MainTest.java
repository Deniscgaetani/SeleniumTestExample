package com.seleniumtestexample.seleniumtestexample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    private WebDriver driver;
    String link = "https://ultimateqa.com/automation";

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void openQAWebsite() {
        Assertions.assertEquals("https://ultimateqa.com/automation", link);
        driver.get("https://ultimateqa.com/automation");
    }
}
