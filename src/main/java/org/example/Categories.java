//package org.example;
//
//public class  {
//}

package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Sleeper;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.getKeyFromUnicode;

public class Categories {



    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "F:\\Automation Soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // driver.get("https://playpointz.ceydigitalworld.com/admin/login");

        //uat
        driver.get("https://uat.playpointz.com/admin/login");

        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("superAdmin");
        driver.findElement(By.id("password-input")).sendKeys("admin@play#pointz@sh");
        driver.findElement((By.className("btn"))).click();
//        Sleeper Thread = null;
        Thread.sleep(5000);

        //click quizzes

        driver.findElement(By.xpath("//*[@id=\"headingOne\"]/button")).click();
        Thread.sleep(3000);

        //click cat

        driver.findElement(By.xpath("//*[@id=\"quizess-accord\"]/div/a[3]")).click();
        Thread.sleep(3000);

        // convert json to array
        ObjectMapper mapper = new ObjectMapper();
        try {
            CategoryModel[] categoryList= mapper.readValue(new File("src/main/resources/category.json"),CategoryModel[].class);

            Thread.sleep(1000);
            for (int i=0;i< categoryList.length;i++){

                System.out.println(categoryList[i].getCategory());
                Thread.sleep(500);
                driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-categories/div/div[1]/div[2]/button")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"cat-name\"]")).sendKeys(categoryList[i].getCategory());

                Thread.sleep(1000);
                WebElement choose1 = driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-categories/div/div[3]/div/div/form/div[3]/button[2]"));
                choose1.click();


                Thread.sleep(3000);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}