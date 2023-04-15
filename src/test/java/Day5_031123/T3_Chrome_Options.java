package Day5_031123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Chrome_Options {
    public static void main(String[] args) throws InterruptedException{


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

        //navigate to yahoo.home page
        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(2000);

        //click on sign link
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();

        Thread.sleep(3000);

        //print out sign in to yahoo text
        String result = driver.findElement(By.xpath("//*[contains(text(),'Sign')]")).getText();
        System.out.println("Result: " + result);

        driver.quit();


    }//end of main


}//end of class
