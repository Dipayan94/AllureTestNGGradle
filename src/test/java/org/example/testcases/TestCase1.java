package org.example.testcases;

import org.example.testcases.steps.HomePageSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("Setup starts");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Setup ends");
    }

    @Test
    public void myTestScenario1() {
        System.out.println("Test 1 starts");
        new HomePageSteps().enterCredentials(driver);
        new HomePageSteps().loginToUser(driver);
        System.out.println("Test 1 ends");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        System.out.println("Setup ends");
    }
}
