package Automation_AI07;

import ReuseableLibrary.ReusableAnnotations;
import ReuseableLibrary.ReuseableMethods_Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Nationwide_Logger_Test_Cases extends ReusableAnnotations {

    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void defineReport() {
        reports = new ExtentReports("src/main/java/HTML_Report/automationReport.html", true);
    }//end of before suite


    @Test(priority = 1)
    public void searchforbankingandborrowing() {
        //give a name to the test
        logger = reports.startTest("search for banking and borrowing");
        //navigate to nationwide home page
        logger.log(LogStatus.INFO, "Navigate to Nationwide Home page");
        driver.navigate().to("https://www.nationwide.com");
        //click on search icon
        ReuseableMethods_Logger.clickMethod(driver, "//*[@id='search-component']", logger, "search icon");
        //click on file a claim
        ReuseableMethods_Logger.clickMethod(driver, "//a[contains(text(),'File a claim')]", logger, "File a claim");
        //Hover over personal
        ReuseableMethods_Logger.mouseHovermethod(driver, "//*[@class='desktop__tab nw-header__tab-personal desktop__tab--selected']", "Personal");
        //click on personal
        ReuseableMethods_Logger.clickMethod(driver, "//*[@class='desktop__tab nw-header__tab-personal desktop__tab--selected']", logger, "Personal");
        //click on Banking & Borrowing
        ReuseableMethods_Logger.clickMethod(driver, "//span[contains(text(),'Banking & borrowing')]", logger, "Banking and borrowing");
    }//end of test 1


    @Test(priority = 2)
    public void openpersonalcheckingaccount() throws InterruptedException {
        logger = reports.startTest("Open personal checking account");
        Thread.sleep(6000);
        //Hover over checking
        ReuseableMethods_Logger.mouseHovermethod(driver, "//a[contains(text(),'Checking')]", "Checking");
        //click on Checking
        ReuseableMethods_Logger.clickMethodByIndex(driver, "//a[contains(text(),'Checking')]", 0, logger,"Checking");
        Thread.sleep(6000);
        //navigate to "https://nationwide.axosbank.com/personal/checking")
        // I was having issues making a logger to switch to tabs so i tried this.
       driver.navigate().to("https://nationwide.axosbank.com/personal/checking");
       // Thread.sleep(6000);
        //Hover over "Open an account"
        ReuseableMethods_Logger.mouseHovermethod( driver,"//a[contains(text(),'Open an Account')]","Open An Account");
         //capture the search result
         String result = ReuseableMethods_Logger.captureTextMethod(driver, "//h1[contains(text(),'Checking Accounts')]", logger, "Checking Accounts");

    }//end of test 2



    @Test(priority = 3)
    public void getaquote()throws InterruptedException{
        logger= reports.startTest("Get a Quote");
        //Hover over Business
        ReuseableMethods_Logger.mouseHovermethod(driver,"//*('class@=main-menu-link')]","Business");
        Thread.sleep(2000);
        //Scroll down $0 lender fee
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,2000)");
        ReuseableMethods_Logger.scrollByElementMethod(driver, "//class@='dropdown-text')]","$0 lender fee");
        //Hover over Get a Quote
        ReuseableMethods_Logger.mouseHovermethod(driver, "//class@'sc-btn btn-primary')]","Get a Quote");
        //Click on Get a Quote
        ReuseableMethods_Logger.clickMethod(driver,"//class@'sc-btn btn-primary')]",logger,"Get a Quote");
    }//end of test 3



    @AfterSuite
    public void writeBacktoReport() {
        //end the logger for tests
        reports.endTest(logger);
        reports.flush();
    }//end of after suite




}//end of test































