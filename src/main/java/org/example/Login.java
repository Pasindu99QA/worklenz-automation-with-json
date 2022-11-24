package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Sleeper;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.getKeyFromUnicode;

public class Login {
    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "F:\\Automation Soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // driver.get("https://playpointz.ceydigitalworld.com/admin/login");

        //uat
        driver.get("https://playpointz.ceydigitalworld.com/admin/campaigns");

        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("****");
        driver.findElement(By.id("password-input")).sendKeys("********");
        driver.findElement((By.className("btn"))).click();
//        Sleeper Thread = null;
        Thread.sleep(5000);


    //click Quizzes
        driver.findElement(By.xpath("//*[@id=\"headingOne\"]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"quizess-accord\"]/div/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quizzes/div/div[1]/div[2]/button")).click();



    //create Quizzes
//        Set<String> handler = driver.getWindowHandles();
//        Iterator<String> it = handler.iterator();
//
//        String parentWindowId = it.next();
//        System.out.println("parent windwo id:"+ parentWindowId);
//
//        String childWindowId = it.next();
//        System.out.println("child window id:"+ childWindowId);
//
//        driver.switchTo().window(childWindowId);

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quizzes/div/div[3]/div/div/form/div[2]/div[1]/div/div[1]/input")).sendKeys("pasi");

        //checkbox
        driver.findElement(By.xpath("//*[@id=\"schedule\"]")).click();
        //type
      WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
      Select select1 = new Select(dropdown1);
      select1.selectByValue("Image");

      //choose image
        Thread.sleep(3000);
       WebElement choose = driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quizzes/div/div[3]/div/div/form/div[2]/div[4]/div/div/button"));
       choose.click();

        StringSelection StringSelection = new StringSelection("C:\\Users\\cey\\Downloads\\wallpapersden.com_fantasy-samurai-4k-minimal_3840x2160.jpg");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(StringSelection,null);

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);



        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        //description
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"desc\"]")).sendKeys("playpointz yo yo");

        //category
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"quiz\"]")).sendKeys("snake game");



        //Quiz level

        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"quiz_level\"]"));
        Select select2 = new Select(dropdown2);
        select2.selectByValue("f4f06281-2924-4d58-8341-bdce22330dc1");


        Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[2]/div[8]/div/div[2]/button")).click();
        Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"question_0\"]")).sendKeys("apple");

        Thread.sleep(3000);
    WebElement dropdown3 = driver.findElement(By.xpath("//*[@id=\"state_0\"]"));
    Select select3 = new Select(dropdown3);
    select3.selectByValue("false");
        Thread.sleep(2000);

    driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[3]/button[2]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[3]/button[1]")).click();

        //schedule
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"quizess-accord\"]/div/a[2]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-schedule/div[1]/div[2]/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"quiz\"]")).sendKeys("games week");

        Thread.sleep(2000);
        WebElement dropdown4 =  driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-schedule/div[4]/div[1]/div/form/div[2]/div[2]/select"));
        Select select4 = new Select(dropdown4);
        select4.selectByValue("28fa44c0-841d-4ab4-b2e3-a10c41eb1cf9");
        driver.findElement(By.xpath("//*[@id=\"scheduleModalQ\"]/div[1]/div/form/div[3]/button[1]")).click();

        Thread.sleep(1000);
        // schedular calander
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-schedule/div[3]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[2]/td[4]/div")).click();

        //categories
        driver.findElement(By.xpath("//*[@id=\"quizess-accord\"]/div/a[3]")).click();

        //create categories
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-categories/div/div[1]/div[2]/button")).click();

        //name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cat-name\"]")).sendKeys("selenium");
        driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[3]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[3]/button[1]")).click();

        //item
        driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"items-accord\"]/div/a[1]")).click();

        //add item
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-items/div/div[2]/div[2]/button")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"item-name\"]")).sendKeys("air pods");

        Thread.sleep(1000);
        WebElement electronic =  driver.findElement(By.xpath("//*[@id=\"category\"]"));
        Select select5 = new Select(electronic);
        select5.selectByValue("76a9e798-bf84-4593-8b1b-b514837fb786");

        driver.findElement(By.xpath("//*[@id=\"desc\"]")).sendKeys("colour - white / LKR 6000");



        //choose thumbnail image

        Thread.sleep(2000);



        Thread.sleep(3000);


        driver.findElement(By.xpath("//*[@id=\"stock\"]")).sendKeys("4");
        driver.findElement(By.xpath("//*[@id=\"pointz\"]")).sendKeys("500");
       // driver.findElement(By.xpath("//*[@id=\"itemModal\"]/div/div/form/div[3]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"itemModal\"]/div/div/form/div[3]/button[1]")).click();

        //edit items
        Thread.sleep(2000);

        WebElement iphone =  driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-items/div/div[3]/div[2]/table/tbody/tr[1]/td[8]/button[1]/img"));
        iphone.click();

        Thread.sleep(1000);
        WebElement editandroid =  driver.findElement(By.xpath("//*[@id=\"item-name\"]"));
        editandroid.sendKeys("IOS");

        WebElement dropdown6 =  driver.findElement(By.xpath("//*[@id=\"category\"]"));
       Select select6 = new Select(dropdown6);
       select6.selectByValue("76a9e798-bf84-4593-8b1b-b514837fb786");

        //delete alert box
       // driver.findElement(By.xpath("//*[@id=\"itemModal\"]/div/div/form/div[2]/div[4]/button")).click();
        //Alert alert = driver.switchTo().alert();
        //alert.accept();
