package Automation_AI03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Assignment_Weightwatcher {
    public static void main(String[] args) throws InterruptedException {

        //set up  your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define your chrome driver that you will use for testing
        ChromeOptions options = new ChromeOptions();


        //add maximize for windows
        //options.addArguments("start-maximized");
        //add --kiosk for mac
        //options;
        //options.addArguments("--kiosk");
        //add incognito mode to option
        options.addArguments("incognito");
        //add options to run driver on the background(headless)
        //options.addArguments("headless");


        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions

        WebDriver driver = new ChromeDriver(options);

        //string ArrayList for Zipcode
        ArrayList<String> Zipcode = new ArrayList<>();
        Zipcode.add("11221");
        Zipcode.add("11202");
        Zipcode.add("11225");

        //for loop
        for (int i=0; i < Zipcode.size(); i ++){

        //navigate to weight watcher workshop
        driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop");

        Thread.sleep(3000);


        //click on find workshop
           driver.findElement(By.xpath("//*[@data-e2e-name='find_a workshop']")).click();



        //click in person
        driver.findElement(By.xpath("//*[@class='iconWrapper-1dvW4']")).click();
        Thread.sleep(2000);

        //click on search, clear and automate Zipcode Arraylist.
        WebElement searchField = driver.findElement(By.xpath("//*[@id='location-search']"));
        searchField.clear();
        searchField.sendKeys(Zipcode.get(i));



        //click on search
        driver.findElement(By.xpath("//*[contains(@class, 'rightArrow')]")).submit();
        Thread.sleep(2000);


        //ArrayList of web elements
        ArrayList<WebElement> location = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class, 'linkUnderline')]")));

        //conditional statement
        if (i == 0) {
            location.get(1).click();
        }else if (i == 1) {
            location.get(2).click();
        } else {
            location.get(0).click();
        }//end of conditional statement



        //address
        String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
        System.out.println(address);


        //Scroll Studio workshops schedule into view
            WebElement calculate = driver.findElement(By.xpath("//div[contains(text),'schedule')]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",calculate);


        //Scroll down
        //jse.executeScript(0,800)");
        //WebElement scroll = driver.findElement(By.xpath("//*[contains(@class, announcementText')]"));
        //jse.executeScript("argument[0].scrollIntoView(true)", scroll);
        //Thread.sleep(2000);


        //Table of days and hours
        String schedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile - 1Rfmf']")).getText();
        //print schedule
        System.out.println(schedule);

    }//end of loop


    driver.quit();


}//end of main
}//end of class
