package com.example.quickstart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupAndTeardown {
    protected WebDriver driver;
    @BeforeEach
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("cd");

    }

    @AfterEach
    public void TearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
