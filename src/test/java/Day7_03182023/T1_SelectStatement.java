package Day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectStatement {
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


        //navigate to mortgagecalculator.org home page
        driver.navigate().to("https://www.mortgagecalculator.org");

        //put few seconds wait
        Thread.sleep(2000);

        //select start month as April from dropdown using select function
        //store the start month locator as a WebElement
        WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //call select function to store the dropdown locator
        Select startMonthDropdown = new Select(strMonth);
        //select by visible text
        startMonthDropdown.selectByVisibleText("Apr");
        //select by value
        startMonthDropdown.selectByValue("4");
        //Select by index
        //startMonthDropdown.selectByIndex(3);


    }//end of main
}//end of class
