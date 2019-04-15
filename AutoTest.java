package com.company;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {
    private static WebDriver driver;
//    @BeforeMethog
    //@Test
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mail.ru");

        WebElement search = driver.findElement(By.id("q"));
//                           driver.findElement(By.id("submit")).click();
        search.sendKeys("Sweet Dogs");
        search.sendKeys(Keys.ENTER);

    }
//    @AfterMethod
    @Test
    public void userLogin() {

    }

    @AfterClass
    public static void tearDown(){

    }
}
