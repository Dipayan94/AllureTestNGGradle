package org.example.utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenUtils {

    @Attachment(value = "screenshot", type = "image/png")
    public static byte[] attachScreenShot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "Other file attachment", type = "text")
    public static InputStream attachAnyFileType(String filePath) {
        Path content = Paths.get(filePath);
        try {
            return Files.newInputStream(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
