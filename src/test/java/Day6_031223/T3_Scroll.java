package Day6_031223;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Scroll {
    public static void main(String[] args) throws InterruptedException {

        //set up  your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define your chrome driver that you will use for testing
        ChromeOptions options = new ChromeOptions();


        //add maximize for windows
        //options.addArguments("start-maximized");
        //add --kiosk for mac
        //OptionsWithArguments options;
        options.addArguments("--kiosk");
        //add incognito mode to option
        options.addArguments("incognito");
        //add options to run driver on the background(headless)
        options.addArguments("headless");


        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions

        WebDriver driver = new ChromeDriver(options);


        //navigate to mlcalc home page
        driver.navigate().to("https://www.mlcalc.com");


        Thread.sleep(2000);


        //scroll to the bottom to click on mortgage rate
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll using pixels
        jse.executeScript("scroll(0,3000)");

        //Thread.sleep(1000);


        //scrolling back up again
        jse.executeScript("scroll(0,-3000)");

        //Thread.sleep(1500);

        //scroll down again using pixels
        jse.executeScript("scroll(0,3000)");

        //click on mortgage rate link
        driver.findElements(By.xpath("//a[text() ='Mortgage Rates']")).get(1).click();

        driver.quit();


    }//end// of main
}//end of class
