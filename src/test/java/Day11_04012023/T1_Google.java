package Day11_04012023;

import ReuseableLibrary.ReuseableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class T1_Google {
    //to make variable global you must declare it outside of the annotation methods

    WebDriver driver;
    //create before suite method to define your chrome driver

    @BeforeSuite
    public void SetUpDriver() {
        driver = ReuseableMethods.defineChromeDriver();
    }//end of before suite

    //@Test is replacement of the main method to execute your code
    public void GoogleSearchNumber() {
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        //enter bmw on search field
        ReuseableMethods.sendKeysMethod(driver, "//*[@name='q']", "BMW", "Search Field");
        //submit to google search
        ReuseableMethods.submitMethod(driver, "//[@name='btnK']", "Google Search");
        //capture the text and print out the number
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@id='result-stats']", "Search Results");
        String[] arrayResult = result.split("");
        System.out.println("Search number for BMW:" + arrayResult[1]);
    }//end of test

    //quit the driver
    @AfterSuite
    public void quitSession() {
        driver.quit();
    }//end of after suite
}//end of class




