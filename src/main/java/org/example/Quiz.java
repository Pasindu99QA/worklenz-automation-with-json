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

public class Quiz {



    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "F:\\Automation Soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://uat.playpointz.com/admin/login");

        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("****");
        driver.findElement(By.id("password-input")).sendKeys("******");
        driver.findElement((By.className("btn"))).click();
//        Sleeper Thread = null;
        Thread.sleep(5000);


        //click Quizzes
        driver.findElement(By.xpath("//*[@id=\"headingOne\"]/button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"quizess-accord\"]/div/a[1]")).click();
        Thread.sleep(3000);

        // convert json to array
        ObjectMapper mapper = new ObjectMapper();
        try {
            QuizModel[] quizList= mapper.readValue(new File("src/main/resources/quiz.json"),QuizModel[].class);

            Thread.sleep(1000);
            for (int i=0;i< quizList.length;i++){
                System.out.println("Name "+quizList[i].getAnswerFour());

                //Create btn
                driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quizzes/div/div[1]/div[2]/button")).click();




                Thread.sleep(500);
                driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quizzes/div/div[3]/div/div/form/div[2]/div[1]/div/div[1]/input")).sendKeys(quizList[i].getName());


                //add pointz
                Thread.sleep(200);
                driver.findElement(By.xpath("//*[@id=\"quiz-points\"]")).sendKeys("10");

                Thread.sleep(200);
                driver.findElement(By.xpath("//*[@id=\"quiz-minus\"]")).sendKeys("5");

                //checkbox
                driver.findElement(By.xpath("//*[@id=\"schedule\"]")).click();
                //type
                WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
                Select select1 = new Select(dropdown1);
                select1.selectByValue("Image");



                //description
                Thread.sleep(300);
                driver.findElement(By.xpath("//*[@id=\"desc\"]")).sendKeys(quizList[i].getQuestion());

                //category
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"quiz\"]")).sendKeys(quizList[i].getCategory());



                //Quiz level

                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@id=\"quiz_level\"]")).click();
                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@id=\"quiz_level\"]/option[1]")).click();


                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[2]/div[8]/div/div[2]/button")).click();
                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@id=\"question_0\"]")).sendKeys(quizList[i].getAnswerOne());



                Thread.sleep(250);
                driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[2]/div[8]/div/div[2]/button")).click();
                Thread.sleep(250);
                driver.findElement(By.xpath("//*[@id=\"question_1\"]")).sendKeys(quizList[i].getAnswerTwo());


                Thread.sleep(250);
                if(quizList[i].getAnswerThree()!=null){
                    driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[2]/div[8]/div/div[2]/button")).click();
                    Thread.sleep(250);
                    driver.findElement(By.xpath("//*[@id=\"question_2\"]")).sendKeys(quizList[i].getAnswerThree());
                }



                Thread.sleep(250);
                if(quizList[i].getAnswerFour()!=null) {
                    driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[2]/div[8]/div/div[2]/button")).click();
                    Thread.sleep(250);
                    driver.findElement(By.xpath("//*[@id=\"question_3\"]")).sendKeys(quizList[i].getAnswerFour());
                }


              //select wrong ,  correct

                Thread.sleep(250);
                driver.findElement(By.xpath("//*[@id=\"state_0\"]")).click();
                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@id=\"state_0\"]/option[2]")).click();




                Thread.sleep(500);


                driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[3]/button[2]")).click();




                Thread.sleep(3000);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
