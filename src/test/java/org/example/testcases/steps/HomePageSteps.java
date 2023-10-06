package org.example.testcases.steps;

import io.qameta.allure.Step;
import org.example.core.pages.HomePage;
import org.openqa.selenium.WebDriver;

import static org.example.utils.ScreenUtils.attachAnyFileType;
import static org.example.utils.ScreenUtils.attachScreenShot;

public class HomePageSteps {

    @Step("enter user credentials")
    public void enterCredentials(WebDriver driver) {
        new HomePage(driver).enterCredentials();
        attachScreenShot(driver);
        System.out.println("login step complete");
    }

    @Step("login to user profile")
    public void loginToUser(WebDriver driver) {
        new HomePage(driver).loginToPage();
        attachAnyFileType("/Users/dipayandas/Downloads/scorereport.pdf");
        System.out.println("navigate to user profile");
    }
}
