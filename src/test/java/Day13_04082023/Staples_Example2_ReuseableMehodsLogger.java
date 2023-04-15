package Day13_04082023;

import ReuseableLibrary.ReusableAnnotations;
import ReuseableLibrary.ReuseableMethods_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class Staples_Example2_ReuseableMehodsLogger extends ReusableAnnotations {




    @Test(priority = 1)
    public void searchIphoneOnStaples() {
        logger.log(LogStatus.INFO, "Navigate to Staples home page");
        //navigate to staples home page
        //something wrong with staples website!!!
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        ReuseableMethods_Logger.sendKeysMethod(driver, "//*[@id='searchInput']", "iphone", logger, "Search Field");

        //click on the search icon
        ReuseableMethods_Logger.clickMethod(driver, "//*[@class='search-bar-input__searchIcon']", logger, "Search Icon");
    }//end of test 1

    @Test(priority = 2)
    public void printOutSearchResultsForIphone() throws InterruptedException {
        //click on first image by index
        ReuseableMethods_Logger.clickMethodByIndex(driver, "//*[@class='standard-tile__image standard-tile__image_hover']", 0, logger, "Iphone Image");

        //click on add to the cart button
        ReuseableMethods_Logger.clickMethodByIndex(driver, "//*[@id='ctaButton']", 0, logger, "Add to cart");

        //capture the starting price and print it out
        Thread.sleep(3000);
        String result = ReuseableMethods_Logger.captureTextMethod(driver, "//[contains(text(),'starting at')]", logger, "Starting Price");
        //made fail on purpose
        System.out.println("Iphone result is " + result);
        logger.log(LogStatus.INFO, "Iphone result is " + result);
    }//end of test 2





}//end of class



















