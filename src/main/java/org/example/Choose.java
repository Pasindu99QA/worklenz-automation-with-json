package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Choose {
    public static class Login {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\cey\\Desktop\\setups\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://playpointz.ceydigitalworld.com/admin/items");

            driver.findElement(By.name("username")).sendKeys("****");
            driver.findElement(By.id("password-input")).sendKeys("********");
            driver.findElement((By.className("btn"))).click();


            driver.manage().window().maximize();
        }
    }
}
