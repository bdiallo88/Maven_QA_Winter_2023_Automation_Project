package Day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_SelectDropdownByClick {
    public static void main(String[] args) throws  InterruptedException {




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
        //startMonthDropdown.selectByValue("4");
        //Select by index
        //startMonthDropdown.selectByIndex(3);



        //navigate to www.mortgagecalculator.org home page
        driver.navigate().to("https://www.mortgagecalculator.org");

        Thread.sleep(2000);


        //select month as April from the dropdown using select function
        //if the dropdown is not under select tag then click on dropdown first
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        Thread.sleep(1000);
        //click on dropdown value by using xpath text
        driver.findElement(By.xpath("//*[text()='Apr']")).click();


        //click on empty area to close the dropdown
        driver.findElement(By.xpath("//*[@class='content-area']")).click();













    }//end of main
}//end of class
