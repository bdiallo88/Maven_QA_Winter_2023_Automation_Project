package Day9_03252023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_Mouse_Action {
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




        //navigate to usps.com home page
        driver.navigate().to("https://www.usps.com");

        //put few seconds wait
        //Thread.sleep(2000);


        //declare and define Mouse Actions
        Actions mouseAction = new Actions(driver);
        //hover to send tab to open up submodules/functionalities

        try{
            WebElement sendTab =driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
            mouseAction.moveToElement(sendTab).perform();
            System.out.println("Able to hover Send Tab");
        }catch (Exception e){
            System.out.println("Unable to hover to Send Tab:"+e);
        }//end of send tab exception



        //click on Tracking using mouse click
        try{
            WebElement trackingLink = driver.findElements(By.xpath("//*[text()='Tracking']")).get(0);
            mouseAction.moveToElement(trackingLink).click().perform();
            System.out.println("Able to click on Tracking");
        } catch (Exception e) {
            System.out.println("Unable to click on Tracking: " + e);
        }//end of tracking exception

        //type on Tracking Field using mouse click
        try{
            WebElement trackingField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
            mouseAction.moveToElement(trackingField).click().sendKeys("12345678").perform();
            System.out.println("Successfully type invalid tracking number on Tracking Input field");
        } catch (Exception e) {
            System.out.println("Unable to type on Tracking Input: " + e);
        }//end of tracking input exception














    }//end of main
}//end of class
