package com.anhtester.Bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Locator HTML attribute.");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        Thread.sleep(3000);

        WebElement inputPassword= driver.findElement(By.name("password"));
        inputPassword.sendKeys("123456");
        Thread.sleep(3000);

//        WebElement clickForgotPass = driver.findElement(By.linkText("Forgot Password?"));
//        clickForgotPass.click();
//        Thread.sleep(3000);

        driver.findElement(By.className("btn")).click();
        Thread.sleep(4000);
        driver.quit();


    }

}