Thread.sleep(1000);
       // WebElement choose1 =  driver.findElement(By.xpath("//*[@id=\"itemModal\"]/div/div/form/div[2]/div[5]/div/button"));
        //choose1.sendKeys("C:\\Users\\cey\\Desktop\\iPhone_14_Pro_Max_WLAN_Wifi_6E.jpg");

        driver.findElement(By.xpath("//*[@id=\"itemModal\"]/div/div/form/div[3]/button[2]")).click();


        //delete
        //WebElement deleteitem =  driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-items/div/div[3]/div[2]/table/tbody/tr[2]/td[8]/button[2]/img"));
        //deleteitem.click();
       // driver.findElement(By.xpath("//*[@id=\"delete-item-modal\"]/div/div/div/button[2]")).click();

        //scheduler

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"items-accord\"]/div/a[2]")).click();

        WebElement newsheduler = driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-item-schedule/div/div[1]/div[2]/button"));
        newsheduler.click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"item\"]")).sendKeys("T-shirt", ENTER, ENTER);
        driver.findElement(By.xpath("//*[@id=\"waitingDate\"]")).click();
//waiting time
        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[3]/div[1]/div[2]/table/tbody/tr[4]/td[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[3]/div[2]/div[2]/table/tbody/tr[3]/td[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[3]/div[3]/div/button[1]")).click();

//Active End time
        driver.findElement(By.xpath("//*[@id=\"singledate\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[2]/div[3]/div/button[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[1]/div/form/div[3]/button[3]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[1]/div/form/div[3]/button[2]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"scheduleModal\"]/div[1]/div/form/div[3]/button[1]")).click();

      //Categories
        driver.findElement(By.xpath("//*[@id=\"items-accord\"]/div/a[3]")).click();
      //create categories
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-item-categories/div/div[1]/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cat-name\"]")).sendKeys("testing");

        Thread.sleep(1000);
        WebElement choose1 = driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/form/div[2]/div[2]/div/div/button"));
        choose1.click();

        Thread.sleep(2000);

        StringSelection Selection1 = new StringSelection("C:\\Users\\cey\\Desktop\\iPhone_14_Pro_Max_WLAN_Wifi_6E.jpg");
        Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard1.setContents(Selection1,null);

        Thread.sleep(3000);

        try {


            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/form/div[3]/button[2]")).click();

            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/form/div[3]/button[1]")).click();



        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        //search category

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-item-categories/div/div[2]/div[1]/div/form/input")).sendKeys("Electronic", ENTER);

        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-item-categories/div/div[2]/div[2]/table/tbody/tr/td[2]/button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/form/div[2]/div[2]/div[1]/button")).click();

        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();


        driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/form/div[3]/button[1]")).click();



    ////order and shipping

        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/play-pointz-side-bar/div/ul/li[4]/a")).click();
        Thread.sleep(1000);
        //edit
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-orders-and-shipping/div/div[3]/div[2]/table/tbody/tr[3]/td[7]/button")).click();
        //delivery space
        Thread.sleep(1000);
        WebElement dropdown7 = driver.findElement(By.xpath("//*[@id=\"status\"]"));
        Select select7 = new Select(dropdown7);
        select7.selectByValue("Shipped");

        //comment box
        driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("testing automation");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/form/div[3]/div/button[2]")).click();

        //search box
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-orders-and-shipping/div/div[3]/div[1]/div/form/input")).sendKeys("CAR", ENTER);
        Thread.sleep(3000);



    ////Campaign
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/play-pointz-side-bar/div/ul/li[5]/a")).click();

        //New Campaign
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-campaigns/div[1]/div[1]/div[2]/button")).click();

        //campaign name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"campaign-name\"]")).sendKeys("Testing Automation");

        //sponsor name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sponsor\"]")).sendKeys("testing");

        //placement
        Thread.sleep(1000);
        WebElement dropdown8 = driver.findElement(By.xpath("//*[@id=\"placement\"]"));
        Select select8 = new Select(dropdown8);
        select8.selectByValue("Feed");

        //campaign type
        Thread.sleep(1000);
        WebElement dropdown9 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        Select select9 = new Select(dropdown9);
        select9.selectByValue("Image");

        //choose file
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"campaignModal\"]/div[1]/div/form/div[2]/div[5]/button")).click();

        //choose new image
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mediaModal\"]/div/div/div[2]/div/div/div/button")).click();

        Thread.sleep(2000);
        StringSelection Selection3 = new StringSelection("C:\\Users\\cey\\Downloads\\offer.jpg");
        Clipboard clipboard3 = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard3.setContents(Selection3,null);

        try {

            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        //add
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mediaModal\"]/div/div/div[3]/div/button[2]")).click();

        //URL
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"web-url\"]")).sendKeys("https://www.facebook.com/appleasia.lk/");

        //schedule
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"item-add-schedule-btn\"]")).click();

        //select date
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"campaignModal\"]/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"campaignModal\"]/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"campaignModal\"]/div[2]/div[3]/div/button[1]")).click();

        Thread.sleep(1000);
       // driver.findElement(By.xpath("//*[@id=\"campaignModal\"]/div[1]/div/form/div[3]/div[2]/button[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"campaignModal\"]/div[1]/div/form/div[3]/div[2]/button[1]")).click();

        //edit button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-campaigns/div[1]/div[2]/div[2]/table/tbody/tr[4]/td[7]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"campaignModal\"]/div[1]/div/form/div[3]/div[2]/button[1]")).click();


        //delete button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-campaigns/div[1]/div[2]/div[2]/table/tbody/tr[3]/td[7]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"delete-campaign-modal\"]/div/div/div/button[2]")).click();




  ////announcement
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/play-pointz-side-bar/div/ul/li[6]/a")).click();

        //new announcement
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-announcements/div/div[1]/div[2]/button")).click();

        //announcement name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"announcement-name\"]")).sendKeys("testing ");

        //description
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("automation");

        //type
        Thread.sleep(1000);
        WebElement dropdown10 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        Select select10 = new Select(dropdown10);
        select10.selectByValue("Text");

        //schedule
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"announce-schedule-btn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[2]/div[3]/div/button[1]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[1]/div/form/div[3]/div/button[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[1]/div/form/div[3]/div/button[1]")).click();

        //edit icon
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-announcements/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/button[1]")).click();

        //type
        Thread.sleep(2000);
        WebElement dropdown11 = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        Select select11 = new Select(dropdown11);
        select11.selectByValue("Image");

        //delete image
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[1]/div/form/div[2]/div[4]/div/button")).click();

        Thread.sleep(2000);
        Alert alertimage = driver.switchTo().alert();
        alertimage.dismiss();

        //schedule
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"announce-schedule-btn\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[2]/div[3]/div/button[2]")).click();

        //cancel
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"announcementModal\"]/div[1]/div/form/div[3]/div/button[1]")).click();

        //delete
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-announcements/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"delete-announcement-model\"]/div/div/div/button[2]")).click();

        //search bar
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-announcements/div/div[2]/div[1]/div/form/input")).sendKeys("Announcement 01", ENTER);




    ////users
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"headingThree\"]/button")).click();

        //user management
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Users-accord\"]/div/a[1]")).click();

        //add member
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-users/div/div[1]/div[2]/button")).click();

        //username
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test");

        //password
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"userModal\"]/div/div/form/div[2]/div[2]/button")).click();

        //email
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@gmail.com");

        //first name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"f-name\"]")).sendKeys("admin");

        //last name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"l-name\"]")).sendKeys("test");

        //role
        Thread.sleep(1000);
        WebElement dropdown12 = driver.findElement(By.xpath("//*[@id=\"role\"]"));
        Select select12 = new Select(dropdown12);
        select12.selectByValue("984595bb-9dc7-4e26-bafb-c4a88ba4c133");

        //active status
        Thread.sleep(2000);
        WebElement dropdown13 = driver.findElement(By.xpath("//*[@id=\"active-status\"]"));
        Select select13 = new Select(dropdown13);
        select13.selectByValue("true");

        //save
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"userModal\"]/div/div/form/div[3]/div/button[2]")).click();

        //cancel
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"userModal\"]/div/div/form/div[3]/div/button[1]")).click();

        //edit user
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-users/div/div[2]/div[2]/table/tbody/tr[2]/td[6]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"userModal\"]/div/div/form/div[3]/div/button[1]")).click();

        //search box
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-users/div/div[2]/div[1]/div/form/input")).sendKeys("test", ENTER);

        //user role
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"Users-accord\"]/div/a[2]")).click();

        //add user role
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-roles/div/div[1]/div[2]/button")).click();

        //role name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"role-name\"]")).sendKeys("test automation");

        //select box
        Thread.sleep(1000);
        WebElement dropdown14 =driver.findElement(By.xpath("//*[@id=\"permission\"]"));
        Select select14 = new Select(dropdown14);
        select14.selectByValue("1: '42910e99-f635-4abb-bac0-4cfdb179a2c9'");

        //save
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"roleModal\"]/div/div/form/div[3]/div/button[2]")).click();

        //cancel
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"roleModal\"]/div/div/form/div[3]/div/button[1]")).click();

        //edit icon
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-roles/div/div[2]/div/table/tbody/tr[1]/td[2]/button")).click();
        //cancel
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"roleModal\"]/div/div/form/div[3]/div/button[1]")).click();

    //complains

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/play-pointz-side-bar/div/ul/li[8]/a")).click();

        //taken action
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-user-reporting/div/div[2]/div[2]/table/tbody/tr[5]/td[4]/button[1]")).click();

        //action
        Thread.sleep(2000);
        WebElement dropdown16 = driver.findElement(By.xpath("//*[@id=\"action\"]"));
        Select select16 = new Select(dropdown16);
        select16.selectByValue("banned");

        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"disputeModal\"]/div/div/form/div[3]/div/button[2]")).click();

        //cancel
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"disputeModal\"]/div/div/form/div[3]/div/button[1]")).click();

        //ignore
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-user-reporting/div/div[2]/div[2]/table/tbody/tr[6]/td[4]/button[2]")).click();
        // driver.findElement(By.xpath("//*[@id=\"ignoreModal\"]/div/div/div/button[2]")).click();

    //settings

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"headingFour\"]/button")).click();

        //levels
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"settings-accord\"]/div/a")).click();

        //edit icon
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-levels/div/div[2]/div/table/tbody/tr[1]/td[4]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"quizModal\"]/div/div/form/div[3]/button[2]")).click();

        //save
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/main/div/play-pointz-quiz-levels/div/div[4]/div/form/button")).click();

    //super admin
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/play-pointz-nav-bar/div/nav/div/div[2]/div[3]")).click();

        //sign out
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/play-pointz-root/play-pointz-layout/play-pointz-nav-bar/div/nav/div/div[2]/div[5]/div/a[2]")).click();



















    }
}
