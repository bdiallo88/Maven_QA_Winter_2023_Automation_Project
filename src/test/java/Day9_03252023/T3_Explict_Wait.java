package Day9_03252023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T3_Explict_Wait {
    public static void main(String[] args) throws InterruptedException{




        //set up  your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define your chrome driver that you will use for testing
        ChromeOptions options = new ChromeOptions();


        //add maximize for windows
        //options.addArguments("start-maximized");
        //add --kiosk for mac
        //OptionsWithArguments options;
       // options.addArguments("--kiosk");
        //add incognito mode to option
        options.addArguments("incognito");
        //add options to run driver on the background(headless)
        //options.addArguments("headless");


        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions

        WebDriver driver = new ChromeDriver(options);

        //set maximized for mac users
        driver.manage().window().maximize();


        //navigate to usps.com home page
        driver.navigate().to("https://www.ups.com/us");


        //declare the explicit wait command
        WebDriverWait wait = new WebDriverWait(driver,20);

        //click on shipping
        //your explicit wait condition replaces your driver.findElement(s)
        //presenceofAllElementsLocatedBy is same as findElements
        Thread.sleep(4000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mainNavDropdown1']"))).click();


        //click on Schedule a Pickup
        //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Schedule a Pickup']"))).click();

        //enter a tracking number on the box
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='tracknumlist']"))).sendKeys("1234455555");












    }//end of main
}//end of class
