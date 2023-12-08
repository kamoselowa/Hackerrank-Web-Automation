package com.example.quickstart;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class firstPage extends SetupAndTeardown {


   @Override
   public void Setup() {
      super.Setup();
   }

   @Test
   public void LOginRegisterPage(){



      WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a[2]"));
      LoginBtn.click();
      WebElement UserNameEntry = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div/div/input"));
      UserNameEntry.sendKeys("kamoselowa@gmail.com");

      WebElement PassWordEntry = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div/div/input"));
      PassWordEntry.sendKeys("52664356Trox");

      driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[4]/button")).click();


   }
   @Test
   public  void RegisterPage(){
      driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a[1]")).click();
      WebElement FirstName = driver.findElement(By.name("name"));
      FirstName.sendKeys("Jamal");

      WebElement Email = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/input"));
      Email.sendKeys("scarletvega81@gmail.com");

      driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[5]/button")).click();
   }
   @Test
   public void TextElements() {
      try {
           WebElement forDevelopersLogo = driver.findElement(By.cssSelector("#content > div > div > div > div > div.community-content > div > div > h2"));

      // Check if the "For Developers" logo is displayed
      boolean isDisplayed = forDevelopersLogo.isDisplayed();
      assertTrue(isDisplayed, "For Developers logo should be displayed.");

      // Get the text content of the "For Developers" logo
      String logoText = forDevelopersLogo.getText();
      assertEquals("For Developers", logoText, "For Developers");
         
      } catch (Exception e) {
         System.out.println("Text Invalid");
      }
    


      
      try {
        WebElement Description = driver.findElement(By.className("auth-category-subtitle"));
      if(Description.isDisplayed()){
         Description.getText();
      }
      else return;
      } catch (Exception e) {
        System.out.println("Element not found");
      }
   }

   @Override
   public void TearDown() {
      super.TearDown();
   }
}
