package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class NewQuiz {
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        try{
            System.setProperty("webdriver.chrome.driver", "F:\\Automation Soft\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://playpointz.ceydigitalworld.com/admin/login");

            driver.manage().window().maximize();

            driver.findElement(By.name("username")).sendKeys("****");
            driver.findElement(By.id("password-input")).sendKeys("********");
            driver.findElement((By.className("btn"))).click();
//        Sleeper Thread = null;
            Thread.sleep(5000);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
